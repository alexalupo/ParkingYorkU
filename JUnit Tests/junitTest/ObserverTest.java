package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factory.PaymentFactory;
import observer.Booking;
import observer.ParkingLot;

class ObserverTest extends BaseTest {
	
	@BeforeEach
	public void setUp() throws IOException {
		super.setUp();
		
		parkingLot = new ParkingLot(0, true, location);
		parkingSpace = parkingLot.getSpaces()[0];
		
		paypal = PaymentFactory.createPayment("paypal");
		
		booking = new Booking(0, faculty, parkingLot, parkingSpace, 
				startTime, endTime, paypal, license);
		
		
	}
	
	public void bookingTest() {
		student.setName("name");
		student.setId(0);
		student.setEmail("email");
		student.setPassword("password");
		student.setValidated(false);
		
		Booking booking = new Booking(0, student, parkingLot, parkingLot.getSpaces()[0], 0, 2, paypal, "");

		booking.setStartTime(1);
		booking.setEndTime(15);
		booking.setId(1000);
		booking.setLicense("100WE");
		
		assertEquals(1, booking.getStartTime());
		assertEquals(15, booking.getEndTime());
		assertEquals(1000, booking.getId());
		assertEquals("100WE", booking.getLicense());
	}
	
	@Test
	public void parkingSpaceTest() {
		parkingSpace.setId(1000);
		parkingSpace.setLocation("underground");
		parkingSpace.setParkingLot(parkingLot);
		parkingSpace.setTaken(false);
		
		assertEquals(1000, parkingSpace.getId());
		assertEquals("underground", parkingSpace.getLocation());
		assertEquals(parkingLot, parkingSpace.getParkingLot());
		assertEquals(false, parkingSpace.isTaken());
	}
}
