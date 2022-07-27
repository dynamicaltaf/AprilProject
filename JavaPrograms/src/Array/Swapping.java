package Array;

public class Swapping {

	public static void main(String[] args) {
		
		int b = 45;
		int c = 75;
		
		System.out.println("b = " +b);
		System.out.println("c = " +c);
		
		//b=c;
		System.out.println("b = " +b);
		System.out.println("c = " +c);
		
		System.out.println("*****************************");
		
		int x;
		x=b;        //back up of b in x
		b=c;        //75
		c=x;        //45
		System.out.println("b = " +b);
		System.out.println("c = " +c);
		
	}

}
