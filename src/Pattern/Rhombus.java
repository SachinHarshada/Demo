package Pattern;

public class Rhombus 
{
	 //	  ****
	 //  ****
	 // ****
	// **** 
	public static void main(String[] args)
	{
		int i,j,k;
		
		for(i=1;i<=4;i++) 
		{
			for(j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=4;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	/* 	****
	   *  *
	  *  *
	 **** Hollow rhombus*/
	
	
	//System.out.println();
	
	System.out.println("\n");
	
	
	/* 	****
	   *  *
	  *  *
	 **** Hollow rhombus*/
	
	for(i=1;i<=5;i++) 
	{
		for(j=4;j>=i-1;j--)  
		{
			System.out.print(" ");
		}
		
		for(k=1;k<=5;k++) 
		{
			if(i==1||i==5||k==1||k==5)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" "); 
			}
			
		}
		System.out.println();
	}
	
	System.out.println(" mirror image of rhombus \n");
	
	 //	  ****
	 //    ****
	 //     ****
	//       **** 
	
	for(i=1;i<=4;i++) 
	{
		for(j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(k=1;k<=4;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
}

}

