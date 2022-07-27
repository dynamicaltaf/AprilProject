package Practice;

public class p6 {

	public static void main(String[] args) {
		
		String a = "MOM";
		String rev = "";
		for (int i=a.length()-1; i>=0; i--) {
			rev= rev+a.charAt(i);
		}
		System.out.println(rev);
		if (a.equals(rev)){
			System.out.println("Given string is a palindrome");
		}
		else {
			System.out.println("Given string is not a palindrome");
		}

	}

}
