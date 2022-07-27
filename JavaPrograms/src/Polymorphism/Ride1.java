package Polymorphism;

public class Ride1 extends Ride {   //super class method is hide
	

	public static void M1() {   
		
		System.out.println("M1 is not running");   //change implementation
	}
	public static void main(String[] args) {
		Ride1 x = new Ride1 ();
		
	//	Ride1.M1();       //we can call directly without creating objects
		
		x.M1();
	}
}
