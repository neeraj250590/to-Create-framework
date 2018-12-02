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

public class TestNgAnnotationExample2 {
	//Timeout will be work like Explicit wait 
	@BeforeSuite
	public void one() {
		System.out.println("I am Before suite  22222");
		
	}
	
	@BeforeTest
	public void two() {
		System.out.println("I am Before test 22222");
	}
	@BeforeClass
	public void three() {
		System.out.println("I am Before class 22222");
		
	}
	@BeforeMethod
	public void four() {
		System.out.println("I am Before method 22222");
		
	}
	@Test
	public void nine() {
		System.out.println("This is nine 22222");
		
	}
	@Test
	public void ten() {
		System.out.println("This is test ten 22222");
		
	}
	
	@AfterMethod
	public void five() {
		System.out.println("I am After method 22222");
		
	}
	@AfterClass
	public void six() {
		System.out.println("I am After Class 22222");
		
	}
	@AfterTest
	public void seven() {
		System.out.println("I am After Test 22222");
		
	}
	@AfterSuite
	public void eight() {
		System.out.println("I am After Suite 22222");	
		
	}
	
	/*@BeforeMethod
	public void eleven() {
		System.out.println("I am second before method");	
		
	}*/
	
}
