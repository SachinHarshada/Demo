package Programs;

public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		int a=1;
		int b=2;
		int c;
		for(int x=1;x<=10;x++)
		{
			System.out.print(a+",");
			c=a+b;
			a=b;
			b=c;	
		}
	}

}
