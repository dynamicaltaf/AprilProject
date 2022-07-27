package Practice;

public class P7 {

	public static void main(String[] args) { //factorial   (5*4*3*2*1)
		
		long a =49L;                 // or we can use int // Long for more memory size 8bytes
		Long fact = 1L;
		for (Long i=a; i>=1;i--) {
			fact = fact*i;
							
		}
		System.out.println(fact);		
	}
}


