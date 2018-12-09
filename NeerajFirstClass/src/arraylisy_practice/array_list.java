package arraylisy_practice;

import java.util.ArrayList;

public class array_list {
	
	public static void main(String[] args) {
	try {
		
	
		// TODO: handle exception
		
		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("Neeraj");
		ar.add("Shukla");
		ar.add("Surname");
		ar.add("Surname");
		ar.add(null);
		System.out.println(ar.size());
		System.out.println(ar.remove(10)); 
	} catch (Exception e) {	
		
	System.out.println("asds");
		    // Indexing is fixed in this and duplicate value is allowed
	}	
		
	}

}
