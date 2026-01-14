package template;

public class FacultyMember extends User {
	public FacultyMember(String name, int id, String email, String password, boolean isValidated) {
		super(name, id, email, password, isValidated);
	}

	@Override
	public int getPayRate() {
		return 8;
	}

	@Override
	public String getUserType() {
		return "faculty";
	}
}
