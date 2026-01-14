package junitTest;


import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.csvreader.CsvReader;

import factory.PaymentOption;
import observer.Booking;
import observer.ParkingLot;
import observer.ParkingSpace;
import service.ManagerService;
import service.UserService;
import template.FacultyMember;
import template.Student;
import template.User;

class ManagerServiceTest extends BaseTest {
	private CsvReader reader;
	private UserService userService = new UserService();
	private ManagerService managerService = new ManagerService();
	
	@BeforeEach
	public void setUp() throws IOException {
		super.setUp();
		
		parkingLot = new ParkingLot(0, true, location);
		faculty = new FacultyMember("Doofenschmitz", 1, "doof@email.com", password, false);
	}
	
	@Test
	public void addParkingLot() throws IOException {
		int lotID = 0;
		int spaceID = 0;
		managerService.addParkingLot(parkLotPath, parkSpacePath, parkingLot);
		
		reader = new CsvReader(userPath); 
		
		reader.readHeaders();
		while(reader.readRecord()) {
			assertEquals(location, reader.get("lotName"));
			assertEquals(Integer.toString(lotID), reader.get(lotID));
			assertEquals(Integer.toString(spaceID), reader.get(spaceID));
			assertEquals("f", reader.get("isDisabled"));
			assertEquals("f", reader.get("isTaken"));
			spaceID++;
		}
		reader.close();
	}
	
	@Test
	public void getLotID() throws IOException {
		ParkingLot lot1 = new ParkingLot(1, true, "Bind");
		ParkingLot lot2 = new ParkingLot(2, true, "Fracture");
		
		managerService.addParkingLot(parkLotPath, parkSpacePath, parkingLot);
		managerService.addParkingLot(parkLotPath, parkSpacePath, lot1);
		managerService.addParkingLot(parkLotPath, parkSpacePath, lot2);
		
		String result = managerService.getLotIDByLotName(parkLotPath, "Bind");
		
		assertEquals(lot1.getId(), Integer.parseInt(result));
	}
	
	@Test
	public void deleteParkingLot() throws IOException {
		ParkingLot lot2 = new ParkingLot(2, true, "Fracture");
		
		managerService.addParkingLot(parkLotPath, parkSpacePath, parkingLot);
		managerService.addParkingLot(parkLotPath, parkSpacePath, lot2);
		managerService.removeParkingLot(parkLotPath, parkSpacePath, bookPath, location);
		
		reader = new CsvReader(parkLotPath);
		reader.readHeaders();
		
		reader.readRecord();
		assertFalse(reader.readRecord());
	}
	
	@Test
	public void deleteNonExistentParkingLot() throws IOException {
		assertThrows(IOException.class, () -> {
			managerService.removeParkingLot(parkLotPath, parkSpacePath, bookPath, "doofenschmirtz");
		});
	}
	
	@Test
	public void disableParkingLot() throws IOException {
		managerService.addParkingLot(parkLotPath, parkSpacePath, parkingLot);
		managerService.parkingLotEnableDisable(parkLotPath, parkSpacePath, bookPath, location, false);
		
		reader = new CsvReader(parkLotPath);
		reader.readHeaders();
		
		while (reader.readRecord()) {
			assertEquals("t", reader.get("isDisabled"));
		}
	}
	
	@Test
	public void disableParkingSpace() throws IOException {
		managerService.addParkingLot(parkLotPath, parkSpacePath, parkingLot);
		
		String lotID = "0";
		int num = 10;
		int i = 0;
		
		managerService.parkingSpaceEnableDisable(parkSpacePath, bookPath, lotID, Integer.toString(num), false);
		
		reader = new CsvReader(parkSpacePath);
		reader.readHeaders();
		
		while (reader.readRecord()) {
			if (i == num) {
				assertEquals("t", reader.get("isDisabled"));
			}
			i++;
		}
	}
	
	@Test
	public void disableNonExistentParkingLot() throws IOException {
			assertFalse(managerService.parkingLotEnableDisable(parkLotPath, parkSpacePath, bookPath, location, false));
	}
	
	@Test
	public void disableNonExistentParkingSpace() throws IOException {
		managerService.addParkingLot(parkLotPath, parkSpacePath, parkingLot);
		assertThrows(IOException.class, () -> {
			String lotID = "0";
			String spaceID = "9999";
			managerService.parkingSpaceEnableDisable(parkSpacePath, bookPath, lotID, spaceID, true);
		});
	}
	
	@Test
	public void validateUser() throws IOException {
		int id = userService.getNextId(userPath);
		faculty.setName("John");
		faculty.setId(id);
		faculty.setEmail("john@email.com");
		faculty.setPassword("1234");
		faculty.setValidated(true);
		
		userService.createUser(userPath, faculty);
		
		managerService.validateUser(userPath, faculty.getEmail(), true);
		
		reader = new CsvReader(userPath);
		reader.readHeaders();
		reader.readRecord();
		
		assertEquals("t", reader.get("isValidated"));
		
		reader.close();
	}
	
	@Test
	public void validateNonExistentUser() {
		assertThrows(IOException.class, () -> {
			managerService.validateUser(userPath, "dummy@email.com", false);
		});
	}
	
	@Test
	public void duplicateLotLocation() throws IOException {
		
		managerService.addParkingLot(parkLotPath, parkSpacePath, parkingLot);
		
		assertThrows(IOException.class, () -> {
			managerService.addParkingLot(parkLotPath, parkSpacePath, parkingLot);
		});
		
	}
	
	@Test
	public void bookingInRecentlyDeletedLot() throws IOException {
		Student user = new Student("name", 0, "mail@email.com", "password", true);
		ParkingLot lot2 = new ParkingLot(2, true, "Fracture");
		managerService.addParkingLot(parkLotPath, parkSpacePath, parkingLot);
		userService.createBooking(bookPath, parkSpacePath, new Booking(0, user, parkingLot, parkingLot.getSpaces()[1], 0, 1, paypal, "111111"));
		userService.createBooking(bookPath, parkSpacePath, new Booking(0, user, lot2, lot2.getSpaces()[2], 0, 1, paypal, "111111"));
		managerService.removeParkingLot(parkLotPath, parkSpacePath, bookPath, location);
		
		reader = new CsvReader(bookPath);
		reader.readHeaders();
		reader.readRecord();
		assertFalse(reader.readRecord());
	}
	
	@Test
	public void bookingInRecentlyDisabledLot() throws IOException {
		Student user = new Student("name", 0, "mail@email.com", "password", true);
		ParkingLot lot2 = new ParkingLot(2, true, "Fracture");
		managerService.addParkingLot(parkLotPath, parkSpacePath, parkingLot);
		userService.createBooking(bookPath, parkSpacePath, new Booking(0, user, parkingLot, parkingLot.getSpaces()[1], 0, 1, paypal, "111111"));
		userService.createBooking(bookPath, parkSpacePath, new Booking(0, user, lot2, lot2.getSpaces()[2], 0, 1, paypal, "111121"));
		managerService.parkingLotEnableDisable(parkLotPath, parkSpacePath, bookPath, location, false);
		
		reader = new CsvReader(bookPath);
		reader.readHeaders();
		reader.readRecord();
		assertFalse(reader.readRecord());
	}
}
