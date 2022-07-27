package Assignment2;

public class FindDublicateElements { //by brut force method
	public static void main(String[] args) {
		
		String a[] = {"Amazon", "GCP", "Azure", "Amazon", "Ali Baba", "Sauce Lab", "Azure", "GCP"};
		
		System.out.println("Brut force");
		
		for (int i =0; i< a.length; i++) {
			for (int j =i+1; j<a.length; j++) {
				if (a[i].equals(a[j])){
					System.out.println(a[i]);
				}
			}
				
		}	
		
	}

}
