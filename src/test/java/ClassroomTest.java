import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import otherclasses.Classroom;
import otherclasses.Student;

public class ClassroomTest {
	private ArrayList<Student> students = new ArrayList<Student>();
	Classroom c = new Classroom("Kvalit17", "HT17", students);
	Student student1 = new Student("Ida", "Moström", 26, 'F', 6.2, 5.9, 6.4);
	Student student2 = new Student("Mia", "Moström", 22, 'F', 4.5, 7.9, 6.4);
	Student student3 = new Student("Sara", "Moström", 30, 'F', 5.2, 5.6, 5.4);
	Student student4 = new Student("Emma", "Moström", 31, 'F', 7.1, 4.9, 6.7);
	Student student5 = new Student("Malin", "Moström", 35, 'F', 8.2, 7.9, 6.4);
	Student student6 = new Student("Sofie", "Moström", 36, 'F', 3.4, 5.7, 6.2);

	@Test
	public void testSetAndGetClassroomName() {
		c.setClassroomName("Kvalit17");
		assertEquals(c.getClassroomName().equals("Kvalit17"), true);
	}

	@Test
	public void testSetAndGetClassroomTerm() {
		c.setClassroomTerm("HT17");
		assertEquals(c.getClassroomTerm().equals("HT17"), true);
	}

	@Test
	public void testSetAndGetStudents() {
		c.setStudents(students);
		assertEquals(c.getStudents().equals(students), true);
	}

	@Test
	public void testAddANewStudent() {
		c.addANewStudent(student1);
		c.addANewStudent(student2);
		c.addANewStudent(student3);
		c.addANewStudent(student4);
		c.addANewStudent(student5);
		c.addANewStudent(student6);
		assertEquals(c.getStudents(), students);
	}

	@Test
	public void testRemoveAStudent() {
		c.addANewStudent(student1);
		c.addANewStudent(student2);
		c.addANewStudent(student3);
		c.addANewStudent(student4);
		c.addANewStudent(student5);
		c.addANewStudent(student6);
		c.removeAStudent("Ida");
		c.removeAStudent("Fake");
		assertEquals(c.getStudents().contains("Ida"), false);
		assertEquals(c.getStudents().contains("Fake"), false);
	}

	@Test
	public void testPrintFullRelatory() {
		c.addANewStudent(student1);
		c.addANewStudent(student2);
		c.addANewStudent(student3);
		c.addANewStudent(student4);
		c.addANewStudent(student5);
		c.addANewStudent(student6);
		c.printFullRelatory();
	}
}
