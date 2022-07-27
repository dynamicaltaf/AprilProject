package Practice;

public class p9 {

	public static void main(String[] args) {
		String a= "a b c d f e g h";
		int count=0;
		for(int i=0;i<=a.length()-1;i++) {
			char b=a.charAt(i);
			if(b==' ') {
				count++;}
			}
			System.out.println(count);
	}

}
