
package assignment;

public class Assmnt1 
{
public static void main(String[] args) 
{
	int a=10;
	int b=9;
	int c=120;
	int d=4;
	
	if(a>b)
	{
		if (a>c)
		{
			if (a>d)
			{
				System.out.println("a is greater = " +a);
			}
			else
			{
				System.out.println("d is greater ="+d);
			}
		}
		else
		{
			if(c>d)
			{
				System.out.println("c is greater = "+c);
			}
		}
	}
	else
	{
		if(b>c)
		{
			if(b>d)
			{
				System.out.println("b is greater = "+b);
			}
			else
			{
				System.out.println("d is greater = "+d);
			}
		}
		else
		{ 
			if(c>d)
			{
				System.out.println("c is greater = "+c);
			}
			else
			{
				System.out.println("d is greater = "+d);
			}
		}
	}
			
}
}

