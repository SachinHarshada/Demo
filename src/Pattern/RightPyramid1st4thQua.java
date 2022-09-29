package Pattern;

public class RightPyramid1st4thQua 
{
	public static void main(String[] args) 
	{
		int x,y,z;
		for(x=1;x<=10;x++)
		{
			for(z=1;z<=x;z++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//System.out.println("\n");
		
		for(x=1;x<=10;x++)
		{
			for(y=10;y>=x;y--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
