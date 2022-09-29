package demo_1;

public class InterfaceClassMain 
{
	public static void main(String[] args) 
	{
		ImplClassB obj =new ImplClassB();
		obj.test();
		//System.out.println(obj.r);
		System.out.println(ImplClassB.r);
		System.out.println(InterfaceClassA.r);
		
		// obj.r=30; not allowed because vale declared in inetrface class is final
		ImplClassB.demo(); //not allowed we cannot call static method due it required more memory
		InterfaceClassA.demo();// before calling it will stored already in memory becoz compilation starts 
		obj.defaultMethod();
	}

}
