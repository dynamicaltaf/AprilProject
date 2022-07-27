package Abstract;

public class Abhi1 extends Abhi {      //concrete class
	
	public void show () {
		System.out.println("running show method");   //complete method declare body	
	}
	public void blank() {
		System.out.println("running blank method");   //complete method declare body
	}
	public static void main(String[] args) {
		
		Abhi1 a = new Abhi1();
		a.blank();
		a.display();
		a.show();
		a.display();
	}

}
