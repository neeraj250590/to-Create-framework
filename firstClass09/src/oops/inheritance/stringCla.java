package oops.inheritance;

public class stringCla {
	
	public void string() {
		
	
	String Expected = "Test";
	
	String Actual = "TE st";
	
	if (Expected.toUpperCase().replaceAll(" ", "").contains(Actual.toUpperCase().replaceAll(" ", ""))) {
		
		System.out.println("pass");
		
	}
	else {

		System.out.println("fail");
	}
	}
		

}
