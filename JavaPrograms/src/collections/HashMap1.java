package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap <Integer, String> map = new HashMap <> ();
		
		map.put(34, "Velocity");
		map.put(45, null);
		map.put(45, "Testing");
		map.put(21, null);
		map.put(null, "Flipkart");
		map.put(67, "Pune");
		
		for (Map.Entry<Integer,String> e : map.entrySet()) 
		{
			System.out.println("Key " + e.getKey()+ " Value " + e.getValue());
			
		}
		System.out.println("==========================================");
		map.put(32, "System");
		
		for (Map.Entry<Integer,String> e : map.entrySet()) 
		{
			System.out.println("Key " + e.getKey()+ " Value " + e.getValue());
	    }
    }
}
