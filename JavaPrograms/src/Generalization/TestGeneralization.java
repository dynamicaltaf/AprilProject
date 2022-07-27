package Generalization;

public class TestGeneralization  {
	public static void main(String[] args) {
		
		System.out.println("====>>> Features of JIO <========");
		Idea I = new Idea();
		I.Audiocalling();
		I.SMS();
		I.Internet();
		I.NewFeatureB();
		
		
		
		System.out.println("====>>> Features of Idea <========");
		JIO J = new JIO();
		J.Audiocalling();
		J.SMS();
		J.Internet();
		J.NewfeatureA();
	}

}
