package Loops;

public class hollowrectangle {

	public static void main(String[] args) {
		
		int n=7;
		int m=8;
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				
				if ( j==1 || j==i || i==n ) {
					System.out.print("*");	
					}
					else {
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	}
}

