package Array;

public class ArraySwapping {

	public static void main(String[] args) {
		
		int a [] = {10,15,40,20,80,70};
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]+",");
		}
		for (int i=0; i<(a.length/2); i++) {
			int z;
			z = a[i];
			a[i] = a[(a.length-1)-i];
			a[(a.length-1)-i] = z;
		}
		System.out.println();
		System.out.println(a[1]);
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]+",");
		}
		

	}

}
