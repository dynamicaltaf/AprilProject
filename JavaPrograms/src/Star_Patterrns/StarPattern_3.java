package Star_Patterrns;

public class StarPattern_3 {

	public static void main(String[] args) {

		int star =5;   // 5 ==> for number of * in first row
		for (int i=1; i<=5; i++) {   // 5==> total no. of number of rows
			for (int j=1; j<=star; j++) {
				System.out.print("*");
			}
			System.out.println();
			star--;
		}
	}

}
