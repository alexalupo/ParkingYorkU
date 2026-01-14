package template;

public class Student extends User {
	public Student(String name, int id, String email, String password, boolean isValidated) {
		super(name, id, email, password, isValidated);
	}

	@Override
	public int getPayRate() {
		return 5;
	}

	@Override
	public String getUserType() {
		return "student";
	}
}
