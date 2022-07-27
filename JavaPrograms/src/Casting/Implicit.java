package Casting;

public class Implicit {   //also known as Widening type casting

	public static void main(String[] args) {
		
		byte a = 15;             //memory size is 1 byte
	//	System.out.println(a);
		
		int b=a;
		System.out.println(b);   //memory size is 4 byte
		
		double c=b;              //memory size is 8 byte 
		System.out.println(c);
		
	}
}
