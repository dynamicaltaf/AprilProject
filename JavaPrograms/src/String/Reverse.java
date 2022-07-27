package String;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Altaf Muddassar";
		String rev = "";        //yticolev
		
		for (int i= a.length()-1; i>=0; i--) {
			rev = rev + a.charAt(i);
		}
		System.out.println(rev);
	}

}
