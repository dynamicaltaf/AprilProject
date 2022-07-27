package Interface;

public class TestMultipleInheritance implements A,B {
	
	public void Q1() {
		System.out.println("Q1 running");
	}
	public void Q2() {
		System.out.println("Q2 running");
	}
	public void Q3() {
		System.out.println("Q3 running");
		
	}
	public void Q4() {
		System.out.println("Q4 running");
	}
	
	public static void main(String[] args) {
		TestMultipleInheritance t = new TestMultipleInheritance();
		t.Q1();
		t.Q2();
		t.Q3();
		t.Q4();
	}

}
