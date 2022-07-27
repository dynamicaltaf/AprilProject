package Methods;

public class staticarguments {
	
	public static void addition(int a, int b) { //static with args
		int c = a+b;
		System.out.println("Addition = " + c);
		
	}
	public void multiplication(int a, int b) { // non static with args
		int c = a*b;
		System.out.println("multiplication = " +c);
	}
	public static void main(String[] args) {
		addition (90, 100);
		staticarguments x = new staticarguments(); //object for non static
		
		x.multiplication(10,2);
		
	}

}
