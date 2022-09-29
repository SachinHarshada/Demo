package Array;

public class LargestNoArray2nos 
{
	public static void main(String[] args)
	{
		int B[]= new int[2];
		B[0]=100;
		B[1]=20;
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
		int A[]= new int[2];
		A[0]=100;
		A[1]=20;
		if (A[0]>A[1])
		{
			System.out.println("The Largest No from Array : "+A[0]);
		}
		else 
		{
			System.out.println("The Largest No from Array : "+A[1]);
		}
			
	}
}
