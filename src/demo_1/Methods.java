package demo_1;

public class Methods 
{
	
	public void sub()
	{
		float a1=8;
		float b1=8.9f;
		float p1=a1*b1;
		System.out.println(p1);
	}
	public static void sub(int x)
	{
		float a2=8;
		float b2=8.9f;
		float p2=a2+b2;
		System.out.println(p2);
	}
	public static void add(int x,int y, int z)
	{
		float a3=8;
		float b3=8.9f;
		float p3=a3-b3;
		System.out.println(p3);
	}
	public static void main(String[] args)
	{
		add(100,200,300);
		Methods A= new Methods();
		A.sub();
		//System.out.println(A.p1);
	}
	
}
