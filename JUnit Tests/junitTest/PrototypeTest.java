package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import observer.ParkingLot;
import observer.ParkingSpace;
import prototype.CloneParkingSpace;

class PrototypeTest extends BaseTest {
	
	@BeforeEach
	public void setUp() throws IOException {
		super.setUp();
		parkingLot = new ParkingLot(0, false, location);
	}

	@Test
	public void cloneTest() {
		for (int i = 0; i < 100; i++) {
			ParkingSpace space = parkingLot.getSpaces()[i];
			
			assertEquals(i, space.getId());
			assertEquals(space.getLocation(), space.getLocation());
			assertEquals(space.getParkingLot(), space.getParkingLot());
		}
	}
	
	@Test
	public void cloneNullParkingSpace() {
		assertThrows(NullPointerException.class, () -> {
			CloneParkingSpace.clone(null);
		});
	}
	
	@Test
	public void cloneNullValuesOfParkingSpace() {
		assertThrows(NullPointerException.class, () -> {
			ParkingSpace space = parkingLot.getSpaces()[0];
			
			space.setParkingLot(null);
			CloneParkingSpace.clone(space);
		});
		
		assertThrows(NullPointerException.class, () -> {
			ParkingSpace space = parkingLot.getSpaces()[0];
			
			space.setLocation(null);
			CloneParkingSpace.clone(space);
		});
	}
}
