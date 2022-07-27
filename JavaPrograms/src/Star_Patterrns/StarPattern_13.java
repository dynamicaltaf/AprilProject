package Star_Patterrns;

public class StarPattern_13 {

	public static void main(String[] args) {
		
		int space=0;
		int star=5;
		for (int i=1; i<=9; i++) {
			for (int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			for (int j=1; j<=star; j++) {
				System.out.print("*"); //if we add one space after * so we will get patter-14
			}
			System.out.println();
		if (i>=5) {
			space--;
			star++;
		}
		else {
			space++; //if we remove space++ so we can invert this pattern (Pattern-12)
			star--;
		}
	}
  }
}
