package testNGAnotherPackage;

import org.testng.annotations.Test;

public class dependsonMethd {
	//Timeout will be work like Explicit wait 
	@Test(dependsOnMethods="zend")
	public void divide() {
		System.out.println("divide");
	}
	
	@Test(groups={"neeraj","regression"})
	public void zend() {
		System.out.println("Zend");
		
	}

}
