package FinalActivity;

import org.junit.Test;

public class StudentTest {
	@Test
	public void testSchoolName() {
		Student test = new Student();
		test.setSchool("TSI");
		assert(test.getSchool() != "TSI");
	}
	

}
