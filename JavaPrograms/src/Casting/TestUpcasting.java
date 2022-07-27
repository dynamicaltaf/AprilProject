package Casting;

public class TestUpcasting {
	
	public static void main(String[] args) {
		
		System.out.println("*****Super Class object");
		Upcasting x = new Upcasting();
		x.demo();
		x.set();
		x.staticTest();
		System.out.println("-------------------------");
		
		System.out.println("*****sub class object*****");
		Upcasting1 y = new Upcasting1 ();
		y.demo();
		y.set();
		y.sub();
		System.out.println("--------------------------");
		
		System.out.println("*****Up casting*****");
		Upcasting z = new Upcasting ();
		z.demo();
		z.set();
		z.staticTest();
		
		Upcasting1 sub = new Upcasting1();    //down casting
		sub.demo(); 
		sub.set();
	}

}
