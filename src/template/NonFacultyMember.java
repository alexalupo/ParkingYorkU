package template;

public class NonFacultyMember extends User {
	public NonFacultyMember(String name, int id, String email, String password, boolean isValidated) {
		super(name, id, email, password, isValidated);
	}

	@Override
	public int getPayRate() {
		return 10;
	}

	@Override
	public String getUserType() {
		return "nonfaculty";
	}
}
