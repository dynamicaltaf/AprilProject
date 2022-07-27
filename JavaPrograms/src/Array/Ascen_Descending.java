package Array;

import java.util.Arrays;

public class Ascen_Descending {
	
	public static void main(String[] args) {
		int ar [] = {10, 50, 30, 70, 20, 80};
		
		System.out.println("_________Original info from Array_________");
		for (int i=0; i<=ar.length-1; i++) {
			System.out.println(ar[i]);
		}
		Arrays.sort(ar);
		System.out.println("_________Array in ascending order_________");
		for (int i=0; i<=ar.length-1; i++) {
		System.out.println(ar[i]);
		}
		System.out.println("_________Array in descending order_________");
		for (int i=ar.length-1; i>=0; i--) {
			System.out.println(ar[i]);
		}
	}
}


