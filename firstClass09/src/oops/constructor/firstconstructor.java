package oops.constructor;

public class firstconstructor {
	
	int a;                // lobal variable
	
	public firstconstructor() {                               // default constructor bcz there is no parameter
		System.out.println("Calling constructor");
		
	}
	
	public firstconstructor(int a) {                                   // parameterized constructor bcz there is 1 parameter
		System.out.println("1 param constructor");
		
		this.a=a;     // local variable
		System.out.println(this.a);
	}
	
	public firstconstructor(int b, int c) {                              // parameterized constructor
		System.out.println("2 param constructor");
		
	}
	
	public void sample() {                               // parameterized contructor
		System.out.println("a");
	}
	

}
