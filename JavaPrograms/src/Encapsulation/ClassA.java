package Encapsulation;

public class ClassA {
	private int a=50;
	static private int b=60;
	
	public static void set(int d) {
		b=d;
		System.out.println(b);
	}
	public int get() {
		return a;
	}

}
