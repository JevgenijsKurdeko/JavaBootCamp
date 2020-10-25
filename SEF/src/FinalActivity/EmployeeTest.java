package FinalActivity;

import org.junit.Test;

public class EmployeeTest {
	
	@Test
	public void testJobTitle() {
		Employee test = new Employee();
		test.setJobTitle("boss");
		assert(test.getJobTitle() != "boss");
	}
	@Test
	public void testCompany() {
		Employee test = new Employee();
		test.setCompany("CocaCola");
		assert(test.getCompany() != "CocaCola");
	}
	@Test
	public void testSalary() {
		Employee test = new Employee();
		test.setSalary(10000);
		assert((test.getSalary() != 10000));
	}

}
