package Practice;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {

		int ar [] = {10, 50, 30, 70, 20, 80};
		
		System.out.println("_________Printing Array______");
		for (int i= 0; i<=ar.length-1; i++) {
			System.out.println(ar[i]);
		}
		Arrays.sort(ar);
		System.out.println("_________Ascending Order______");
		for (int i= 0; i<=ar.length-1; i++) {
			System.out.println(ar[i]);
		}
		System.out.println("_________Ascending Order______");
		
		for (int i=ar.length-1; i>=0; i--) {
			System.out.println(ar[i]);
		}
	}
}
