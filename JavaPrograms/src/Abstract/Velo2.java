package Abstract;

public class Velo2 implements Velo, Velo1 {

	
	public void mart() {
		System.out.println("Shopping Mart");
	}

	public void Q1() {
		System.out.println("Q1 method running");
	}

	public void Q2() {
		System.out.println("Q2 method running");
	}
	
	public static void main(String[] args) {
		Velo2 v = new Velo2();
		v.mart();
		v.Q1();
		v.Q2();	
	}
	@Override
	public void M() {
		
	}
}
