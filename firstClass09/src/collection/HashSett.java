package collection;

//import java.util.ArrayList;
import java.util.HashSet;

import java.util.Iterator;

public class HashSett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Maven");
		hs.add("Neeraj1");
		hs.add("Shukla1");
		hs.add("Shukla11");
		hs.add(null);
	/*	System.out.println(hs); // it will print the output in random basis and it will remove the duplicate value
								// and not allow

		System.out.println(hs.contains("Maven"));
		hs.isEmpty();
		hs.remove("maven");*/

		System.out.println(hs.size());

		Iterator<String> i = hs.iterator();
	/*	System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());*/
	//	System.out.println(i.next());

		while (i.hasNext()) {                             //  hasNext - it will check the value is present or not and will not show error if value is not present
			
			System.out.println(i.next());
		}
	}

}
