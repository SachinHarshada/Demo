package demo_1;

public class MethodOveriding2 
{
	public void arithmeticoperation()
	{
		System.out.println("Substraction");
	}
	public static void arithmeticoperation1()
	{
		System.out.println("Substraction1 "); ///this concept is called as the method hiding 
												//bcoz for static method memory stored at the time
												//of compilation
	}
	public static void main(String[] args) 
	{
		MethodOveriding1 a=new MethodOveriding1();
		a.arithmeticoperation();
		
		MethodOveriding2 b=new MethodOveriding2();
		b.arithmeticoperation();
		
		MethodOveriding1.arithmeticoperation1();
		MethodOveriding2.arithmeticoperation1();
		
	}
}
