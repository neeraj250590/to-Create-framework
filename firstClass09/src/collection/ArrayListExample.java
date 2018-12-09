package collection;
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Neeraj");
		ar.add("Shukla");

		ar.add("Maven");
		ar.add("Neeraj1");
		ar.add("Shukla1");

		ar.add("Maven1");
		ar.add(" ");
	//	ar.add(null);
		// to print all values
		System.out.println(ar);
		
		// To print specific value
		System.out.println(ar.get(2));
		
		// To remove the value
		ar.remove(1);
		ar.remove("Neeraj1");
		System.out.println(ar.remove("test"));;      // it will return false bcz this value doesnt exist
		System.out.println(ar);
		
		
	//	ar.removeAll(null);   // it will remove complete array
		
		System.out.println(ar.contains("Shukla"));
		ar.add("hello");
		System.out.println(ar.add("test"));
		
		ar.size();
		System.out.println(ar.size());
		
		ar.isEmpty();
		
		ar.add(4, "oye");     // updating the index value
		
		System.out.println(ar);
		
		
	}

}
