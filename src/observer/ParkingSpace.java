package observer;

public class ParkingSpace {
	private int id;
	private String location;
	private boolean taken;
	private boolean isDisabled;
	private ParkingLot parkingLot;
	
	
	/* CONSTRUCTOR */
	public ParkingSpace() {}
	
	public ParkingSpace(int id, String location, boolean taken, boolean isDisabled, ParkingLot parkingLot) {
		super();
		this.id = id;
		this.location = location;
		this.taken = taken;
		this.parkingLot = parkingLot;
	}
	

	/* GETTERS AND SETTERS */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isTaken() {
		return taken;
	}

	public void setTaken(boolean taken) {
		this.taken = taken;
	}
	
	public boolean isDisabled() {
		return isDisabled;
	}

	public void setDisabled(boolean isDisabled) {
		this.isDisabled = isDisabled;
	}

	public ParkingLot getParkingLot() {
		return parkingLot;
	}

	public void setParkingLot(ParkingLot parkingLot) {
		this.parkingLot = parkingLot;
	}
	
	/* CUSTOM METHOD */
	public int getLotID() {
		return parkingLot.getId();
	}
}
