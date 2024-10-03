package testNG_program;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sept8th {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}
	@BeforeClass
      public void beforeClass() {
		System.out.println("before class");
	}
	@BeforeMethod
    public void beforeMethod() {
		System.out.println("before method");
	}
	@Test
	public void testcase() {
		System.out.println("tc");
	}
	@AfterMethod
    public void afterMethod() {
		System.out.println("After method");
	}
	@AfterClass
    public void afterClass() {
		System.out.println("After class");
	}
	@AfterTest
    public void afterTest() {
		System.out.println("After test");
	}
	@AfterSuite
    public void afterSuite() {
		System.out.println("After suite");
	}

}
