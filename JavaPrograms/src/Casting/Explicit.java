package Casting;

public class Explicit {     //Narrowing Type Casting
	
	public static void main(String[] args) {
		
		double a = 143.65;            //memory size 8 byte
		System.out.println(a);
		
		int b = (int) a;             //memory size 4 byte  //casting operator
		System.out.println(b);
		
		byte c = (byte) a;           //memory size 1 byte
		System.out.println(b);
	}

}
