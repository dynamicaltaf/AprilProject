package collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTable1 {
	
public static void main(String[] args) { //null point exception //does not allow null key
		
		Hashtable <Integer, String> map = new Hashtable <> ();
		
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
