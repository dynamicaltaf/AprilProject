package exceptionsHandling;

public class Exception1 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int c=0;
		int [] d = {15,25,12,30};
		System.out.println("start");
		
		try {
			c = a/b;                // Risky code
			System.out.println(d[8]);
		}
		catch (ArithmeticException e) {
			//alternative code
			System.out.println("Alternative code");
			b=2; 
			c=a/b;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of bounds");
			
		}
		System.out.println(c);
		System.out.println(d[2]);
	}
}
