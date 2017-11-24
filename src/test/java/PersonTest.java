import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Person;

public class PersonTest {
	Person p = new Person("Rafael", "Silva", 30, 'M');

	@Test
	public void testSetAndGetFirstName() {
		p.setFirstName("Rafael2");
		assertEquals(p.getFirstName().equals("Rafael2"), true);
	}

	@Test
	public void testSetAndGetLastName() {
		p.setLastName("Silva2");
		assertEquals(p.getLastName().equals("Silva2"), true);
	}

	@Test
	public void testSetAndGetAge() {
		p.setAge(25);
		assertEquals(p.getAge() == 25, true);
	}

	@Test
	public void testSetAndGetGender() {
		p.setGender('M');
		assertEquals(p.getGender() == 'M', true);
	}

}
