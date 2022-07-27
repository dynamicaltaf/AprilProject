package Assignment2;

public class DescendingArray { //To arrange in Desc order
	
	public static void main(String[] args) {
		int [] a = new int [] {44,88,22,77,99};
		int temp;
		for (int i=0; i<a.length; i++) {
			for (int j=i; j<a.length; j++) {
				if (a[i]< a[j]) {
					temp = a[i];
					a[i]= a[j];
					a [j]= temp;
				}
			}
		}
		for (int b : a) {
			System.out.print(b +" ");
		}
	}
}
