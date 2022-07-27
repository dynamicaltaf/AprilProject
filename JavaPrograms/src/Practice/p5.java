package Practice;

public class p5 {

	public static void main(String[] args) {
		
		String a = "Altaf Muddassar";
		String rev = " ";
		
		for (int i=a.length()-1; i>=0; i--) {
			rev = rev + a.charAt(i);			
		}
		System.out.println(rev);
	}

}
 