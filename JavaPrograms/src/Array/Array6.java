package Array;

import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		
		int ar []= {1,2,3,4,1,4,5,6,2,4,8,7,};
		Arrays.sort(ar);
		for (int i=0; i<ar.length-1; i++) {
				
				if (ar[i]==ar[i+1]) {
					System.out.println(ar[i]);}
			}
		}
	}

