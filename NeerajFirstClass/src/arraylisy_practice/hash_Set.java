package arraylisy_practice;

import java.util.HashSet;

public class hash_Set {

	public static void main(String args[]) {
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Neeraj");
		hs.add("Shukla");
		hs.add("Shukla");
		hs.add(null);
		System.out.println(hs.size());
		System.out.println(hs); // Duplicate value is not allowed and it print the value on random indexing
		
		
	}
}
