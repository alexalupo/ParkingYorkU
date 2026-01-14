package observer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.csvreader.CsvWriter;

public class UpdateCSV {
	public static void updateUser(String path, List<String[]> rows) throws IOException {
		checkPath(path);
		checkValidID(rows, 1);
		
		CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
		
		csvOutput.write("name");
		csvOutput.write("id");
    	csvOutput.write("email");
		csvOutput.write("password");
		csvOutput.write("isValidated");
		csvOutput.write("userType");
    	
		csvOutput.endRecord();
		
		
		
		for(int i = 0; i < rows.size(); i++) {
			csvOutput.write(rows.get(i)[0]);
			csvOutput.write(rows.get(i)[1]);
			csvOutput.write(rows.get(i)[2]);
			csvOutput.write(rows.get(i)[3]);
			csvOutput.write(rows.get(i)[4]);
			csvOutput.write(rows.get(i)[5]);
			
			csvOutput.endRecord();
		}
		
		csvOutput.close();
	}
	
	public static void updateParkingLot(String path, List<String[]> rows) throws IOException {
		checkPath(path);
		checkValidID(rows, 0);
		
		CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
		
		csvOutput.write("lotID");
		csvOutput.write("lotName");
    	csvOutput.write("isDisabled");
    	
		csvOutput.endRecord();
		
		
		for(int i = 0; i < rows.size(); i++) {
			csvOutput.write(rows.get(i)[0]);
			csvOutput.write(rows.get(i)[1]);
			csvOutput.write(rows.get(i)[2]);
			
			csvOutput.endRecord();
		}
		
		csvOutput.close();
	}
	
	public static void updateParkingSpace(String path, List<String[]> rows) throws IOException {
		checkPath(path);
		checkValidID(rows, 0);
		
		CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
		
		csvOutput.write("spaceID");
		csvOutput.write("lotID");
		csvOutput.write("isTaken");
		csvOutput.write("isDisabled");
		
		csvOutput.endRecord();
		
		for (int i = 0; i < rows.size(); i++) {
			csvOutput.write(rows.get(i)[0]);
			
			csvOutput.write(rows.get(i)[1]);
			csvOutput.write(rows.get(i)[2]);
			csvOutput.write(rows.get(i)[3]);
			
			csvOutput.endRecord();
		}
		
		csvOutput.close();
	}
	
	public static void updateBooking(String path, List<String[]> rows) throws IOException {
		checkPath(path);
		checkValidID(rows, 0);
		
		CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
		
		csvOutput.write("bookingID");
		csvOutput.write("userID");
		csvOutput.write("spaceID");
    	csvOutput.write("lotID");
		csvOutput.write("startTime");
		csvOutput.write("endTime");
		csvOutput.write("paymentMethod");
		csvOutput.write("paymentAmount");
		csvOutput.write("licensePlate");

		csvOutput.endRecord();
		
		for(int i = 0; i < rows.size(); i++) {
			csvOutput.write(rows.get(i)[0]);
			csvOutput.write(rows.get(i)[1]);
			csvOutput.write(rows.get(i)[2]);
			csvOutput.write(rows.get(i)[3]);
			csvOutput.write(rows.get(i)[4]);
			csvOutput.write(rows.get(i)[5]);
			csvOutput.write(rows.get(i)[6]);
			csvOutput.write(rows.get(i)[7]);
			csvOutput.write(rows.get(i)[8]);
			csvOutput.endRecord();
		}
		
		csvOutput.close();
	}
	
	public static void checkPath(String path) throws FileNotFoundException {
		File file = new File(path);
		
		if (!file.exists()) {
			throw new FileNotFoundException("File does not exist");
		}
	}
	
	private static void checkValidID(List<String[]> rows, int classId) {
		if (rows.isEmpty()) {
			return;
		}
		
		if (classId < 0 || classId >= rows.get(0).length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		Set<Integer> set = new HashSet<>();
		for (String[] row : rows) {
			int id = Integer.parseInt(row[classId]);
			
			if (set.contains(id)) {
				throw new IllegalArgumentException(id + " is a duplicate bookID");
			} else if (id < 0) {
				throw new IllegalArgumentException("Book ID cannot be negative");
			} else {
				set.add(id);
			}
		}
	}
	
}
