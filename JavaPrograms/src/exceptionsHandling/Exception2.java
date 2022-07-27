package exceptionsHandling;

public class Exception2 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		int c=0;
		int [] d = {15,25,12,30};
		System.out.println("start");
		
		try {
			c = a/b;                    // Risky code
		//	System.out.println(d[8]);   //Array out of bound
		}
		catch (ArithmeticException e) {
			//alternative code
			b=2; 
			c=a/b;
			System.out.println("Alternative code");
			System.out.println("catch block executed");
		}
		finally {
			System.out.println("Execution of finally block");
		}
		System.out.println(c);
		System.out.println("end");  //normal flow
        // Exception is not generated ==> try - finally - normal flow
		//Exception generated but not handled ==> try - finally
		//Exception generated and handled ==> try- catch- finally- normal flow
	}

}
