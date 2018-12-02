package testNGAnotherPackage;

import org.testng.annotations.Test;

public class PriorityExample {
	//Timeout will be work like Explicit wait 
	@Test(dependsOnMethods="four")
	public void divide() {
		System.out.println("priority 3");
	}
	
	@Test(priority=1)
	public void zend() {
		System.out.println("Priority 1");
		
	}
	
	@Test(priority=2)
	public void hello() {
		System.out.println("Priority 2");
		
	}
	
	@Test
	public void four() {
		System.out.println("four");
		
	}

}
