package Constructor;

public class Sample {

	public void M1 () { //Method
		System.out.println("Main method : M1");     
		
	}
	
	public static void main(String[] args) {
		
		Sample x = new Sample();  //called in same class
		
		x.M1();
	}
}
