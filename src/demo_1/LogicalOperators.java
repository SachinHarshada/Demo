package demo_1;

public class LogicalOperators 
{
	public static void main(String[] args) 
	{
		boolean a=true;
		boolean b= false;
		
		//*****AND(&&)*****///
		
		boolean c= a&&b;
		System.out.println("1. Ans of AND is: " +c);
		System.out.println("\n");
		boolean r=(5>3)&&(5>6);
		System.out.println("2. Ans of AND is: " +r);
		System.out.println("\n");
		r=(5>3)&&(6>5);
		System.out.println("3. Ans of AND is: " +r);
		System.out.println("\n");
		
		//*****OR(||)*****///
		
		c= a||b;
		System.out.println("1. Ans of OR is: " +c);
		System.out.println("\n");
		//r=(4>3)||(4<6);
		System.out.println("2. Ans of OR is: " +r);
		System.out.println("\n");
		r=(3>5)||(5>6);
		System.out.println("3. Ans of OR is: " +r);
		System.out.println("\n");		
		
		//*****NOT(!)*****///
		
		boolean t=!(true);
		System.out.println("1. Ans of NOT is: " +t);
		System.out.println("\n");
		
		///***PRACTICE***////
		System.out.println("///***PRACTICE***////");
		
		int k1=80;
		int k2=90;
		boolean k=!(k1>k2) || !(k1<=k2);
		System.out.println("Output of k is :" +k);
		System.out.println("\n");
		
		char a1='a';
		char a2='b';
		char a3='b';
		boolean A= a1==a2;
		System.out.println("1. Output of Char is : " +A);
		System.out.println("\n");
		A=(a1!=a2)&&(a2==a3);
		System.out.println("2. Output of Char is : " +A);
		
	}
}
