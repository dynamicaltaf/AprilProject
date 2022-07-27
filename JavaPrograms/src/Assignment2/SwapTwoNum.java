package Assignment2;

public class SwapTwoNum { // Swapping two numbers without third variable

	public static void main(String[] args) {
		
		int a=10; int b=20;
		
		System.out.println("Before swappning values are :" + a +" "+b );
		
		a = a+b;  // a= 10+20 =30
		b = a-b;  // b= 30-20 =10
		a = a-b;  // a= 30-10 =20
		
		System.out.println("After swappning values are :" + a +" "+b);
	}

}
