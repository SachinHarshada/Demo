package demo_1;

public class Method2 extends Method1
{
	public static void xyz()
	{
		int z=10;
		System.out.println(z);
		
	}
	public void mno() // for non static declaration
	{
		System.out.println(" Harshada ");
		//System.out.println(e);
		//System.out.println(f);
		//System.out.println(g);
		//System.out.println(h);
		
	}
	
	public static void main(String[] args)
	{
		Method1 E= new Method1();
		E.mno();
		
		Method1.xyz();
				
		/*System.out.println("1. For Static variable calling : ");
		System.out.println(Method1.a); //public static member calling of class method1
		System.out.println(Method1.b); //default static member calling of class method1
		//System.out.println(Method1.c); //private static member calling of class method1
		System.out.println(Method1.d); //protected static member calling of class method1
		
		System.out.println("\n");
		
		System.out.println("2. For Non-Static variable calling : ");
		
		Method2 E= new Method2();
		System.out.println(E.e); //for public non static variable calling of class method1
		
		Method2 F= new Method2();
		System.out.println(F.f);//for default non static variable calling of class method1
		
		//Method1 G= new Method1(); // private
		//System.out.println(G.g); // for private non static variable calling of class method1
		
		Method1 H= new Method1();
		System.out.println(H.h);// for protected non static variable calling of class method1
		
		System.out.println("\n");
		
		System.out.println("3. ******For static method calling : ******");
		
		Method1.xyz();// calling static method of class method1
		
		System.out.println("\n");
		
		System.out.println("4. ****** For Non-Static method calling: ******");
		
		Method1 MNO= new Method1();
		MNO.mno(); // calling non-static method of class method1
		System.out.println("\n calling non static overloading");
		MNO.mno(100);// calling overloading non-static method of class method1
		*/
	}
}
