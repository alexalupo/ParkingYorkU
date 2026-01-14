package service;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.csvreader.CsvReader;

import observer.ParkingLot;
import observer.ParkingSpace;
import observer.UpdateCSV;

public class ManagerService {
	public void addParkingLot(String parkLotPath, String parkSpacePath, ParkingLot parkingLot) throws IOException {
		List<String[]> rows = new ArrayList<>();
		
		try {
			CsvReader reader = new CsvReader(parkLotPath);
			reader.readHeaders();
			
			if (!getLotIDByLotName(parkLotPath, parkingLot.getLocation()).equals("null")) {
				throw new IOException();
			}

			while(reader.readRecord()) {
				String[] prevLine = new String[3];
				
				prevLine[0] = reader.get("lotID");
				prevLine[1] = reader.get("lotName");
				prevLine[2] = reader.get("isDisabled");
				rows.add(prevLine);
			}
			
		} catch (IOException e) {
			throw new IOException();
		}

		String[] newLine = new String[3];
		String lotID = Integer.toString(parkingLot.getId());
		String location = parkingLot.getLocation();
		
		newLine[0] = lotID;
		newLine[1] = location;
		newLine[2] = "f";
		
		rows.add(newLine);
		
		UpdateCSV.updateParkingLot(parkLotPath, rows);
		
		addParkingSpace(parkSpacePath, parkingLot);
	}
	
	private void addParkingSpace(String path, ParkingLot parkingLot) throws IOException {
		List<String[]> rows = new ArrayList<>();
		String[] prevLine = new String[4];
		
		try {
			CsvReader reader = new CsvReader(path);
			reader.readHeaders();
			
			while (reader.readRecord()) {
				prevLine[0] = reader.get("spaceID");
				prevLine[1] = reader.get("lotID");
				prevLine[2] = reader.get("isTaken");
				prevLine[3] = reader.get("isDisabled");
			}
			
		} catch (IOException e) {
			throw new IOException();
		}
		
		for (ParkingSpace space : parkingLot.getSpaces()) {
			String[] newLine = new String[4];
			String spaceID = Integer.toString(space.getId());
			String lotID = Integer.toString(space.getLotID());
			
			newLine[0] = spaceID;
			newLine[1] = lotID;
			newLine[2] = "f";
			newLine[3] = "f";
			
			rows.add(newLine);
		}
		
		UpdateCSV.updateParkingSpace(path, rows);
	}
	
	public void removeParkingLot(String parkLotPath, String parkSpacePath, String bookingPath, String name) throws IOException {
		String id = getLotIDByLotName(parkLotPath, name);
		
		if(id.equals("null")) {
			throw new IOException();
		}
		
		List<String[]> rows = new ArrayList<>();
		
		try {
			CsvReader reader = new CsvReader(parkLotPath);
			reader.readHeaders();
			
			while(reader.readRecord()) {
				String[] newLine = new String[4];
				String lotID = reader.get("lotID");
				
				if(id.equals(lotID)) {
					continue;
				} 
				
				int parseID = Integer.parseInt(id);
				int parselotID = Integer.parseInt(lotID);
				
				if(parseID < parselotID) { //shift ids that show up after down by 1
					newLine[0] = Integer.toString(Integer.parseInt(reader.get("lotID")) - 1); 
				} else {
					newLine[0] = reader.get("lotID");
				}
				
				newLine[1] = reader.get("lotName");
				newLine[2] = reader.get("isDisabled");

				rows.add(newLine);
			}
		} catch (IOException e) {
			throw new IOException();
		}
		
		UpdateCSV.updateParkingLot(parkLotPath, rows);
		
		
		// Handle Parking Space
		rows = new ArrayList<>();
		
		try {
			CsvReader reader = new CsvReader(parkSpacePath);
			reader.readHeaders();
			
			while (reader.readRecord()) {
				if (!reader.get("lotID").equals(id)) {
					String[] newLine = new String[4];
					
					newLine[0] = reader.get("spaceID");
					newLine[1] = reader.get("lotID");
					newLine[2] = reader.get("isTaken");
					newLine[3] = reader.get("isDisabled");
					
					rows.add(newLine);
				}
			}
			
		} catch (IOException e) {
			throw new IOException();
		}

		UpdateCSV.updateParkingSpace(parkSpacePath, rows);
		
		
		// Handle Booking
		rows = new ArrayList<>();
		int ctr = 0;
		
		try {
			CsvReader reader = new CsvReader(bookingPath);
			reader.readHeaders();
			
			while(reader.readRecord()) {
				String[] newLine = new String[9];
				String lotID = reader.get("lotID");
				
				if(id.equals(lotID)) {
					continue;
				} 
				
				int parseID = Integer.parseInt(id);
				int parseLotID = Integer.parseInt(lotID);
				
				if(parseID < parseLotID) {
					newLine[3] = Integer.toString(Integer.parseInt(reader.get("lotID")) - 1); 
				} else {
					newLine[3] = reader.get("lotID");
				}
				
				newLine[0] = Integer.toString(ctr);
				newLine[1] = reader.get("userID");
				newLine[2] = reader.get("spaceID");  
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
		
		UpdateCSV.updateBooking(bookingPath, rows);
	}
	
	public void validateUser(String path, String email, boolean flag) throws IOException {
		ArrayList<String[]> rows = new ArrayList<String[]>();
		boolean emailFound = false;
		
		try {
			CsvReader reader = new CsvReader(path);
			reader.readHeaders();
			
			while (reader.readRecord()) {
	            String[] row = new String[6];
	            row[0] = reader.get("name");
	            row[1] = reader.get("id");
	            row[2] = reader.get("email");
	            row[3] = reader.get("password");
	            row[4] = reader.get("isValidated");
	            row[5] = reader.get("userType");
				
				if (email.equals(row[2])) {
					if (flag) {
						row[4] = "t";
					} else {
						row[4] = "f";
					}
					emailFound = true;
				}
				
				rows.add(row);
			}
		} catch (IOException e) {
			throw new IOException();
		}
		
        if (emailFound) {
        	UpdateCSV.updateUser(path, rows);
        } else {
        	throw new IOException();
        }
	}
	
	public String getLotIDByLotName(String path, String name) throws IOException {
		try {
			CsvReader reader = new CsvReader(path);
			reader.readHeaders();
			
			while(reader.readRecord()) {
				if (name.equals(reader.get("lotName"))) return reader.get("lotID");
			}
			
		} catch (IOException e) {
			throw new IOException();
		}
		return "null";
	}
	
	public boolean parkingLotEnableDisable(String parkLotPath, String parkSpacePath, String bookPath, String name, boolean check) throws IOException {
		String s;
		if(check) s = "f";
		else s = "t";
		
		// Handle Parking Lot
		String lotID = getLotIDByLotName(parkLotPath, name);
		if(lotID.equals("null")) return false;
		
		List<String[]> rows = new ArrayList<>();
		
		try {
			CsvReader reader = new CsvReader(parkLotPath);
			reader.readHeaders();
			
			while(reader.readRecord()) {
				String[] newLine = new String[3];
				
				newLine[0] = reader.get("lotID");
				newLine[1] = reader.get("lotName");
				
				if (newLine[0].equals(lotID)) {
					newLine[2] = s;
				} else {
					newLine[2] = reader.get("isDisabled");
				}
				rows.add(newLine);
			}
			
		} catch (IOException e) {
			throw new IOException();
		}

		UpdateCSV.updateParkingLot(parkLotPath, rows);
		
		// Handle Parking Space
		rows = new ArrayList<>();
		
		try {
			CsvReader reader = new CsvReader(parkSpacePath);
			reader.readHeaders();
			
			while (reader.readRecord()) {
				String[] newLine = new String[4];
				
				newLine[0] = reader.get("spaceID");
				newLine[1] = reader.get("lotID");
				newLine[2] = s;
				newLine[3] = s;
				
				rows.add(newLine);
			}
			
		} catch (IOException e) {
			throw new IOException();
		}
		
		UpdateCSV.updateParkingSpace(parkSpacePath, rows);
		
		// Handle Booking
		if(s.equals("t")) {
			
			try {
				CsvReader reader = new CsvReader(bookPath);
				
				rows = new ArrayList<>();
				
				reader.readHeaders();
				
				int ctr = 0;
				while(reader.readRecord()) {
					String[] newLine = new String[9];
					
					if(!lotID.equals(reader.get("lotID"))) {
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
					}
				}
				
			} catch (IOException e) {
				throw new IOException();
			}

			UpdateCSV.updateBooking(bookPath, rows);
		}
		
		return true;
	}
	
	public void parkingSpaceEnableDisable(String parkSpacePath, String bookPath, String lotID, String spaceID, boolean check) throws IOException {
		String s;
		if(check) s = "f";
		else s = "t";
		
		if(Integer.parseInt(spaceID) < 0 || Integer.parseInt(spaceID) > 99) throw new IOException();
		
		
		// Handle Parking Space
		List<String[]> rows = new ArrayList<>();
		CsvReader reader = new CsvReader(parkSpacePath);
		
		
		reader.readHeaders();
		
		while (reader.readRecord()) {
			String[] newLine = new String[4];
			newLine[0] = reader.get("spaceID");
			newLine[1] = reader.get("lotID");
			
			if (newLine[0].equals(spaceID) && newLine[1].equals(lotID)) {
				newLine[2] = s;
				newLine[3] = s;
			} else {
				newLine[2] = reader.get("isTaken");
				newLine[3] = reader.get("isDisabled");
			}
			
			rows.add(newLine);
		}
		
		reader.close();
		
		UpdateCSV.updateParkingSpace(parkSpacePath, rows);
		
		// Handle Booking
		if(s.equals("t")) {
			reader = new CsvReader(bookPath);
			
			rows = new ArrayList<>();
			
			reader.readHeaders();
			
			int ctr = 0;
			while(reader.readRecord()) {
				String[] newLine = new String[9];
				
				if(!(lotID.equals(reader.get("lotID")) && spaceID.equals(reader.get("spaceID")))) {
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
				}
			}
			UpdateCSV.updateBooking(bookPath, rows);
		}
	}
}
