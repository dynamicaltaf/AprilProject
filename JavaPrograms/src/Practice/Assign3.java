package Practice;

public class Assign3 {

	public static void main(String[] args) {  //Assig= Total number of characters in strings
		// TODO Auto-generated method stub
		
		String a = "Honesty is the Best Policy";
		int count =0;
		
		for (int i=0; i<a.length(); i++) {
			if(a.charAt(i) != ' ')         //remove "if statement" to include space count
			count++;
		}
		//to count total number of character
		System.out.println("Total number of Character= " + count);
		

	}

}
