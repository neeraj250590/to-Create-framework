package testNGAnotherPackage;

import org.testng.annotations.Test;

public class EnableUse {

	@Test(enabled =false)
	
	public void divide() {
		System.out.println("another one package");
	}
	
	@Test(enabled = true)

	public void divideenableOne() {
		System.out.println("another one package");
	}

	@Test

	public void divideenableTwo() {
		System.out.println("another one package");
	}

}
