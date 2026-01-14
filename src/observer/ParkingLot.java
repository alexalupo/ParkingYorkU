package observer;

import prototype.CloneParkingSpace;

public class ParkingLot {
	private int id;
	private boolean isDisabled;
	private String location;
	private ParkingSpace[] spaces = new ParkingSpace[100];
	
	private ParkingSpace parkingSpace;
	
	public ParkingLot(int id, boolean isDisabled, String location) {
		this.id = id;
		this.isDisabled = isDisabled;
		this.location = location;
		
		parkingSpace = new ParkingSpace(0, location, false, false, this);
		this.spaces = CloneParkingSpace.clone(parkingSpace);
	}
	
	
	/* GETTERS AND SETTERS */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isDisabled() {
		return isDisabled;
	}


	public void setDisabled(boolean isDisabled) {
		this.isDisabled = isDisabled;
	}


	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public ParkingSpace[] getSpaces() {
		return spaces;
	}

	public void setSpaces(ParkingSpace[] spaces) {
		this.spaces = spaces;
	}
}
