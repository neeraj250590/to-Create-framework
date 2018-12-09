package oops.constructor;

public class girlchild extends parent{

	
public void Gname() {
		
		System.out.println("Aishwarya");
	}
	
public void mobilenumber() {
	
	System.out.println("1234567890");
}

public void surname() {
	
	System.out.println("rai");
	super.surname();    // super keyword use for getting the method value of parent
}

public girlchild() {
	super();
	System.out.println("child constructor");
}

}
