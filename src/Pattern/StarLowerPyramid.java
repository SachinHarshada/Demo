package Pattern;

public class StarLowerPyramid 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=10;k>=i;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=15;k>=2*i-1;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
