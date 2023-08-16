package testNGConcepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeMethod
	public void beforeMethod () {
		System.out.println("This is before each test case");
		
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is after each test case");
			}
	@Test
	public void testOne() {
		System.out.println("Test");
	}
	@Test
	public void testTwo() {
		System.out.println("Test");

	}
	@Test
	public void testThree() {
		System.out.println("Test");

	}
	@Test
	public void testFour() {
		System.out.println("Test");

	}
	
}
