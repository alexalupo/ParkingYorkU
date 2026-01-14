package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.csvreader.CsvReader;

import observer.UpdateCSV;
import template.Student;

import static service.UserService.totalCost;

class CSVTest extends BaseTest {
	private CsvReader reader;
	private List<String[]> list = new ArrayList<>();
	private String[] actual;
	
	String[] studentArr = {"Bob", "0", "bob@email.com", "1234", "f", "student"};
	String[] facultyArr = {"Andrew", "1", "andrew@email.com", "1234", "f", "faculty"};
	String[] nonfacultyArr = {"Dummy", "2", "dummy@email.com", "1234", "f", "nonfaculty"};
	String[] visitorArr = {"Batman", "3", "bat@email.com", "1234", "f", "visitor"};
	
	String[] parkingLotArr = {"0", "North", "f"};
	String[] parkingSpaceArr = {"0", "0", "f", "f"};
	
	String[] bookArr = {"0", "0", "0", "0", "0", "10", "paypal", "0", "123456"};
	
	@Test
	public void testUpdateUser() throws IOException {
		list.add(studentArr);
		list.add(facultyArr);
		list.add(nonfacultyArr);
		list.add(visitorArr);
		
		UpdateCSV.updateUser(userPath, list);
		
		reader = new CsvReader(userPath);
		reader.readHeaders();
		
		for (String[] row : list) {
			reader.readRecord();
			
			assertEquals(row[0], reader.get("name"));
			assertEquals(row[1], reader.get("id"));
			assertEquals(row[2], reader.get("email"));
			assertEquals(row[3], reader.get("password"));
			assertEquals(row[4], reader.get("isValidated"));
			assertEquals(row[5], reader.get("userType"));
		}
	}
	
	@Test
	public void testUpdateParkingLot() throws IOException {
		String[] lot2 = {"1", "f", "south"};
		String[] lot3 = {"2", "t", "west"};
		String[] lot4 = {"3", "t", "east"};
		
		list.add(parkingLotArr);
		list.add(lot2);
		list.add(lot3);
		list.add(lot4);
		
		UpdateCSV.updateParkingLot(parkLotPath, list);
		
		reader = new CsvReader(parkLotPath);
		reader.readHeaders();
		
		for (String[] row : list) {
			reader.readRecord();
			assertEquals(row[0], reader.get("lotID"));
			assertEquals(row[1], reader.get("lotName"));
			assertEquals(row[2], reader.get("isDisabled"));
		}
	}
	
	@Test
	public void testParkingSpace() throws IOException {
		String[] space2 = {"1", "0", "f", "f"};
		String[] space3 = {"2", "0", "f", "f"};
		String[] space4 = {"3", "0", "f", "f"};
		
		list.add(parkingSpaceArr);
		list.add(space2);
		list.add(space3);
		list.add(space4);
		
		UpdateCSV.updateParkingSpace(parkSpacePath, list);
		
		reader = new CsvReader(parkSpacePath);
		
		reader.readHeaders();
		
		for (String[] row : list) {
			reader.readRecord();
			
			assertEquals(row[0], reader.get("spaceID"));
			assertEquals(row[1], reader.get("lotID"));
			assertEquals(row[2], reader.get("isTaken"));
			assertEquals(row[3], reader.get("isDisabled"));
		}
	}
	
	@Test
	public void testUpdateBooking() throws IOException {
		student = new Student("dummy", 0, "dummy@email.com", "1234", false);
		int total = totalCost(startTime, endTime, student.getPayRate());
		
		String userID = Integer.toString(student.getId());
		
		String[] book2 = {"1", userID, "1", "0", "0", "10", "paypal", Integer.toString(total), "123456"};
		String[] book3 = {"2", userID, "2", "0", "2", "15", "paypal", Integer.toString(total), "111111"};
		String[] book4 = {"3", userID, "3", "0", "10", "20", "paypal", Integer.toString(total), "654321"};
		
		list.add(bookArr);
		list.add(book2);
		list.add(book3);
		list.add(book4);
		
		UpdateCSV.updateBooking(bookPath, list);
		
		reader = new CsvReader(bookPath);
		reader.readHeaders();
		reader.readRecord();
		
		assertEquals(list.get(0)[0], reader.get("bookingID"));
		assertEquals(list.get(0)[1], reader.get("userID"));
		assertEquals(list.get(0)[2], reader.get("spaceID"));
		assertEquals(list.get(0)[3], reader.get("lotID"));
		assertEquals(list.get(0)[4], reader.get("startTime"));
		assertEquals(list.get(0)[5], reader.get("endTime"));
		assertEquals(list.get(0)[6], reader.get("paymentMethod"));
		assertEquals(list.get(0)[7], reader.get("paymentAmount"));
		assertEquals(list.get(0)[8], reader.get("licensePlate"));
		
		reader.close();
	}
	
	@Test
	public void updateNullValues() {
		assertThrows(NullPointerException.class, () -> {
			UpdateCSV.updateUser(userPath, null);
		});
		
		assertThrows(NullPointerException.class, () -> {
			UpdateCSV.updateParkingLot(parkLotPath, null);
		});
		
		assertThrows(NullPointerException.class, () -> {
			UpdateCSV.updateParkingLot(parkSpacePath, null);
		});
		
		assertThrows(NullPointerException.class, () -> {
			UpdateCSV.updateBooking(bookPath, null);
		});
	}
	
	@Test
	public void updateNullRows() {
		assertThrows(NullPointerException.class, () -> {
			UpdateCSV.updateUser(null, list);
		});
		
		assertThrows(NullPointerException.class, () -> {
			UpdateCSV.updateParkingLot(null, list);
		});
		
		assertThrows(NullPointerException.class, () -> {
			UpdateCSV.updateParkingSpace(null, list);
		});
		
		assertThrows(NullPointerException.class, () -> {
			UpdateCSV.updateBooking(null, list);
		});
	}
	
	@Test
	public void updateUserEmptyList() throws IOException {
		UpdateCSV.updateUser(userPath, list);
		
		reader = new CsvReader(userPath);
		reader.readHeaders();
		
		String[] actual = reader.getHeaders();
		
		int i = 0;
		for (String ele : actual) {
			assertEquals(userHeader[i], ele);
			i++;
		}
		
		reader.close();
	}
	
	@Test
	public void updateParkLotEmptyList() throws IOException {
		UpdateCSV.updateParkingLot(parkLotPath, list);
		
		reader = new CsvReader(parkLotPath);
		reader.readHeaders();
		
		actual = reader.getHeaders();
		
		int i = 0;
		for (String ele : actual) {
			assertEquals(parkLotHeader[i], ele);
			i++;
		}
		
		reader.close();
	}
	
	@Test
	public void updateParkSpaceEmptyList() throws IOException {
		UpdateCSV.updateParkingSpace(parkSpacePath, list);
		
		reader = new CsvReader(parkSpacePath);
		reader.readHeaders();
		
		actual = reader.getHeaders();
		
		int i = 0;
		for (String ele : actual) {
			assertEquals(parkSpaceHeader[i], ele);
			i++;
		}
		
		reader.close();
	}
	
	@Test
	public void updateBookingEmptyList() throws IOException {
		UpdateCSV.updateBooking(bookPath, list);
		
		reader = new CsvReader(bookPath);
		reader.readHeaders();
		
		actual = reader.getHeaders();
		
		int i = 0;
		for (String ele : actual) {
			assertEquals(bookHeader[i], ele);
			i++;
		}
		
		reader.close();
	}
	
	@Test
	public void emptyStringPath() {
		list.add(studentArr);
		
		assertThrows(FileNotFoundException.class, () -> {
			UpdateCSV.updateUser("", list);
		});
		
		assertThrows(FileNotFoundException.class, () -> {
			UpdateCSV.updateParkingLot("", list);
		});
		
		assertThrows(FileNotFoundException.class, () -> {
			UpdateCSV.updateParkingSpace("", list);
		});
		
		assertThrows(FileNotFoundException.class, () -> {
			UpdateCSV.updateBooking("", list);
		});
	}
	
	@Test
	public void incorrectStringPath() {
		String invalidPath = "Dummy Path";
		File file = new File(invalidPath);
		
		assertFalse(file.exists());
		
		assertThrows(FileNotFoundException.class, () -> {
			list.add(studentArr);
			UpdateCSV.updateUser(invalidPath, list);
		});
		
		assertThrows(FileNotFoundException.class, () -> {
			list.add(parkingLotArr);
			UpdateCSV.updateParkingLot(invalidPath, list);
		});
		
		assertThrows(FileNotFoundException.class, () -> {
			list.add(parkingSpaceArr);
			UpdateCSV.updateParkingSpace(invalidPath, list);
		});
		
		assertThrows(FileNotFoundException.class, () -> {
			list.add(bookArr);
			UpdateCSV.updateBooking(invalidPath, list);
		});
	}
	
	@Test
	public void duplicateUserID() throws IOException {
		String[] duplicateStudent = studentArr.clone();
		
		list.add(duplicateStudent);
		list.add(studentArr);
		
		assertThrows(IllegalArgumentException.class, () -> {
			UpdateCSV.updateUser(userPath, list);
		});
	}
	
	@Test
	public void duplicateBookID() throws IOException {
		String[] duplicateBook = bookArr.clone();
		
		list.add(bookArr);
		list.add(duplicateBook);
		
		assertThrows(IllegalArgumentException.class, () -> {
			UpdateCSV.updateBooking(bookPath, list);
		});
	}
	
	@Test
	public void duplicateParkSpaceID() throws IOException {
		String[] duplicateSpace = parkingSpaceArr.clone();
		
		list.add(parkingSpaceArr);
		list.add(duplicateSpace);
		
		assertThrows(IllegalArgumentException.class, () -> {
			UpdateCSV.updateParkingSpace(parkSpacePath, list);
		});
	}
	
	@Test
	public void negativeID() throws IOException {
		String[] duplicateStudent = studentArr.clone();
		String[] duplicateLot = parkingLotArr.clone();
		String[] duplicateSpace = parkingSpaceArr.clone();
		String[] duplicateBook = bookArr.clone();
		
		duplicateStudent[1] = "-100";
		duplicateLot[0] = "-100";
		duplicateSpace[0] = "-100";
		duplicateBook[0] = "-100";
		
		assertThrows(IllegalArgumentException.class, () -> {
			list.add(duplicateStudent);
			UpdateCSV.updateUser(userPath, list);
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			list.add(duplicateLot);
			UpdateCSV.updateParkingLot(parkLotPath, list);
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			list.add(duplicateSpace);
			UpdateCSV.updateParkingSpace(parkSpacePath, list);
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			list.add(duplicateBook);
			UpdateCSV.updateBooking(bookPath, list);
		});
	}
}
