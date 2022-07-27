package Star_Patterrns;

public class StarPattern_16 {

	public static void main(String[] args) {

	//	int space=1;   //if we keep or remove both lines doesn't affect
	//	int star=1;
		for (int i=5; i>=1; i--) {
			for (int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for (int j=i; j<=5; j++) {
				if (j==5 || j==i || i==1) {
					System.out.print("*");
				}
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
