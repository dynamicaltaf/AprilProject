package Assignment;

public class assignment42 implements assignment40,assignment41 {
    public void demo() {
    	System.out.println("interface 40");		
	}
	public void demo1() {
		System.out.println("interface 41");		
	}
	public static void main(String[] args) {
		assignment42 k = new assignment42();
		k.demo();
		System.out.println(k.m);
		k.demo1();		
		System.out.println(k.n);		
	}
}