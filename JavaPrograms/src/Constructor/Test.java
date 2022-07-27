package Constructor;

public class Test {
	int a;      // variable declaration int a
	int b;
	int M;
	String Name;
	String Velocity;
	
	Test(){     //user defined constructor without parameter
		 a=50;
		 b=30;	
	}
	Test (int c, int d) { // user defined with parameter
		a=c;  //initialization
		b=d;
	}
	Test (int c, int d, int i)	{ //user defined with parameter
		a=c;
		b=d;
		M=i;
		System.out.println(a);
	}
	Test (String Name, String Velocity){ //user define with parameter
	}
	public void addition() {  //method
		System.out.println(M+a+b);
		
	}
	public void work() {   //method
		System.out.println("Name");
		System.out.println("Velocity");
		
	}
	public static void main(String[] args) {
		
		Test T = new Test();
		
		T.addition();
		T.work();	
		Test T1 = new Test(100,200);
		T.addition();
	}
}
