package service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.csvreader.CsvReader;

import factory.CreditCardPayment;
import factory.PayPalPayment;
import factory.PaymentFactory;
import factory.PaymentOption;
import observer.Booking;
import observer.ParkingLot;
import observer.ParkingSpace;
import observer.UpdateCSV;
import template.User;

public class UserService {
	public void createUser(String path, User user) throws IOException {
		int superManagerLimit = 1;
		List<String[]> rows = new ArrayList<>();
		
		try {
			CsvReader reader = new CsvReader(path);
			reader.readHeaders();
			
			while(reader.readRecord()) {
				String[] newLine = new String[6];
				newLine[0] = reader.get("name");
				newLine[1] = reader.get("id");
				newLine[2] = reader.get("email");
				newLine[3] = reader.get("password");
				newLine[4] = reader.get("isValidated");
				newLine[5] = reader.get("userType");
				rows.add(newLine);
			}
		} catch (IOException e) {
			throw new IOException();
		}
		
		
		String[] newLine = new String[6];
		
		String name = user.getName();
		String userId = Integer.toString(user.getId());
		String email = user.getEmail();
		String password = user.getPassword();
		boolean isValidated = user.isValidated();
		String userType = user.getUserType();
		
		
		newLine[0] = name;
		newLine[1] = userId;
		newLine[2] = email;
		newLine[3] = password;
		newLine[5] = userType;
		if(isValidated) newLine[4] = "t";
		else newLine[4] = "f";
		
		rows.add(newLine);
		
		for (String[] row : rows) {
			if (row[5].equals("supermanager")) {
				superManagerLimit--;
			}
			
			if (superManagerLimit < 0) {
				throw new IOException("Super Manager already exists");
			}
		}
		
		UpdateCSV.updateUser(path, rows);
	}
	
	public int getNextId(String path) throws IOException {
		int id = 0;
		
		try {
			CsvReader reader = new CsvReader(path);
			reader.readHeaders();
			
			while (reader.readRecord()) {
				id++;
			}
		} catch (IOException e) {
			throw new IOException();
		}
		
		return id;
	}
	
	public int getParkingLots(String path) throws IOException {
		int ctr = -1;
		
		try {
			CsvReader reader = new CsvReader(path);
			reader.readHeaders();
			
			while (reader.readRecord()) {
				ctr = Math.max(ctr, Integer.parseInt(reader.get("lotID")));
			}
		} catch (IOException e) {
			throw new IOException();
		}
		
		return ctr;
	}
	
	
	public boolean checkIfDisabled(String path, String lotID) throws IOException {
		String s = "t";
		
		try {
			CsvReader reader = new CsvReader(path);
			reader.readHeaders();
			
			while(reader.readRecord()) {
				if(lotID.equals(reader.get("lotID")) && s.equals(reader.get("isDisabled"))) {
					return true;
				}
			}
		} catch (IOException e) {
			throw new IOException();
		}
		
		return false;
	}
	
	public ParkingLot getParkingLotByID(String parkLotPath, String parkSpacePath, int lotID) throws IOException {
		try {
			CsvReader reader = new CsvReader(parkLotPath);
			reader.readHeaders();
			
			while (reader.readRecord()) {
				String storedLotID = reader.get("lotID");
				
				if (storedLotID.equals(Integer.toString(lotID))) {
					boolean isDisabled;
					String name = reader.get("lotName");
					
					if (reader.get("isDisabled").equals("f")) {
						isDisabled = false;
					} else {
						isDisabled = true;
					}
					
					ParkingLot parkingLot = new ParkingLot(lotID, isDisabled, name);
					
					CsvReader reader2 = new CsvReader(parkSpacePath);
					reader2.readHeaders();
					
					for (ParkingSpace space : parkingLot.getSpaces()) {
						reader2.readRecord();
						
						String spaceIsTaken = reader2.get("isTaken");
						String spaceIsDisabled = reader2.get("isDisabled");
						
						if (spaceIsTaken.equals("t")) {
							space.setTaken(true);
						}
						
						if (spaceIsDisabled.equals("t")) {
							space.setDisabled(true);
						}
					}
					
					return parkingLot;
				}
			}
		} catch (IOException e) {
			throw new IOException();
		}
		
		return null;
	}
	
	public void createBooking(String bookPath, String parkSpacePath, Booking booking) throws IOException {
		String licensePlate = booking.getLicense().trim();
		
		if (licensePlate.length() != 6) {
			throw new IllegalArgumentException("License Plate length must be 6 characters long");
		}
		
		PaymentOption payment = booking.getPaymentOption();
		User user = booking.getUser();
		ParkingSpace space = booking.getParkingSpace();
		int startTime = booking.getStartTime();
		int endTime = booking.getEndTime();
		int owed = booking.getTotalCost(startTime, endTime, user.getPayRate());
		
		
		if(checkSpaceDisabled(parkSpacePath, Integer.toString(space.getParkingLot().getId()), Integer.toString(space.getId()))) throw new IOException();
		
		List<String[]> rows = new ArrayList<>();
		
		try {
			CsvReader reader = new CsvReader(parkSpacePath);
			reader.readHeaders();
			
			while (reader.readRecord()) {
				String[] newLine = new String[4];
				String spaceID = reader.get("spaceID");
				String lotID = reader.get("lotID");
				
				if (space.getId() == Integer.parseInt(spaceID) && space.getParkingLot().getId() == Integer.parseInt(lotID)) {
					newLine[2] = "t";
				} else {
					newLine[2] = reader.get("isTaken");
				}
				
				newLine[0] = reader.get("spaceID");
				newLine[1] = reader.get("lotID");
				newLine[3] = reader.get("isDisabled");
				
				rows.add(newLine);
			}
			
		} catch (IOException e) {
			throw new IOException();
		}
		
		UpdateCSV.updateParkingSpace(parkSpacePath, rows);
		
		
		rows = new ArrayList<>();
		int ctr = 0;
		
		try {
			CsvReader reader = new CsvReader(bookPath);
			reader.readHeaders();
			
			while(reader.readRecord()) {
				String[] newLine = new String[9];
				newLine[0] = reader.get("bookingID");
				newLine[1] = reader.get("userID");
				newLine[2] = reader.get("spaceID");
				newLine[3] = reader.get("lotID");
				newLine[4] = reader.get("startTime");
				newLine[5] = reader.get("endTime");
				newLine[6] = reader.get("paymentMethod");
				newLine[7] = reader.get("paymentAmount");
				newLine[8] = reader.get("licensePlate");
				ctr++;
				rows.add(newLine);
			}
			
		} catch (IOException e) {
			throw new IOException();
		}
		
		String[] newLine = new String[9];
		newLine[0] = Integer.toString(ctr);
		newLine[1] = Integer.toString(user.getId());
		newLine[2] = Integer.toString(space.getId());
		newLine[3] = Integer.toString(space.getParkingLot().getId());
		newLine[4] = Integer.toString(startTime);
		newLine[5] = Integer.toString(endTime);
		newLine[7] = Integer.toString(owed);
		newLine[8] = licensePlate;
		
		if (payment instanceof PayPalPayment) {
			newLine[6] = "paypal";
		} else if(payment instanceof CreditCardPayment) {
			newLine[6] = "credit";
		} else {
			newLine[6] = "debit";
		}
		rows.add(newLine);
		
		UpdateCSV.updateBooking(bookPath, rows);
	}
	
	public ArrayList<Booking> getUserBookings(String parkLotPath, String parkSpacePath, User user) throws IOException {
		ArrayList<Booking> list = new ArrayList<>();
		
		try {
			CsvReader reader = new CsvReader(parkLotPath);
			reader.readHeaders();
			
			while(reader.readRecord()) {
				if(user.getId() == Integer.parseInt(reader.get("userID"))) {
					ParkingLot lot = this.getParkingLotByID(parkLotPath, parkSpacePath, Integer.parseInt(reader.get("lotID")));
					
					Booking booking = new Booking(
							Integer.parseInt(reader.get("bookingID")), 
							user, 
							lot, 
							lot.getSpaces()[Integer.parseInt(reader.get("spaceID"))], 
							Integer.parseInt(reader.get("startTime")), 
							Integer.parseInt(reader.get("endTime")), 
							PaymentFactory.createPayment(reader.get("paymentMethod")), 
							reader.get("licensePlate")
						);
					list.add(booking);
				}	
			}
		} catch (IOException e) {
			throw new IOException();
		}
		
		return list;
	}
	
	public void deleteBooking(String bookingPath, String parkSpacePath, Booking booking) throws IOException {
		ArrayList<String[]> rows = new ArrayList<>();
		boolean exists = false;
		int ctr = 0;
		
		try {
			CsvReader reader = new CsvReader(bookingPath);
			reader.readHeaders();
			
			while(reader.readRecord()) {
				if(booking.getId() != Integer.parseInt(reader.get("bookingID"))) {
					String[] newLine = new String[9];
					newLine[0] = Integer.toString(ctr);
					newLine[1] = reader.get("userID");
					newLine[2] = reader.get("spaceID");
					newLine[3] = reader.get("lotID");
					newLine[4] = reader.get("startTime");
					newLine[5] = reader.get("endTime");
					newLine[6] = reader.get("paymentMethod");
					newLine[7] = reader.get("paymentAmount");
					newLine[8] = reader.get("licensePlate");
					ctr++;
				
					rows.add(newLine);
				} else {
					exists = true;
				}
			}
		} catch (IOException e) {
			throw new IOException();
		}
		
		
		if(!exists) throw new IOException();
		
		UpdateCSV.updateBooking(bookingPath, rows);
		
		int parkingLotId = booking.getParkingLot().getId();
		int parkingSpaceId = booking.getParkingSpace().getId();
		
		parkingSpaceToggle(parkSpacePath, parkingLotId, parkingSpaceId, false);
	}

	public void editBookingTime(String path, Booking booking, int newEndTime, PaymentOption payment) throws IOException {
		if (newEndTime < 0) {
			throw new IOException();
		}
		
		ArrayList<String[]> rows = new ArrayList<>();
		
		try {
			CsvReader reader = new CsvReader(path);
			reader.readHeaders();
			
			while(reader.readRecord()) {
				String[] newLine = new String[9];
				
				int newAmount = totalCost(booking.getStartTime(), newEndTime, booking.getUser().getPayRate());
				
				if(booking.getId() == Integer.parseInt(reader.get("bookingID"))) {
					newLine[5] = Integer.toString(newEndTime);
					newLine[7] = Integer.toString(newAmount);
					
					if(payment instanceof PayPalPayment) {
						newLine[6] = "paypal";
					} else if (payment instanceof CreditCardPayment) {
						newLine[6] = "credit";
					} else {
						newLine[6] = "debit";
					}
				} else {
					newLine[5] = reader.get("endTime");
					newLine[6] = reader.get("paymentMethod");
					newLine[7] = reader.get("paymentAmount");
				}
				
				newLine[0] = reader.get("bookingID");
				newLine[1] = reader.get("userID");
				newLine[2] = reader.get("spaceID");
				newLine[3] = reader.get("lotID");
				newLine[4] = reader.get("startTime");
				newLine[8] = reader.get("licensePlate");
				rows.add(newLine);
			}
		} catch (IOException e) {
			throw new IOException();
		}
		
		UpdateCSV.updateBooking(path, rows);
	}

	private boolean checkSpaceDisabled(String path, String lotID, String spaceID) throws IOException {
		String s = "t";
		
		try {
			CsvReader reader = new CsvReader(path); 
			reader.readHeaders();
			while(reader.readRecord()) {
				if(lotID.equals(reader.get("lotID")) && s.equals(reader.get("isDisabled")) && spaceID.equals(reader.get("spaceID"))) {
					reader.close();
					return true;
				}
			}
		} catch (IOException e) {
			throw new IOException();
		}
		
		return false;
	}
	
	private void parkingSpaceToggle(String path, int parkingLotId, int parkingSpaceId, boolean b) throws IOException {
		List<String[]> rows = new ArrayList<>();
		
		try {
			CsvReader reader = new CsvReader(path);
			reader.readHeaders();
			
			while(reader.readRecord()) {
				String[] newLine = new String[4];
				String spaceID = reader.get("spaceID");
				String lotID = reader.get("lotID");
				
				if (parkingSpaceId == Integer.parseInt(spaceID)  && parkingLotId == Integer.parseInt(lotID)) {
					newLine[2] = "f";
				} else {
					newLine[2] = reader.get("isTaken");
				}
				
				newLine[0] = spaceID;
				newLine[1] = lotID;
				newLine[3] = reader.get("isDisabled");
				
				rows.add(newLine);
			}
		} catch (IOException e) {
			throw new IOException();
		}
		
		UpdateCSV.updateParkingSpace(path, rows);
	}
	
	public static int totalCost(int startTime, int endTime, int rate) {
		if (startTime < 0|| endTime < 0) {
			throw new IllegalArgumentException("Time cannot be negative");
		} 
		
		if (startTime > 24 || endTime > 24) {
			throw new IllegalArgumentException("Time cannot exceed 24 hours");
		} 
		
		if (endTime <= startTime) {
			throw new IllegalArgumentException("endTime must be greater than startTime!!!");
		}
		
		return (endTime - startTime) * rate;
	}
}

