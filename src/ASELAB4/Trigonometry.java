package ASELAB4;

import static org.junit.Assert.assertEquals;


import org.junit.Test;


public class Trigonometry {
	double allowedDecimals = 0.001;
	
	//Unit testing: Test case for Factorial
	/**
	 * test case for +ve value
	 * Expected Result: 39916800
	 * Actual Result: 39916800
	 * @throws Exception
	 */
	@Test
	public void factorial_1() throws Exception {
		assertEquals(39916800, LibraryforTrigonometry.fact(11));
	}
	
	/**
	 * test case  for -ve value
	 * Expected Result: -1
	 * Actual Result: -1
	 * @throws Exception
	 */
	@Test
	public void factorial_2() throws Exception {
		assertEquals(1, LibraryforTrigonometry.fact(-1));
	}
	
	/**
	 * test case for 0 value
	 * Expected Result: 1
	 * Actual Result: 1
	 * Result: Success
	 * @throws Exception
	 */
	@Test
	public void factorial_3() throws Exception {
		assertEquals(1, LibraryforTrigonometry.fact(0));
	}
	
	//Unit testing: Test case for checking power
	/**
	 * test case comparing with math library positive value
	 * Expected Result: 4096
	 * Actual Result: 4096
	 * Result: Success
	 * @throws Exception
	 */
	@Test
	public void power() throws Exception {
		assertEquals(Math.pow(8,4),LibraryforTrigonometry.power(8,4),0);
	}
	
	/**
	 * test case comparing with math library negative value
	 * Expected Result: 0.25
	 * Actual Result: Exception
	 * Result: Success
	 * @throws Exception
	 */
	@Test
	public void power_1() throws Exception {
		assertEquals(Math.pow(2,-2),LibraryforTrigonometry.power(2,-2),0);
	}
	
	/**
	 * test case comparing with math library float value
	 * Expected Result: 19.36
	 * Actual Result: 19.36
	 * Result: Success
	 * @throws Exception
	 */
	@Test
	public void power_2() throws Exception {
		assertEquals(Math.pow(4.4,2),LibraryforTrigonometry.power(4.4,2),0);
	}

	/**
	 * test case comparing with math library from degree to radians
	 * inserted value: 90
	 * Expected Result: 1.5708
	 * Actual Result: 1.5708
	 * Result: Success
	 * @throws Exception
	 */		
	@Test
	public void degreeToRadianTest() throws Exception {
		assertEquals(Math.toRadians(90),LibraryforTrigonometry.degreeToRadian(90),allowedDecimals);
	}
	
	/**
	 * Success: test case comparing with math library from degree to radians
	 * inserted value: 1.333
	 * Expected Result: 76.375274
	 * Actual Result: 76.375274
	 * Result: Success
	 * @throws Exception
	 */		

	@Test
	public void radianToDegreeTest() throws Exception {
		assertEquals(Math.toDegrees(1.333),LibraryforTrigonometry.radianToDegree(1.333),allowedDecimals);
	}
		
	/**
	 * Success: test case for sin function for degree value
	 * inserted value: 19
	 * Expected Result: 0.3255
	 * Actual Result: 0.3255
	 * Result: Success
	 * @throws Exception
	 */	
	@Test
	public void sinTest_1() throws Exception {
		assertEquals(0.3255, LibraryforTrigonometry.sin(LibraryforTrigonometry.degreeToRadian(19)), allowedDecimals);	
	}
	
	@Test
	public void sinTest_2() throws Exception {
		assertEquals(Math.sin(1.9998), LibraryforTrigonometry.sin(1.9998), allowedDecimals);
	}
	
	@Test
	public void sinTest_3() throws Exception {
		assertEquals(LibraryforTrigonometry.sin(Math.toDegrees(3.21)), LibraryforTrigonometry.sin(LibraryforTrigonometry.radianToDegree(3.21)), allowedDecimals);
	}
	
	@Test
	public void sinTest_4() throws Exception {
		assertEquals(LibraryforTrigonometry.sin(Math.toRadians(235)), LibraryforTrigonometry.sin(LibraryforTrigonometry.degreeToRadian(235)), allowedDecimals);
	}
	
	@Test
	public void sinTest_5() throws Exception {
		assertEquals(Math.sin(-66), LibraryforTrigonometry.sin(-66), allowedDecimals);
	}
	
	@Test
	public void cosTest_1() throws Exception {
		assertEquals(0.9205, LibraryforTrigonometry.cos(LibraryforTrigonometry.degreeToRadian(23)), allowedDecimals);
	}
	
	@Test
	public void cosTest_2() throws Exception {
		assertEquals(Math.cos(4.333), LibraryforTrigonometry.cos(4.333), allowedDecimals);
	}
	
	@Test
	public void cosTest_3() throws Exception {
		assertEquals(LibraryforTrigonometry.cos(Math.toDegrees(5.333)), LibraryforTrigonometry.cos(LibraryforTrigonometry.radianToDegree(5.333)), allowedDecimals);
	}
	
	@Test
	public void cosTest_4() throws Exception {
		assertEquals(LibraryforTrigonometry.cos(Math.toRadians(333)), LibraryforTrigonometry.cos(LibraryforTrigonometry.degreeToRadian(333)), allowedDecimals);
	}
	
	@Test
	public void cosTest_5() throws Exception {
		assertEquals(Math.cos(-45), LibraryforTrigonometry.cos(-45), allowedDecimals);
	}

	//Test cases for four quadrants for tan
	@Test
	public void tanTest_1() throws Exception { 
		assertEquals(1, LibraryforTrigonometry.tan(LibraryforTrigonometry.degreeToRadian(45)), allowedDecimals);
	}
	
	/**
	 * Success: test case comparing with math library
	 * inserted value: 2.333
	 * Result: Success
	 * @throws Exception
	 */	
	@Test
	public void tanTest_2() throws Exception {
		assertEquals(Math.tan(2.333), LibraryforTrigonometry.tan(2.333), allowedDecimals);
	}
	

	@Test
	public void tanTest_3() throws Exception {
		assertEquals(LibraryforTrigonometry.tan(Math.toDegrees(2.89)), LibraryforTrigonometry.tan(LibraryforTrigonometry.radianToDegree(2.89)), allowedDecimals);
	}

	@Test
	public void tanTest_4() throws Exception {
		assertEquals(LibraryforTrigonometry.tan(Math.toRadians(333)), LibraryforTrigonometry.tan(LibraryforTrigonometry.degreeToRadian(333)), allowedDecimals);
	}
	
	@Test
	public void tanTest_5() throws Exception {
		assertEquals(Math.tan(-30), LibraryforTrigonometry.tan(-30), allowedDecimals);
	}
	
	@Test
	public void tanTest_6() throws Exception {
		assertEquals(Math.tan(1.156), LibraryforTrigonometry.tan(1.156), allowedDecimals);
	}
	
	@Test
	public void tanTest_7() throws Exception {
		assertEquals(Math.tan(1.5707963268), LibraryforTrigonometry.tan(1.5707963268), allowedDecimals);
	}
}
