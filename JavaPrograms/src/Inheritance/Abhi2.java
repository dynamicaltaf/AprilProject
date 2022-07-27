package Inheritance;

public class Abhi2 extends Abhi1 {   //concrete class
	
	public void show() {
		System.out.println("running show metthod");
	}
	
	public void blank() {   //complete method declare body
		System.out.println("running blank method");
	}
	public static void main(String[] args) {
		
		Abhi2 a = new Abhi2();
		a.Display();
		a.show();
		a.blank();
	}
		
}

