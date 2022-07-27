package Array;

public class Array5 {

	public static void main(String[] args) {

		int ar []= {1,2,3,4,1,4,5,6,4,2};
		int fr []= new int [ar.length];
		int t = -1;
		
		
		for (int i=0; i<ar.length; i++) {
			int count = 1;
			for (int j=i+1; j<ar.length; j++) {
			
		if (ar[i]==ar[j]) {
			count++;
			fr [j]=t;
		}
			}
			if (fr[i]!=t)
				fr[i]= count;}
			System.out.println();
			
		for (int i=0; i<fr.length; i++) {
		if (fr[i]!=t)
		System.out.println(ar[i]+"="+fr[i]);
		}
	}
}

