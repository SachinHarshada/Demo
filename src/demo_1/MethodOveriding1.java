package demo_1;

public class MethodOveriding1 
{
	public void arithmeticoperation()
	{
		System.out.println("Addition");
	}
	public static void arithmeticoperation1()
	{
		System.out.println("Addition1");
	}
	
	public static void main(String[] args) 
	{
		MethodOveriding1 a=new MethodOveriding1();
		a.arithmeticoperation();
		
		MethodOveriding1.arithmeticoperation1();
		
		
	}
}
