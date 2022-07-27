package Generalization_2;

public class TestGeneralization {
	
	public static void main(String[] args) {
		
		System.out.println("*******  Discription of SBI CC *******");
		SBI sb = new SBI();
		sb.Limit();
		sb.AnnualCharges();
		sb.IntrestRate();
		sb.NewFeature();
		
		System.out.println("______________________________________");
		
		System.out.println("******** Discription of ICICI CC ******");
		ICICI ic = new ICICI();
		ic.Limit();
		ic.AnnualCharges();
		ic.IntrestRate();
		ic.NewFeature();
		
		System.out.println("______________________________________");
		
		System.out.println("******** Discription of HDFC CC *******");
		HDFC hf = new HDFC();
		hf.Limit();
		hf.AnnualCharges();
		hf.IntrestRate();
		hf.NewFeature();
	}

}
