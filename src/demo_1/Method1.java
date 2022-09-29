package demo_1;
//import assignment.Method3;

public class Method1
{	
	//***static declaration
	public static int a=10; //public
	       static int b=20; // default
	private static int c=30; //private
	protected static int d=40; //protected
	
	//***non-static declaration
	public int e=100; //public
		   int f=200; // default
	private int g=300;//private
	protected int h=400;//protected

	public static void xyz()// static method declaration
	{
		//int z=10;
		//System.out.println(z);
		System.out.println(" for  static method calling from method1 class");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
	
	public void mno() // for non static declaration
	{
		System.out.println(" for  non static method calling from method1 class");
		//System.out.println(e);
		//System.out.println(f);
		//System.out.println(g);
		//System.out.println(h);
		
	}
	public void mno(int x) // for method overloading calling
	{
		System.out.println(e);
		System.out.println(f);
	}
	
	public static void main(String[] args)
	{
		System.out.println("1. For Static variable calling: ");
		System.out.println(a); //public static member calling of class method1
		System.out.println(b);//default static member calling of class method1
		System.out.println(c);//private static member calling of class method1
		System.out.println(d);//protected static member calling of class method1
		
		System.out.println("\n");
		
		System.out.println("2. For Non-Static variable calling : ");
		
		Method1 E= new Method1();
		System.out.println(E.e);//public non-static member calling of class method1
		
		Method1 F= new Method1();
		System.out.println(F.f);//default non-static member calling of class method1
		
		Method1 G= new Method1();
		System.out.println(G.g);//private non-static member calling of class method1
		
		Method1 H= new Method1();
		System.out.println(H.h);//protected non-static member calling of class method1
		
		System.out.println("\n");
		
		System.out.println(" 3. For Static method calling: ");
		
		//Method1.xyz();// for static method calling of class method1
		
		System.out.println("\n");
		
		System.out.println(" 4. For Non-Static method calling: ");
		
		// Method1 MNO= new Method1();
		E.mno(); // for non-static method calling of class method1
		System.out.println("\n calling non static overloading");
		//MNO.mno(100);// for non-static method calling for overloading of class method1
		
		//Method1 J= new Method1();
		//System.out.println(J.j);
		
	}
	
}
