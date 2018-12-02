package testNGAnotherPackage;

import org.testng.annotations.Test;

public class TimeOut {
	//Timeout will be work like Explicit wait 
	@Test(timeOut=5000)
	
	public void divide() {
		System.out.println("5000");
	}
	
	@Test(timeOut=2000)
	public void divideenableOne() {
		System.out.println("2000");
	}

	@Test(timeOut=4000)
	public void divideenableTwo() {
		System.out.println("4000");
	}

}
