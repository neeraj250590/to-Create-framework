package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

import java.util.Iterator;
import java.util.Map;

public class Map2 {

	public static void main(String[] args) {
		
	/*	int a= 5;
		Map2 mx = new Map2();*/
		
		
		
		// TODO Auto-generated method stub

	//	HashMap<String, String> hm = new HashMap<String, String>();
		Hashtable<String, String> hm = new Hashtable<String, String>();
		hm.put("EmpId", "qwerty123");
		hm.put("UserName", "Neeraj");
		hm.put("Company", "Maven");
		hm.put("EmpPhn", "5345345345");
	//	hm.put(null, "Maven");
		//hm.put(null, null);
		hm.put("Address", "Janjeer wala");     // key should be unique and value can be same
		System.out.println(hm);
		System.out.println(hm.get("EmpPhn")+" Result");
		
		//hm.remove(null);
		System.out.println(hm);
		
		Set sn = hm.entrySet();
		Iterator i = sn.iterator();
		
		while (i.hasNext()) {
			Map.Entry mp = (Map.Entry) i.next();    // (Map.Entry) - it is a way to tyoe cast the value
			
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			
		}
	}

}
