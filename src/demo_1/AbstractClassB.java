package demo_1;

public class AbstractClassB extends AbstractClassA  
{
	public void Demo()
	{
		System.out.println("Harshada");
	}
	public static void main(String[] args) 
	{
		AbstractClassB A=new AbstractClassB();
		A.Demo();
		A.test();
		
		AbstractClassB.test(0);
	}
	
}
