package Pattern;

public class Star3rdQuadrant 
{
	public static void main(String[] args) 
	{
		for(int x=1;x<=10;x++)
		{
			for(int y=1;y<x;y++)
			{
				System.out.print(" ");
			}
			for(int z=10;z>=x;z--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
			