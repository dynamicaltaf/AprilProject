package access_Specifier;

public class Access_1 {

	public int a=30;
	private int b= 40; // scope within the class
	protected int c=50;
	int d =60;
	
	public static void main(String[] args) {
		
		Access_1 x = new Access_1();
		
		System.out.println(x.a);
		System.out.println(x.b);
		System.out.println(x.c);
		System.out.println(x.d);
	}	
}
