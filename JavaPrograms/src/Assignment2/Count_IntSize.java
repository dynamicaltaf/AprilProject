package Assignment2;

public class Count_IntSize {

	public static void main(String[] args) {
		
		int a = 702512;   //count number of figures 
		int count = 0;
		while (a!=0) {
			a=a/10;
			count++;
		}
		System.out.println(count);

	}

}
