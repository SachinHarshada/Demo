package demo_1;

public class ImplClassB implements InterfaceClassA, InterfaceClassA1 
{
	public void test() 
	{
		System.out.println("Test Method");
	}

	public static void demo() 
	{
		System.out.println("Static method interface in implement class");
	}

	public void defaultMethod() 
	{
		System.out.println("Default Method of interface in implemenation class");
	}

	public void Axis() 
	{
		System.out.println("My bank is Axis bank");
	}

	public void Hdfc() 
	{
		System.out.println("My bank is Hdfc bank");

	}

	public static void main(String[] args) 
	{
		ImplClassB.demo();
		InterfaceClassA.demo();
		
		ImplClassB OBJ= new ImplClassB();
		OBJ.Axis();
		OBJ.Hdfc();
		

		// If suppos we can not overhide the static meathod we can not call
		// static method from implementaion class and by using ImplClassB from main
		// method also
	}

}
