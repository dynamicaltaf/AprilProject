package Array;

public class FindDublicateNum {

	public static void main(String[] args) {
			
			int a [] ={1,2,3,1,4,5,2,6,4};
		    System.out.println("Duplicate no's from array:");

			for( int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {    //i=0,j=2,i=3
					
					if(a[i]== a[j])
						System.out.println( a[j]);
			}
		}
	} 

}

