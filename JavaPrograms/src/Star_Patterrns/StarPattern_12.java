package Star_Patterrns;

public class StarPattern_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int star=5;
		for (int i=1; i<=9; i++) {
			for (int j=1; j<=star; j++) {
				System.out.print("*");
			}
			System.out.println();
			if (i<=4) {
				star--;
			}else {
				star++;
			}
		}
	}

}
