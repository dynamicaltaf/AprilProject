package Array;

public class Array1 {
	
	public static void main(String[] args) {
		
		String [] ar = new String [5];            //or we can write ===> String ar[] 
		
		ar [0] = "Automation";
		ar [1] = "Manual";
		ar [2] = "API";
		ar [3] = "Selenium";
		ar [4] = "JAVA";
 	//  ar [5] = "Default";      //Array out of bound exception when we increase limit
		
		System.out.println(ar[1]);  //with the help of index Array called
		
		System.out.println("--------------Print all the information in array--------------");
		System.out.println("______________Print all the information in array______________");
		
		for (int i=0; i<=4; i++) {
			System.out.println(ar[i]);
		}		
	}
}
