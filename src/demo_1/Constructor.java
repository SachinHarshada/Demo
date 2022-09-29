package demo_1;

public class Constructor 
{
	static byte a;
	static float b;
	static char c;
	static boolean d;
	static String e;
	
	Constructor() //zero argument constructor
	{
		a=10;
		b=30.50f;
		c='s';
		d=true;
		e="Harshada";
	}
	
	Constructor(int r) //with argument constructor
	{
		a=20;
		b=40.50f;
		c='h';
		d=false;
		e="Sachin";
	}
	public static void main(String[] args) 
	{
		System.out.println(a);// default constructor
		
		new Constructor(); // constructor calling
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		new Constructor(20);//constructor calling
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	}
	
}
