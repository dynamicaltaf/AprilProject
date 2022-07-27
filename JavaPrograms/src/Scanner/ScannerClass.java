package Scanner;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Demo = new Scanner(System.in);
		
		System.out.println("Enter the intiger: ");
		int Value = Demo.nextInt();
		System.out.println("You entred value is: " + Value);
		
		
		System.out.println("Enter the float: ");
		float sd = Demo.nextFloat();
		System.out.println("You entred the value is: " + sd);
		
		System.out.println("Enter the String : ");
		String sf = Demo.next()	;
		System.out.println("You entred String is: "+ sf);
	}

}
