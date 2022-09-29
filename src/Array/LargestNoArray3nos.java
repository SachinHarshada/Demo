package Array;

public class LargestNoArray3nos 
{
	public static void main(String[] args)
	{
		int B[]= new int[3];
		B[0]=100;
		B[1]=20;
		B[2]=300;
		int largest=B[0];
		for(int j=0;j<B.length;j++)
		{
			if(B[j]>largest)
			{
				largest=B[j];
			}
		}
		System.out.println("The Largest No from Array : "+largest);
		
		
		System.out.println("\n");
		
		System.out.println("By using if else");
		
		int A[]= new int[3];
		A[0]=100;
		A[1]=2000;
		A[2]=300;
		
		if (A[0]>A[1])
		{
			if (A[0]>A[2])
			{
				System.out.println("The Largest No from Array : "+A[0]);
			}
			else
			{
				System.out.println("The Largest No from Array : "+A[2]);
			}
		}
		else 
		{
			if (A[1]>A[2])
			{
				System.out.println("The Largest No from Array : "+A[1]);
			}
			else
			{
				System.out.println("The Largest No from Array : "+A[2]);
			}
		}
			
	}
}
