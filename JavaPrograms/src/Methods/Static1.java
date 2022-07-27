package Methods;

public class Static1 {
	
	static int a = 20;   //static variable
	
	public static void main(String[] args) {
		
		Static1 x1 = new Static1();    //object creation
		Static1 x2 = new Static1();
		Static1 x3 = new Static1();
		
		
	//calling variable a with ref variable
		
		System.out.println(x1.a);
		System.out.println(x2.a);
		System.out.println(x3.a);
		
		x3.a=30;  //assign value to variable a wiht obj ref
		
		System.out.println(x3.a);
		System.out.println(x1.a);  //gives output as same value....
		System.out.println(x2.a);  //...stored in static memory
	}

}
