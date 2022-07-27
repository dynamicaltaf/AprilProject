package Assignment2;
import java.util.Scanner;
public class GCD_LCM {

	public static void main(String[] args) {
		int a, b, x, y, t, gcd, lcm;
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter two integers\n");
		x = sc.nextInt();
		y = sc.nextInt();
		
		a = x;
		b = y;
		
		while (b !=0) {
		t = b;
		b = a % b;
		a = t;
		}
		gcd = a;
		lcm = (x*y)/gcd;
		System.out.println("Greatest common divisor of " +x+" and "+y+"= "+gcd);
	    System.out.println("Least common multiple of " +x+ " and "+y+"="+lcm);
	}

}
