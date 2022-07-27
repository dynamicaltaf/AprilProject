package Encapsulation;

public class ClassB extends ClassA {
	
	public static void main(String[] args) {
		ClassA.set(1245);
		
		ClassB x = new ClassB ();
		
		int y = x.get();
		System.out.println(y);
	}

}
