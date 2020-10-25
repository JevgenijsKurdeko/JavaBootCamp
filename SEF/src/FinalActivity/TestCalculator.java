package FinalActivity;

import junit.framework.TestCase;


public class TestCalculator extends TestCase {
	
	private Second_Activity_Calculator theCalculator;

	protected void setUp() throws Exception {
		super.setUp();
		//	Initialize variables to be used here
		theCalculator = new Second_Activity_Calculator();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
public void testGetSum() {
		
		int a = 3;
		int b = 4;			
		//	Checks the sum of two (2) positive values
		assertEquals(7, (theCalculator.getSum(a,b)));
		assertEquals(7, (theCalculator.getSum(b,a)));	
		
		a = -4;		
		b = -8;		
		//	Checks the sum of two (2) negative values
		assertEquals(-12, (theCalculator.getSum(a,b)));
		assertEquals(-12, (theCalculator.getSum(b,a)));
	}

	public void testGetDifference() {
		
		int a = 4;
		int b = 3;		
		//	Checks if b is lesser than a
		assertEquals(1, (theCalculator.getDifference(a,b)));		
		//	Checks if b is greater than a
		assertEquals(-1, (theCalculator.getDifference(b,a)));

		a = -10;
		b = -5;
		//	Checks if negative value is subtracted from negative value: a > b
		assertEquals(-5, (theCalculator.getDifference(a,b)));		
		//	Checks if negative value is subtracted from negative value: b < a
		assertEquals(5, (theCalculator.getDifference(b,a)));			
	}

	public void testGetProduct() {
		
		double a = 5;
		double b = 10;			
		//	Checks the product of two (2) positive values
		assertEquals(50, (theCalculator.getProduct(a,b)),0);
		assertEquals(50, (theCalculator.getProduct(b,a)),0);		

		a = -3;		
		b = -10;		
		//	Checks the product of two (2) negative values
		assertEquals(30, (theCalculator.getProduct(a,b)),0);
		assertEquals(30, (theCalculator.getProduct(b,a)),0);
	}

	public void testGetQuotient() {

		double a = 10;	double b = 5;		
		//	Checks if b is lesser than a
		assertEquals(2, (theCalculator.getQuotient(a,b)),0);		
		//	Checks if b is greater than a
		assertEquals(0.5, (theCalculator.getQuotient(b,a)),0);
	
		a = -10;	b = -5;
		//	Checks if negative value is divided with negative value: a > b
		assertEquals(2, (theCalculator.getQuotient(a,b)),0);		
		//	Checks if negative value is divided with negative value: b < a
		assertEquals(0.5, (theCalculator.getQuotient(b,a)),0);			
		}

}
