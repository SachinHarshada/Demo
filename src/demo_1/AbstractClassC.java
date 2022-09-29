package demo_1;

public class AbstractClassC extends AbstractClassA
{
	public void Demo()
	{
		System.out.println("Sachin");
	}
	public static void main(String[] args) 
	{
		AbstractClassC A=new AbstractClassC();
		A.Demo();
		A.test();
		
		AbstractClassC.test(0);
	}

}
