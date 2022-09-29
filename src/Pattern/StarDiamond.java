package Pattern;

public class StarDiamond 
{
	public static void main(String[] args) 
	{
		int x,y,z;
		for(x=1;x<10;x++)
		{
			for(y=10;y>x;y--)
			{
				System.out.print(" ");
			}
			for(z=1;z<=(2*x-1);z++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(x=1;x<=10;x++)
		{
			for(y=1;y<x;y++)
			{	
				System.out.print(" ");
			}
			for(z=19;z>=(2*x-1);z--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n");
		for(x=1;x<10;x++)
		{
			for(y=10;y>x;y--)
			{
				System.out.print(" ");
			}
			for(z=1;z<=x;z++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(x=1;x<=10;x++)
		{
			for(y=1;y<x;y++)
			{	
				System.out.print(" ");
			}
			for(z=10;z>=x;z--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
