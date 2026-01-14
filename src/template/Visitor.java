package template;

public class Visitor extends User {
	public Visitor(String name, int id, String email, String password, boolean isValidated) {
		super(name, id, email, password, isValidated);
	}

	@Override
	public int getPayRate() {
		return 15;
	}

	@Override
	public String getUserType() {
		return "visitor";
	}
}
