package observer;

import factory.PaymentOption;
import template.User;

public class Booking {
	private int id;
	private User user;
	private ParkingLot parkingLot;
	private ParkingSpace parkingSpace;
	private int startTime; //changed startTime and endTime from type 'Date' to type 'int' to simplify putting it in a csv file
	private int endTime;
	private PaymentOption paymentOption;
	private String license;
	
	/* CONSTRUCTOR */
	public Booking(int id, User user, ParkingLot parkingLot, ParkingSpace parkingSpace, int startTime, int endTime, PaymentOption paymentOption, String license) {
		super();
		this.id = id;
		this.user = user;
		this.parkingLot = parkingLot;
		this.parkingSpace = parkingSpace;
		this.startTime = startTime;
		this.endTime = endTime;
		this.paymentOption = paymentOption;
		this.license = license;
	}
	
	
	/* GETTERS AND SETTERS */
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public ParkingSpace getParkingSpace() {
		return parkingSpace;
	}
	
	public void setParkingSpace(ParkingSpace parkingSpace) {
		this.parkingSpace = parkingSpace;
	}
	
	public int getStartTime() {
		return startTime;
	}
	
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	
	public int getEndTime() {
		return endTime;
	}
	
	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
	
	public void setPaymentOption(PaymentOption paymentOption) {
		this.paymentOption = paymentOption;
	}
	
	public PaymentOption getPaymentOption() {
		return this.paymentOption;
	}
	
	public void setLicense(String license) {
		this.license = license;
	}
	
	public String getLicense() {
		return license;
	}


	public ParkingLot getParkingLot() {
		return parkingLot;
	}


	public void setParkingLot(ParkingLot parkingLot) {
		this.parkingLot = parkingLot;
	}
	
	/* METHOD */
	public int getTotalCost(int startTime, int endTime, int rate) {
		return (endTime - startTime) * rate;
	}
}
