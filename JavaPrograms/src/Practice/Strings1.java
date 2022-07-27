package Practice;

public class Strings1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "velocity";
		String s4 = "velocity";
		String s2 = "VELOCITY";
		String s3 = "CITY";
		
		String s5 = "hello";
		String s6 = "meklo";
		String s7 = "QWERasdZXC";
		
		System.out.println(s5.compareTo(s6));
		System.out.println(s1.concat(s6));
		System.out.println(s7.compareToIgnoreCase(s7));
		System.out.println(s1.substring(3));
		System.out.println(s1.subSequence(2, 4));
		System.out.println(s5.endsWith("lo"));
		System.out.println(s5.startsWith("he"));

	}

}
