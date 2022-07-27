package Casting;

public class TestCasting { 
	public static void main(String[] args) {
		
		Father f = new Son();      //upcasting syntax
		f.money();
		f.car();
		
		
		Father d = new Father();
		d.car();
		d.money();
		
	}

}
