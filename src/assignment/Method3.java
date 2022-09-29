package assignment;

import demo_1.Method1;

public class Method3 extends Method1
{
	protected int j=10;
	
	public static void main(String[] args)
	{

		System.out.println("1. For Static variable calling : ");
		
		System.out.println(Method1.a); //public static member calling of class method1
		//System.out.println(Method1.b); //default static member calling of class method1
		//System.out.println(Method1.c); //private static member calling of class method1
		System.out.println(Method1.d); //protected static member calling of class method1
		System.out.println("\n");
		
		System.out.println("2. For Non-Static variable calling : ");
		
		Method1 E= new Method1();
		System.out.println(E.e);//public non static member calling of class method1
		
		//Method1 F= new Method1();
		//System.out.println(F.f);//default non-static member calling of class method1
		
		//Method1 G= new Method1();
		//System.out.println(G.g);//private non-static member calling of class method1
		
		Method3 H= new Method3();
		System.out.println(H.h);//protected non-static member calling of class method1
		System.out.println("\n");
		
		System.out.println("3.******For static method calling : ****");
		Method1.xyz();// calling static method of class method1
		System.out.println("\n");
		
		System.out.println("4. ****** For Non-Static method calling: *******");
		
		Method1 MNO= new Method1();
		MNO.mno();// calling non-static method of class method1
		System.out.println("\n calling non static overloading");
		MNO.mno(100);// calling overloading non-static method of class method1
	}
}
