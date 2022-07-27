package SeleniumDay6;

public class Execution {

	public static void main(String[] args) {
		
		Gamma a = new Gamma();
		Beta  b = a.memo();
		Alpha c = b.demo();
		c.test();
		a.memo();
		

	}

}
