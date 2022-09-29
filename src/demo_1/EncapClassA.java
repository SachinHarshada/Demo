package demo_1;

public class EncapClassA 
{
	private int a1=100;
	private int b1=200;
	
	private String username1="Harshada";
	private String password1="Harsh@123";
	
	private static int a=10;
	private static int b=20;
	
	private static String username="Velocity";
	private static String password="Velo@123";
	
	
	public static void addition()
	{
		System.out.println(a);
		System.out.println(b);
		
		int c=a+b;
		System.out.println(c);
	}
	public void addition(int m)
	{
		System.out.println(a1);
		System.out.println(b1);
		
		int c1=a1+b1;
		System.out.println(c1);
	}
	
	public static String returnUserName()
	{
		return username;
	}
	
	public static String returnPassword()
	{
		return password;
	}
	
	public String returnUserName1()
	{
		return username1;
	}
	
	public String returnPassword1()
	{
		return password1;
	}
	
	
}
