package Abstract;

public class Sample1 extends Sample {
	
	public void multi() {
		System.out.println("Complete Method");
	}
	
	public static void main(String[] args) {
		
		Sample1 s = new Sample1();
		s.add();
		s.multi();
	}
}
