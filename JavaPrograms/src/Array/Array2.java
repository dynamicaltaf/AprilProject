package Array;

public class Array2 {
	
		public static void main(String[] args) {   //Printing from bottom to top (it is not reverse string)
			
			String [] ar = new String [5];            //or we can write ===> String ar[] 
			
			ar [0] = "Automation";
			ar [1] = "Manual";
			ar [2] = "API";
			ar [3] = "Selenium";
			ar [4] = "JAVA";
			
			for (int i=4; i>=0; i--) {
				System.out.println(ar[i]);
		}
			 
			
	}

}

