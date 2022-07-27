package Practice;

public class StarPattern_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int space=0;
		  int star=7;
		  for (int i=1; i<=6; i++) {
			  for (int j=1; j<=space; j++) {
				  System.out.print(" ");
			  }
			  for (int j=1; j<=star; j++) {
				  System.out.print(i);
			  }
			  System.out.println();
			  space++;
			  star-=2;
		  }
	}
	
}


