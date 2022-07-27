package collections;

import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {
		
		HashSet <Character> set = new HashSet<>();
		
		set.add('c');
		set.add('$');
		set.add('&');
		set.add('@');
		set.add('#');		
		// insertion order not maintain
		// Advance for loop
		for (char c : set) {
			System.out.println(c);			
		}
	}
}
