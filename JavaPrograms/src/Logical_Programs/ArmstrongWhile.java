package Logical_Programs;

public class ArmstrongWhile {
	
		public static void main(String[] arg){
			
		int i=100,arm;
		System.out.println("Armstrong numbers between 100 to 999");
		while(i<1000)
		{
		arm=abc(i);
		if(arm==i)
		System.out.println(i);
		i++;
		}
		}
	static int abc(int z)
	{
		int x,a=0;
		while(z>0)
		{
			x=z%10;
			a=a+(x*x*x);
			z/=10 ;
		}
		return a;
	}
	
}


