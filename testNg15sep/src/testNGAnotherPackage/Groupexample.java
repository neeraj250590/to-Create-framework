package testNGAnotherPackage;

import org.testng.annotations.Test;

public class Groupexample {
	//Timeout will be work like Explicit wait 
	@Test(groups={"neeraj","smoke", "e2e"}, dependsOnMethods="zend")
	public void divide() {
		System.out.println("5000");
	}
	
	@Test(groups={"neeraj","regression"})
	public void divideenableOne() {
		System.out.println("2000");
	}
	
	@Test(groups={"neeraj","regression"})
	public void divideenableThree() {
		System.out.println("2000");
	}

	@Test(groups={"neeraj","smoke"})
	public void divideenableTwo() {
		System.out.println("4000");
	}

	@Test(groups={"neeraj","smoke"})
	public void zend() {
		System.out.println("Zeend");
}
}
