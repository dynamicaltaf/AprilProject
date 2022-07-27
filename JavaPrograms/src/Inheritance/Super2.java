package Inheritance;

public class Super2 extends Super1 {
	
	int a = 110;  //local variable
	
	public void Demo() {
		System.out.println(this.a);
		System.out.println(super.a);
	}
	public static void main(String[] args) {
		
		Super2 s = new Super2();
		s.Test();
		s.Demo();
		
	//	System.out.println(this.a);
	}

}
