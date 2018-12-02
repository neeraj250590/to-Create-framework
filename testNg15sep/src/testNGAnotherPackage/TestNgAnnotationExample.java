package testNGAnotherPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotationExample {
	//Timeout will be work like Explicit wait 
	@BeforeSuite
	public void one() {
		System.out.println("I am Before suite");
		
	}
	
	@BeforeTest
	public void two() {
		System.out.println("I am Before test");
	}
	@BeforeClass
	public void three() {
		System.out.println("I am Before class");
		
	}
	@BeforeMethod
	public void four() {
		System.out.println("I am Before method");
		
	}
	@Test
	public void nine() {
		System.out.println("This is nine ");
		
	}
	@Test
	public void ten() {
		System.out.println("This is test ten ");
		
	}
	
	@AfterMethod
	public void five() {
		System.out.println("I am After method");
		
	}
	@AfterClass
	public void six() {
		System.out.println("I am After Class");
		
	}
	@AfterTest
	public void seven() {
		System.out.println("I am After Test");
		
	}
	@AfterSuite
	public void eight() {
		System.out.println("I am After Suite");	
		
	}
	
	/*@BeforeMethod
	public void eleven() {
		System.out.println("I am second before method");	
		
	}*/
	
}
