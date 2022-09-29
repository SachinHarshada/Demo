package demo_1;

public class AbstractClassMain 
{
	public static void main(String[] args) 
	{
		AbstractClassB A= new AbstractClassB();
		A.Demo();
		A.test();
		
		AbstractClassC B= new AbstractClassC();
		B.Demo();
		B.test();
		
		AbstractClassA.test(0);
	}
}
