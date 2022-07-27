package Interface;

public class Test implements Interface {
	
	public void M1() {
			int a = 10;
			int b = 20;
			int c= a+b;
	System.out.println("Running M1 Method");
	}
	
	public void M2() {
		System.out.println("Running M2 Method");
	}
	public static void main(String[] args) {
		
		Test t = new Test();   //called in same class or we can call in diff. class
		t.M1();
		t.M2();
		//t.a();  
	}
}
