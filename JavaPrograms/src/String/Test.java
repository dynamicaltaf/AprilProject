package String;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "velocity";
		String b = "velocity";
			
		String c = new String ("velocity");
		String d = new String ("velocity");
		
		System.out.println(a==b);     //True
		System.out.println(c==d);     //False
		System.out.println(a==d);     //False
		
		System.out.println("---------------------------------------------");
		
		b = "class";
		System.out.println(b);
		System.out.println(a);
		System.out.println(a==b);
		System.out.println("--------------------------");
		
		b = "velocity";
		System.out.println(b);
		System.out.println(a);
		System.out.println(a==b);

	}

}
