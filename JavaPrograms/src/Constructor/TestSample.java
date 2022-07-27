package Constructor;

public class TestSample {
	
	public static void main(String[] args) {
		
		System.out.println("Main method started");
		
		Sample x= new Sample(); //user defined constructor
		
		x.M1();               //calling non static method from sample class with creating object
		
		System.out.println("Main method ended");
		
	}

}
