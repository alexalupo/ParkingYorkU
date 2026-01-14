package junitTest;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.csvreader.CsvReader;

import service.UserService;
import singleton.SuperManager;

class SingletonTest extends BaseTest {
	private final UserService userService = new UserService();
	private final SuperManager superManager = SuperManager.getInstance();
	private CsvReader reader;
	
	@Test
	public void duplicateSuperManager() throws IOException {
    	userService.createUser(userPath, superManager);
    	
	    assertThrows(IOException.class, () -> {
	    	superManager.setName("evil");
	    	superManager.setEmail("evil@email.com");
	    	superManager.setPassword("4321");

	    	userService.createUser(userPath, superManager);
	    });
	}
	
	@Test
	public void createManagerAccount() throws IOException {
		superManager.createManagementAccount(userPath);
		superManager.createManagementAccount(userPath);
		
		int i = 0;
		
		reader = new CsvReader(userPath); 
		
		reader.readHeaders();
		while(reader.readRecord()) {
			assertEquals(Integer.toString(i), reader.get("id"));
			assertEquals("t", reader.get("isValidated"));
			assertEquals("manager", reader.get("userType"));
			i++;
		}
		reader.close();
	}
	
	@Test
	public void createManagerAccountUsingIncorrectPath() throws IOException {
		assertThrows(FileNotFoundException.class, () -> {
			superManager.createManagementAccount("Wonderland");
		});
		
		assertThrows(FileNotFoundException.class, () -> {
			superManager.createManagementAccount("");
		});
		
		assertThrows(NullPointerException.class, () -> {
			superManager.createManagementAccount(null);
		});
	}
	
	@Test
	public void sameInstance() {
		SuperManager superManager1 = SuperManager.getInstance();
		SuperManager superManager2 = SuperManager.getInstance();
		SuperManager superManager3 = SuperManager.getInstance();
		
		assertEquals(superManager1, superManager2);
		assertEquals(superManager2, superManager3);
		assertEquals(superManager1, superManager3);
	}
	
	@Test
	public void testPasswordCharSet() throws IOException {
		String CHARSET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		superManager.createManagementAccount(userPath);

		reader = new CsvReader(userPath);
		reader.readHeaders();
		reader.readRecord();
		
		String password = reader.get("password");
		
		assertNotNull(password);
		assertFalse(password.isEmpty());
		assertEquals(6, password.length());
		
	    for (char c : password.toCharArray()) {
	        assertTrue(CHARSET.indexOf(c) >= 0);
	    }
	}
	
	@Test
	public void getUserType() {
		assertEquals("supermanager", superManager.getUserType());
	}
 }
