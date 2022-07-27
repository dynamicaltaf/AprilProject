package Array;

public class Array3 {
	
	public static void main(String[] args) {
		
		int [] ar = new int [5];            //or we can write ===> String ar[] 
		
		ar [0] = 0001;
		ar [1] = 1111;
		ar [2] = 2222;
		ar [3] = 3333;
		ar [4] = 4444;
		
		System.out.println("--------------Print all the information in array--------------");
		
		for (int i=0; i<=4; i++) {
			System.out.println(ar[i]);		
			
		}	
	}

}
