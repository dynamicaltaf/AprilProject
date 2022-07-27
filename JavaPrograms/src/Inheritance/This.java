package Inheritance;

public class This {

	int a=80;  //global variable
	
	public void add() {
		
		int a = 50;  //local variable
		
		System.out.println(a);    //local variable
		System.out.println(this.a); //global variable
	}
	public static void main(String[] args) {
		This x = new This();
		x.add();
	}
}
