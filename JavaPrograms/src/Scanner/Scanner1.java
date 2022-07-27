package Scanner;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
	
		Scanner Demo = new Scanner (System.in);   //Scanner Class object
		System.out.println("Enter the integer :");
		
		int Value = Demo.nextInt();
        System.out.println("Enter the Value is " + Value);
        
        System.out.println("Enter the float:");
        float sd = Demo.nextFloat();
        
        System.out.println(" You entered value is " + sd);
        
        System.out.println("Enter the String: ");
        String sf = Demo.next();
        
        Demo.close();
        
	}

}
