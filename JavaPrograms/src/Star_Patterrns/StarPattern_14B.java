package Star_Patterrns;

public class StarPattern_14B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int space=0;
		int star=5;
		for (int i=1; i<=9; i++) {
			for (int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			for (int j=1; j<=star; j++) {
				System.out.print(" *"); //Space
			}
			System.out.println();
			
			if (i<=4){
				space++;
				star--;		
			}
			else {
				space--;
				star++;
			}
			
			}
			
		}
		

	}