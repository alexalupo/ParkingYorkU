package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.csvreader.CsvReader;

import factory.PaymentFactory;
import observer.Booking;
import observer.ParkingLot;
import observer.ParkingSpace;
import service.*;
import template.FacultyMember;
import template.Manager;
import template.NonFacultyMember;
import template.Student;
import template.User;
import template.Visitor;

import static service.UserService.totalCost;

class UserServiceTest extends BaseTest {
	private CsvReader reader;
	private final UserService userService = new UserService();
	private final ManagerService managerService = new ManagerService();
	
	@BeforeEach
	public void setUp() throws IOException {
		super.setUp();
		
		student = new Student("Andrew", 0, "andrew@email.com", password, false);
		faculty = new FacultyMember("Doofenschmitz", 1, "doof@email.com", password, false);
		nonfaculty = new NonFacultyMember("dummy", 2, "dummy@email.com", password, false);
		visitor = new Visitor("Bat Man", 3, "no@email.com", password, false);
		manager = new Manager("noob", 4, "noob@email.com", password, true);
		
		paypal = PaymentFactory.createPayment("paypal");
		
		parkingLot = new ParkingLot(0, true, location);
		booking = new Booking(0, faculty, parkingLot, parkingLot.getSpaces()[0], 
				startTime, endTime, paypal, license);
	}
	
	@Test
	public void createUser() throws IOException {
		userService.createUser(userPath, faculty);
		
		reader = new CsvReader(userPath); 
		
		reader.readHeaders();
		while(reader.readRecord()) {
			assertEquals(faculty.getName(), reader.get("name"));
			assertEquals(Integer.toString(faculty.getId()), reader.get("id"));
			assertEquals(faculty.getEmail(), reader.get("email"));
			assertEquals(faculty.getPassword(), reader.get("password"));
			assertEquals("f", reader.get("isValidated"));
			assertEquals(faculty.getUserType(), reader.get("userType"));
		}
		reader.close();
	}
	
	@Test
	public void getListOfUser() throws IOException {
		
		ArrayList<User> listOfUsers = new ArrayList<>();
		
		listOfUsers.add(student);
		listOfUsers.add(faculty);
		listOfUsers.add(nonfaculty);
		listOfUsers.add(visitor);
		listOfUsers.add(manager);
		
		for (User user : listOfUsers) {
			userService.createUser(userPath, user);
		}
		
		reader = new CsvReader(userPath);
		reader.readHeaders();
		
		for (User user : listOfUsers) {
			reader.readRecord();
			assertEquals(Integer.toString(user.getId()), reader.get("id"));
			assertEquals(user.getName(), reader.get("name"));
			assertEquals(user.getEmail(), reader.get("email"));
			assertEquals(user.getPassword(), reader.get("password"));
			
			if (user instanceof Manager) {
				assertEquals("t", reader.get("isValidated"));
			} else {
				assertEquals("f", reader.get("isValidated"));
			}
			
			assertEquals(user.getUserType(), reader.get("userType"));
		}
		reader.close();
	}
	
	@Test
	public void createBooking() throws IOException {
		managerService.addParkingLot(parkLotPath, parkSpacePath, parkingLot);
		
		userService.createBooking(bookPath, parkSpacePath, booking);
		
		reader = new CsvReader(bookPath);
		reader.readHeaders();
		
		while (reader.readRecord()) {
			String bookingID = Integer.toString(booking.getId());
			String userID = Integer.toString(booking.getUser().getId());
			String lotID = Integer.toString(booking.getParkingLot().getId());
			String spaceID = Integer.toString(booking.getParkingSpace().getId());
			String startTime = Integer.toString(booking.getStartTime());
			String endTime = Integer.toString(booking.getEndTime());
			String licensePlate = booking.getLicense();
			
			
			assertEquals(bookingID, reader.get("bookingID"));
			assertEquals(userID, reader.get("userID"));
			assertEquals(lotID, reader.get("lotID"));
			assertEquals(spaceID, reader.get("spaceID"));
			assertEquals(startTime, reader.get("startTime"));
			assertEquals(endTime, reader.get("endTime"));
			assertEquals(licensePlate, reader.get("licensePlate"));
			
		}
		reader.close();
	}
	
	@Test
	public void getAllUserBookings() throws IOException {
		managerService.addParkingLot(parkLotPath, parkSpacePath, parkingLot);
		
		ParkingSpace space2 = new ParkingSpace(1, location, false, false, parkingLot);
		ParkingSpace space3 = new ParkingSpace(2, location, false, false, parkingLot);
		
		Booking booking1 = new Booking(1, faculty, parkingLot, space2, startTime, endTime, paypal, license);
		Booking booking2 = new Booking(2, faculty, parkingLot, space3, startTime, endTime, paypal, license);
		
		userService.createBooking(bookPath, parkSpacePath, booking);
		userService.createBooking(bookPath, parkSpacePath, booking1);
		userService.createBooking(bookPath, parkSpacePath, booking2);
		
		ArrayList<Booking> list = userService.getUserBookings(bookPath, parkSpacePath, faculty);
		int i = 0;
		reader = new CsvReader(bookPath);
		
		reader.readHeaders();
		while (reader.readRecord()) {
			Booking booking = list.get(i);
			
			assertEquals(Integer.toString(booking.getUser().getId()), reader.get("userID"));
			assertEquals(Integer.toString(booking.getId()), reader.get("bookingID"));
			assertEquals(Integer.toString(booking.getStartTime()), reader.get("startTime"));
			assertEquals(Integer.toString(booking.getEndTime()), reader.get("endTime"));
			assertEquals("paypal", reader.get("paymentMethod"));
			assertEquals(booking.getLicense(), reader.get("licensePlate"));
			
			i++;
		}
		
		reader.close();
	}
	
	@Test
	public void deleteBooking() throws IOException {
		managerService.addParkingLot(parkLotPath, parkSpacePath, parkingLot);
		
		userService.createBooking(bookPath, parkSpacePath, booking);
		booking.setPaymentOption(paypal);
		booking.setLicense(license);
		
		reader = new CsvReader(bookPath);
		
		userService.deleteBooking(bookPath, parkSpacePath, booking);
		
		reader.readHeaders();
		assertFalse(reader.readRecord());
		reader.close();
	}
	
	@Test
	public void extendBooking() throws IOException {
		managerService.addParkingLot(parkLotPath, parkSpacePath, parkingLot);
		
		userService.createBooking(bookPath, parkSpacePath, booking);
		
		int newTime = 20;
		
		userService.editBookingTime(bookPath, booking, newTime, paypal);
		
		reader = new CsvReader(bookPath);
		reader.readHeaders();
		
		while (reader.readRecord()) {
			assertEquals(Integer.toString(newTime), reader.get("endTime"));
		}

		reader.close();
	}
	
	@Test
	public void bookIntoADisabledSpace() throws IOException {
		managerService.addParkingLot(parkLotPath, parkSpacePath, parkingLot);
		managerService.parkingLotEnableDisable(parkLotPath, parkSpacePath, bookPath, location, false);
		
		assertThrows(IOException.class, () -> {
			userService.createBooking(bookPath, parkSpacePath, booking);
		});
	}
	
	@Test
	public void deleteNonExistentBooking() throws IOException {
		assertThrows(IOException.class, () -> {
			userService.deleteBooking(bookPath, parkSpacePath, booking);
		});
	}
	
	@Test
	public void incorrectTime() {
		int rate = faculty.getPayRate();
		
		assertThrows(IllegalArgumentException.class, () -> {
			int startTime = 10;
			int endTime = 5;
			totalCost(startTime, endTime, rate);
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			int startTime = 0;
			int endTime = 0;
			totalCost(startTime, endTime, rate);
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			int startTime = -10;
			int endTime = 20;
			
			totalCost(startTime, endTime, rate);
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			int startTime = 0;
			int endTime = 9999;
			
			totalCost(startTime, endTime, rate);
		});
	}
	
	@Test
	public void extendNegativeTime() throws IOException {
		managerService.addParkingLot(parkLotPath, parkSpacePath, parkingLot);
		
		userService.createBooking(bookPath, parkSpacePath, booking);
		
		int newTime = -20;
		
		assertThrows(IOException.class, () -> {
			userService.editBookingTime(bookPath, booking, newTime, paypal);
		});
	}
	
	@Test
	public void createNullUser() {
		assertThrows(NullPointerException.class, () -> {
			userService.createUser(userPath, null);
		});
	}
	
	@Test
	public void incorrectLicensePlate() throws IOException {
		managerService.addParkingLot(parkLotPath, parkSpacePath, parkingLot);
		
		assertThrows(IllegalArgumentException.class, () -> {
			booking.setLicense("Driver License");
			userService.createBooking(bookPath, parkSpacePath, booking);
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			booking.setLicense("      ");
			userService.createBooking(bookPath, parkSpacePath, booking);
		});
	}
	
	@Test
	public void bookingWithNullValues() throws IOException {
		managerService.addParkingLot(parkLotPath, parkSpacePath, parkingLot);
		
		assertThrows(NullPointerException.class, () -> {
			booking.setParkingSpace(null);
			userService.createBooking(bookPath, parkSpacePath, booking);
		});
		
		assertThrows(NullPointerException.class, () -> {
			booking.setParkingLot(null);
			userService.createBooking(bookPath, parkSpacePath, booking);
		});
		
		assertThrows(NullPointerException.class, () -> {
			booking.setUser(null);
			userService.createBooking(bookPath, parkSpacePath, booking);
		});
		
		assertThrows(NullPointerException.class, () -> {
			booking.setLicense(null);
			userService.createBooking(bookPath, parkSpacePath, booking);
		});
	}
	
	@Test
	public void getNextId() throws IOException {
		managerService.addParkingLot(parkLotPath, parkSpacePath, parkingLot);
		
		int id = userService.getNextId(parkLotPath);
		
		assertEquals(1, id);
	}
	
	@Test
	public void getParkingLots() throws IOException {
		managerService.addParkingLot(parkLotPath, parkSpacePath, parkingLot);
		
		ParkingLot lot2 = new ParkingLot(userService.getNextId(parkLotPath), false, "south");
		managerService.addParkingLot(parkLotPath, parkSpacePath, lot2);
		
		ParkingLot lot3 = new ParkingLot(userService.getNextId(parkLotPath), true, "west");
		managerService.addParkingLot(parkLotPath, parkSpacePath, lot3);
		
		int total = userService.getParkingLots(parkLotPath);
		
		assertEquals(2, total);
	}
	
	@Test
	public void invalidPath() throws IOException {
		String invalidPath = "Dummy Path";
		
		assertThrows(IOException.class, () -> {
			userService.createUser(invalidPath, faculty);
		});
		
		assertThrows(IOException.class, () -> {
			userService.createBooking(invalidPath, parkSpacePath, booking);
		});
		
		assertThrows(IOException.class, () -> {
			userService.createBooking(bookPath, invalidPath, booking);
		});
		
		assertThrows(IOException.class, () -> {
			userService.checkIfDisabled(invalidPath, "1");
		});
		
		assertThrows(IOException.class, () -> {
			userService.deleteBooking(invalidPath, parkSpacePath, booking);
		});
		
		assertThrows(IOException.class, () -> {
			userService.deleteBooking(bookPath, invalidPath, booking);
		});
		
		assertThrows(IOException.class, () -> {
			userService.editBookingTime(invalidPath, booking, endTime, paypal);
		});
		
		assertThrows(IOException.class, () -> {
			userService.getUserBookings(invalidPath, parkSpacePath, faculty);
		});
		
		assertThrows(IOException.class, () -> {
			userService.getNextId(invalidPath);
		});
		
		assertThrows(IOException.class, () -> {
			userService.getParkingLotByID(invalidPath, parkSpacePath, 0);
		});
		
		assertThrows(IOException.class, () -> {
			userService.getParkingLots(invalidPath);
		});
	}
	
	@Test
	public void getTotalCost() {
		int total = totalCost(startTime, endTime, student.getPayRate());
		
		assertEquals(50, total);
	}
	
	@Test
	public void checkDisabledSpace() throws IOException {
		ParkingLot lot2 = new ParkingLot(1, false, "south");
		
		managerService.addParkingLot(parkLotPath, parkSpacePath, parkingLot);
		managerService.addParkingLot(parkLotPath, parkSpacePath, lot2);
		
		String lotID = Integer.toString(parkingLot.getId());
		String lotID2 = Integer.toString(lot2.getId());
		
		managerService.parkingLotEnableDisable(parkLotPath, parkSpacePath, 
				bookPath, parkingLot.getLocation(), false);
		
		assertTrue(userService.checkIfDisabled(parkLotPath, lotID));
		assertFalse(userService.checkIfDisabled(parkLotPath, lotID2));
	}
}
