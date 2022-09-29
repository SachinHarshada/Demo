package Pattern;

public class StarPyramid 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=10;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		for(int i=1;i<=10;i++)
		{
			for(int j=10;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
