package junitTest;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.io.FileWriter;

import org.junit.jupiter.api.*;

import com.csvreader.CsvWriter;

import factory.PaymentOption;
import observer.Booking;
import observer.ParkingLot;
import observer.ParkingSpace;
import singleton.SuperManager;
import template.FacultyMember;
import template.Manager;
import template.NonFacultyMember;
import template.Student;
import template.Visitor;

// This Junit class is a set up for all the other tests
// Extend this to all other Junit test classes
class BaseTest {
	protected Student student;
	protected FacultyMember faculty;
	protected NonFacultyMember nonfaculty;
	protected Visitor visitor;
	protected Manager manager;
	protected SuperManager superManager;
	
	protected final String password = "1234";
	
	String location = "North";
	protected ParkingLot parkingLot;
	protected ParkingSpace parkingSpace;
	
	
	int startTime = 0;
	int endTime = 10;
	
	String license = "123456";
	PaymentOption paypal; 
	protected Booking booking;
	
	protected static File userFile;
	protected static File bookFile;
	protected static File parkLotFile;
	protected static File parkSpaceFile;
	
	protected static String userPath;
	protected static String bookPath;
	protected static String parkLotPath;
	protected static String parkSpacePath;
	
	
	protected static final String[] userHeader = {"name", "id", "email", "password", "isValidated", "userType"};
	protected static final String[] bookHeader = {
			"bookingID", "userID", "spaceID", 
			"lotID", "startTime", "endTime", 
			"paymentMethod", "paymentAmount", "licensePlate"
			};
	protected static final String[] parkLotHeader = {"lotID", "lotName", "isDisabled"};
	protected static final String[] parkSpaceHeader = {"spaceID", "lotID", "isTaken", "isDisabled"};
	
	// BeforeEach annotation can only be used in JUnit 5 and above.
	// https://stackoverflow.com/questions/10580613/after-before-not-working-in-testcase
	@BeforeEach
	public void setUp() throws IOException {
		File dummy = new File("Dummy Path");
		if(dummy.exists()) dummy.delete();
		
		userFile = Files.createTempFile("userTest", "csv").toFile();
		bookFile = Files.createTempFile("bookTest", "csv").toFile();
		parkLotFile = Files.createTempFile("parkLotTest", "csv").toFile();
		parkSpaceFile = Files.createTempFile("parkSpaceTest", "csv").toFile();
		
		writeHeader(userFile, userHeader);
		writeHeader(bookFile, bookHeader);
		writeHeader(parkLotFile, parkLotHeader);
		writeHeader(parkSpaceFile, parkSpaceHeader);
		
		userPath = userFile.getPath();
		bookPath = bookFile.getPath();
		parkLotPath = parkLotFile.getPath();
		parkSpacePath = parkSpaceFile.getPath();
		
	}
	
	@AfterAll
	public static void finish() {
		userFile.delete();
		bookFile.delete();
		parkLotFile.delete();
		parkSpaceFile.delete();
	}
	
	private static void writeHeader(File file, String[] header) throws IOException {
		CsvWriter writer = new CsvWriter(new FileWriter(file), ',');
		
		for (String i : header) {
			writer.write(i);
		}
		writer.endRecord();
		writer.close();
	}
	
	@Test
	public void fileExist() {
		assertTrue(userFile.exists());
		assertTrue(bookFile.exists());
		assertTrue(parkLotFile.exists());
		assertTrue(parkSpaceFile.exists());
	}
}
