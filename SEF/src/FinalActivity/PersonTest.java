package FinalActivity;

import org.junit.Test;

public class PersonTest {
	
	@Test
	public void testName() {
		Person test = new Person();
		test.setName("Bill");
		assert(test.getName() != "Bill");
	}
	@Test
	public void testAge() {
		Person test = new Person();
		test.setAge(18);
		assert(test.getAge() != 18);
	}
	@Test
	public void testConstructor() {
		Person test = new Person("Bill", 18);
		test.setName("Bill");
		assert((test.getAge() == 43) && (test.getName() == "Bill"));
	}

}
