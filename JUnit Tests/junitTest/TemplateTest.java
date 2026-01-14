package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import singleton.SuperManager;
import template.*;

class TemplateTest extends BaseTest {
	
	@BeforeEach
	public void setUp() throws IOException {
		super.setUp();
		
		student = new Student("Andrew", 0, "andrew@email.com", password, false);
		faculty = new FacultyMember("Doofenschmitz", 1, "doof@email.com", password, false);
		nonfaculty = new NonFacultyMember("dummy", 2, "dummy@email.com", password, false);
		visitor = new Visitor("Bat Man", 3, "no@email.com", password, false);
		manager = new Manager("noob", 4, "noob@email.com", password, true);
		
		superManager = SuperManager.getInstance();
		superManager.setId(5);
		superManager.setName("The Boss");
		superManager.setEmail("boss@email.com");
		superManager.setPassword(password);
		superManager.setValidated(true);
	}
	
	@Test
	public void child() {
		assertTrue(student instanceof User);
		assertTrue(faculty instanceof User);
		assertTrue(nonfaculty instanceof User);
		assertTrue(visitor instanceof User);
		assertTrue(manager instanceof User);
		assertTrue(superManager instanceof User);
		assertTrue(superManager instanceof Manager);
	}
	
	@Test
	public void checkPayRate() {
		assertEquals(5, student.getPayRate());
		assertEquals(8, faculty.getPayRate());
		assertEquals(10, nonfaculty.getPayRate());
		assertEquals(15, visitor.getPayRate());
		assertEquals(0, manager.getPayRate());
	}
	
	@Test
	public void checkUserType() {
		assertEquals("student", student.getUserType());
		assertEquals("faculty", faculty.getUserType());
		assertEquals("nonfaculty", nonfaculty.getUserType());
		assertEquals("visitor", visitor.getUserType());
		assertEquals("manager", manager.getUserType());
	}
	
	@Test
	public void getId() {
		assertEquals(0, student.getId());
		assertEquals(1, faculty.getId());
		assertEquals(2, nonfaculty.getId());
		assertEquals(3, visitor.getId());
		assertEquals(4, manager.getId());
		assertEquals(5, superManager.getId());
	}
	
	@Test
	public void getName() {
		assertEquals("Andrew", student.getName());
		assertEquals("Doofenschmitz", faculty.getName());
		assertEquals("dummy", nonfaculty.getName());
		assertEquals("Bat Man", visitor.getName());
		assertEquals("noob", manager.getName());
		assertEquals("The Boss", superManager.getName());
	}
	
	@Test
	public void getEmail() {
		assertEquals("andrew@email.com", student.getEmail());
		assertEquals("doof@email.com", faculty.getEmail());
		assertEquals("dummy@email.com", nonfaculty.getEmail());
		assertEquals("no@email.com", visitor.getEmail());
		assertEquals("noob@email.com", manager.getEmail());
		assertEquals("boss@email.com", superManager.getEmail());
	}
	
	@Test
	public void getPassword() {
		assertEquals(password, student.getPassword());
		assertEquals(password, faculty.getPassword());
		assertEquals(password, nonfaculty.getPassword());
		assertEquals(password, visitor.getPassword());
		assertEquals(password, manager.getPassword());
		assertEquals(password, superManager.getPassword());
	}
	
	@Test
	public void isValidated() {
		assertEquals(false, student.isValidated());
		assertEquals(false, faculty.isValidated());
		assertEquals(false, nonfaculty.isValidated());
		assertEquals(false, visitor.isValidated());
		assertEquals(true, manager.isValidated());
		assertEquals(true, superManager.isValidated());
	}
}
