package demo_1;

public class Mock 
{
	static int a=10,b=20,c;
	int m=10,n=20,o;
	
	public static void add()
	{
		c=a+b;
		System.out.println("1.Additon is : " +c);
	}
	public static void add(int x)
	{
		c=a+b;
		System.out.println("2.Additon is : " +c);
	}
	public void add(int x, int y)
	{
		o=m+n;
		System.out.println("3.Additon is : " +o);
	}
	public void add(int x, int y,int z)
	{
		o=m+n;
		System.out.println("4.Additon is : " +o);
	}
	
	
	public static void main(String[] args) 
	{
		Mock.add();
		Mock.add(10);
		
		Mock O1=new Mock();
				
		O1.add(10,20);
		O1.add(10,20,30);
	}
}
