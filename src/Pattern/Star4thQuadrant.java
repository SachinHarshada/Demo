package Pattern;

public class Star4thQuadrant 
{
	public static void main(String[] args) 
	{
		for(int x=1;x<=10;x++)
		{
			for(int y=10;y>=x;y--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
