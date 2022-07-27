package Assignment2;

import java.util.Set;
import java.util.TreeSet;

public class abcd {

	public static void main(String[] args) {
		  int a[] = {1,2,3};
		    int b[] = {3,4,5};

		    Set<Integer> setA = toSet(a);
		    Set<Integer> setB = toSet(b);

		    // common = A ∩ B
		    Set<Integer> common = new TreeSet<>(setA); // use TreeSet for sorted result
		    common.retainAll(setB); // intersection: ∩
		    System.out.println("common: " + common);

		    // uncommon = (A ∪ B) \ common
		    Set<Integer> uncommon = new TreeSet<>(setA); // use TreeSet for sorted result
		    uncommon.addAll(setB); // u
}

	private static Set<Integer> toSet(int[] a) {
		 
		return null;
	}
}
