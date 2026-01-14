package singleton;

import java.io.IOException;
import java.security.SecureRandom;

import service.UserService;
import template.Manager;
import static observer.UpdateCSV.checkPath;

public class SuperManager extends Manager {
	private UserService userService = new UserService();
	private static SuperManager instance = new SuperManager();
	private static final String CHARSET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	private static final int DEFAULT_LENGTH = 6;
	
	
	/* CONSTRUCTOR */
	private SuperManager() {}
	
	
	/* GETTER */
	public static SuperManager getInstance() {
		return instance;
	}
	
	@Override
	public String getUserType() {
		return "supermanager";
	}
	
	
	/* METHODS */
	public void createManagementAccount(String path) throws IOException {
		checkPath(path);
		
		String email = generateRandom(DEFAULT_LENGTH - 2) + "@email.com";
		String password = generateRandom(DEFAULT_LENGTH);
		
		int id = userService.getNextId(path);
		
		Manager manager = new Manager("", id, email, password, true);
		
		userService.createUser(path, manager);
	}

	
	// Use this method for both username and password
    private String generateRandom(int length) {
    	
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder(length);
        
        int i = 0;
        
        while (i < length) {
        	int index = random.nextInt(CHARSET.length());
        	password.append(CHARSET.charAt(index));
        	i++;
        }

        return password.toString();
    }
}
