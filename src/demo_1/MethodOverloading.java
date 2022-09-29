package demo_1;

public class MethodOverloading 
{
  //// Method overloading////
	
	public static void addition(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public static void addition(int a, int b, int c)
	{
		int d=a+b+c;
		System.out.println(d);
	}
	public static void addition(int a, char c)
	{
		
		System.out.println(c);
	}
	
	public static void main(String[] args)
	{
		MethodOverloading.addition(10,20);
		MethodOverloading.addition(10,20,30);
		MethodOverloading.addition(10,'c');
	}
}
