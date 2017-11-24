import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Student;

public class StudentTest {
	Student s = new Student("Rafael", "Silva", 31, 'M');
	Student s2 = new Student("Rafael", "Silva", 31, 'M', 3.4, 5.5, 6.5);

	@Test
	public void testSetandGetFirstName() {
		s.setFirstName("Rafael2");
		assertEquals(s.getFirstName().equals("Rafael2"), true);
	}

	@Test
	public void testSetandGetLastName() {
		s.setLastName("Silva2");
		assertEquals(s.getLastName().equals("Silva2"), true);
	}

	@Test
	public void testSetandGetAge() {
		s.setAge(25);
		assertEquals(s.getAge() == 25, true);
	}

	@Test
	public void testSetandGetGender() {
		s.setGender('M');
		assertEquals(s.getGender() == 'M', true);
	}

	@Test
	public void testSetandGetFirstGrade() {
		s.setFirstGrade(5.5);
		assertEquals(s.getFirstGrade() == 5.5, true);
	}

	@Test
	public void testSetandGetSecondGrade() {
		s.setSecondGrade(6.5);
		assertEquals(s.getSecondGrade() == 6.5, true);
	}

	@Test
	public void testSetandGetThirdGrade() {
		s.setThirdGrade(7.5);
		assertEquals(s.getThirdGrade() == 7.5, true);
	}

	@Test
	public void testSetandGetAverageGrade() {
		s.setAverageGrade(5.0);
		assertEquals(s.getAverageGrade() == 5.0, true);
	}

	@Test
	public void testCalculateAveragewithParam() {
		s.setSecondGrade(5);
		s.setThirdGrade(5);
		double result = s.calculateAverage(5);

		assertEquals((s.getAverageGrade() == result) && (result == 5), true);
	}

	@Test
	public void testCalculateAveragewithNoParam() {
		s.setFirstGrade(5);
		s.setSecondGrade(5);
		s.setThirdGrade(5);
		s.calculateAverage();

		assertEquals((s.getAverageGrade() == 5), true);

	}

	@Test
	public void testCalculateAveragewithAllParam() {
		double result = s.calculateAverage(5, 5, 5);
		assertEquals((s.getAverageGrade() == result) && (result == 5), true);
	}
		
	@Test
	public void testHasClearedTheCourse() {
		s.setAverageGrade(6.0);
		assertEquals(s.hasClearedTheCourse(), true);
		
		s.setAverageGrade(4.0);
		assertEquals(s.hasClearedTheCourse(), false);
	}
	
	@Test
	public void testToString() {
		s.setFirstGrade(5.0);
		s.setSecondGrade(5);
		s.setThirdGrade(5);
		//System.out.println(s.toString());
		
		String expected = "The student has not cleared the course";
			
		assertEquals(s.toString().contains(expected), true);
		
		s.setFirstGrade(7.0);
		s.setSecondGrade(7);
		s.setThirdGrade(7);
		//System.out.println(s.toString());
		
		String expected2 = "The student has cleared the course";
			
		assertEquals(s.toString().contains(expected2), true);
	}

}
