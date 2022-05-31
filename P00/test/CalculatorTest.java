import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Wong Qian Yi
 * Student ID: 21027604
 * Class: C208-2S4S-W64L
 * Date/Time created: Tuesday 31-05-2022 12:25
 */

/**
 * @author Wong Qian Yi
 *
 */
public class CalculatorTest {

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 20;
		int b = 10;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 30;
		assertEquals (expected,actual);
	}
	@Test
	public void testAddBoundaryMin() {
		int a = 0;
		int b = 0;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 0;
		assertEquals(expected,actual);
	}
	@Test
	public void testAddBoundaryMax() {
		int a = 0;
		int b = 9999;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals(expected,actual);
	}
	@Test
	public void addError() {
		int a = 0;
		int b = 9999;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		String expected = "Error!";
		assertNotEquals(expected, actual);
		
		boolean actualBound = cal.boundary(a, b);
		boolean expectedBoundary = false;
		assertEquals (expectedBoundary, actualBound);
	}
	@Test
	public void testSubtract() {
		int a = 20;
		int b = 10;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 10;
		assertEquals (expected,actual);
	}
	@Test
	public void testSubtractBoundaryMin() {
		int a = 0;
		int b = 0;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 0;
		assertEquals (expected,actual);
	}
	@Test
	public void testSubtractBoundaryMax() {
		int a = 0;
		int b = 9999;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 9999;
		assertEquals (expected,actual);
	}
	@Test
	public void subtractError() {
		int a = 0;
		int b = 9999;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		String expected = "Error!";
		assertNotEquals (expected,actual);
		
		boolean actualBound = cal.boundary(a, b);
		boolean expectedBoundary = false;
		assertEquals (expectedBoundary, actualBound);
	}
	@Test
	public void testMultiply() {
		int a = 20;
		int b = 10;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int expected = 200;
		assertEquals (expected,actual);
	}
	@Test
	public void testMultipleBoundary() {
		int a = 0;
		int b = 9999;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int expected = 0;
		assertEquals (expected,actual);
		
		boolean actualBound = cal.boundary(a, b);
		boolean expectedBoundary = false;
		assertEquals (expectedBoundary, actualBound);
	}
	@Test
	public void testMultiplyError() {
		int a = 9999;
		int b = 0;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		String expected = "Error!";
		assertNotEquals (expected,actual);
		
		boolean actualBound = cal.boundary(a, b);
		boolean expectedBoundary = false;
		assertEquals (expectedBoundary, actualBound);
	}
	@Test
	public void testDivide() {
		int a = 20;
		int b = 10;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 2;
		assertEquals (expected,actual);
	}
	@Test 
	public void testDivideBoundary() {
		int a = 0;
		int b = 9999;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 0;
		assertEquals (expected,actual);
		
		boolean actualBound = cal.boundary(a, b);
		boolean expectedBoundary = false;
		assertEquals (expectedBoundary, actualBound);
	}
	@Test
	public void testDivideError() {
		int a = 9999;
		int b = -1;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		String expected = "Error!";
		assertNotEquals (expected,actual);
		
		boolean actualBound = cal.boundary(a, b);
		boolean expectedBoundary = false;
		assertEquals (expectedBoundary, actualBound);
	}
}
