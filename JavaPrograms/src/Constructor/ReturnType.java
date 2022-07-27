package Constructor;

public class ReturnType {

	static int Demo() {   //user define with int return type
		int x=15;
		int y=25;
		int z= x+y;
		return z;
		
	}

	static String Test() {     //user define with String return type
		return "Welcome";
	}
	public static void main(String [] args) {
		
		int z= Demo();    // calling user define method
		
		String x = Test(); // calling user define method
		System.out.println(z);
		System.out.println(x);
	}
	}


