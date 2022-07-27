package String;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "velocity";       //string declaration
		String s2 = "VELOCITY";
		String s3 = "CITY";
		 
		System.out.println(s1.charAt(4));            //To print char at any index
		System.out.println(s2.replace("V", "J"));    //To replace particular char
		System.out.println(s2.isEmpty());            //To check whether parenthesis empty or filled (True/false)
		System.out.println(s1.isBlank());            // to check it is blank or not (true or false)
		System.out.println(s2.concat(s3 ));           //To join/combine two parenthesis data
		System.out.println(s2.substring(5));         //To remove initial char
		System.out.println(s2.substring(2, 4));      //To remove initial and last char
		System.out.println(s2.endsWith("ajd"));      //To check similarity between two data
        System.out.println(s2.startsWith("VE"));     //To check whether the data is starting with particular char
        System.out.println(s2.lastIndexOf("T"));     //To check index no. of particular char
        System.out.println(s2.contains(s3));         //To compare similar data between two parenthesis &is not case sensitive
        System.out.println(s1.equals(s2));           //To check whether data is similar or not
        System.out.println(s2.length());             //to count no. of character
        System.out.println(s1.toUpperCase());        //to convert into upper case
        System.out.println(s2.toLowerCase());        //To convert into lower case 
        System.out.println(s3.compareToIgnoreCase(s2));
	}

}
