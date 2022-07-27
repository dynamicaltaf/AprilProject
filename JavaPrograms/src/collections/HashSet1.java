package collections;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet <Integer> set = new HashSet<>();
		
		set.add(10);
		set.add(4);
		set.add(11);
		set.add(2);
		set.add(7);		
		// insertion order not maintain
		// Advance for loop
		for (int i : set) {
			System.out.println(i);			
		}
	}
}
