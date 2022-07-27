package Methods;

public class GlobalLocal {
	
	int a=90;   //global variable
	
	public void Demo() {
		int b=80;  //local variable
		System.out.println(a);
		System.out.println(b);
		
	}
	public void Demo1() {
		int c=70;  //local variable
		System.out.println(a);
	//	System.out.println(b);
		System.out.println(c);
				
	}
	public static void main(String[] args) {
		
		GlobalLocal x= new GlobalLocal();
		x.Demo();
		x.Demo1();
	}
	
}
