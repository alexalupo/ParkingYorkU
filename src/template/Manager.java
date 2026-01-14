package template;

public class Manager extends User {
	public Manager(String name, int id, String email, String password, boolean isValidated) {
		super(name, id, email, password, true);
	}
	
	public Manager() {}
	
	/* GETTER AND SETTERS */

	@Override
	public int getPayRate() {
		return 0;
	}

	@Override
	public String getUserType() {
		return "manager";
	}
}
