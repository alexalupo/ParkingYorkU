package prototype;

import observer.ParkingSpace;

public class CloneParkingSpace {
	public static ParkingSpace[] clone(ParkingSpace clonable) {
		if (clonable == null) {
			throw new NullPointerException("Parking Space is NULL");
		}
		
		if (clonable.getParkingLot() == null) {
			throw new NullPointerException("Parking Lot is NULL");
		}
		
		if (clonable.getLocation() == null) {
			throw new NullPointerException("Location is NULL");
		}
		
		ParkingSpace[] spaces = new ParkingSpace[100];
		for(int i = 0; i < 100; i++) {
			ParkingSpace space = new ParkingSpace(i, clonable.getLocation(), clonable.isTaken(), clonable.isDisabled(), clonable.getParkingLot());
			spaces[i] = space;
		}
		return spaces;
	}
}
