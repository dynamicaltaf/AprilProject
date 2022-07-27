package Star_Patterrns;

public class StarPattern_9 {

	public static void main(String[] args) {

		int space=5;
		int star=1;
		for (int i=1; i<=9; i++) {
			for (int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			for (int j=1; j<=star; j++) {
					System.out.print("*");
				}
			System.out.println();
				if (i<=4) {
				space--;
				star++;
			}
			else {
				space++;
				star--;
			}
		}
	}

}
