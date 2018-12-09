package arraylisy_practice;

import java.util.Hashtable;

public class MapExample {
public static void main(String[] args) {
	
	Hashtable<String, String> ht = new Hashtable<String, String>();
	ht.put("Employee Id", "123");
	
	System.out.println(ht);
	System.out.println(ht.get("Employee Id"));
}
}
