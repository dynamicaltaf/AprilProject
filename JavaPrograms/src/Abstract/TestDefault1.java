package Abstract;

public class TestDefault1 implements Velo1 {
	
	public void mart() {
		System.out.println("All shops open");
	}
	public static void main(String[] args) {
		TestDefault1 x = new TestDefault1();
		TestDefault y = new TestDefault();
		
		x.Dmart();
		x.mart();
		
		y.Dmart();
		y.mart();
	}
}
