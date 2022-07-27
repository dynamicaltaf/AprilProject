package collections;

public class Generic1 <G> {
	int a;
	G b;	
	

	public static void main(String[] args) {
		Generic1 g = new Generic1 ();
		g.a=30;
		g.b=30;
		System.out.println(g.b);
		g.b = "Testing";
		System.out.println(g.b);
		
		Generic1 y = new Generic1 ();
		y.b=1234;
	}

}
