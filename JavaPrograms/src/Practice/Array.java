package Practice;

import java.util.Arrays;

public class Array {
	
	public static void main(String[] args) {
		
		int [] ar = {10, 50, 30, 20,80,60};
		
		for (int i=0; i<=ar.length-1; i++) {  //printing array
			System.out.println(ar[i]);
		}
		System.out.println("_______________________");
		
		Arrays.sort(ar);
		for (int i=0; i<=ar.length-1; i++) {
			System.out.println(ar[i]);
		}
		System.out.println("_______________________");
		
		for (int i= ar.length-1; i>=0; i--) {
			System.out.println(ar[i]);
			
		}
	}

}
