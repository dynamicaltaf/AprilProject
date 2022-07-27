package Polymorphism;

public class Poly1 {
	
	public void addition (int a, int b) {
		
		System.out.println("addition ="+ (a+b));
	}
	public void addition (int a, int b, int c) {
		
		System.out.println("addition =" + (a+b+c));
	}
	public static void main(String[] args) {
		Poly1 p = new Poly1();
		p.addition(100, 200);
		p.addition(200, 300, 400);
	}

}
