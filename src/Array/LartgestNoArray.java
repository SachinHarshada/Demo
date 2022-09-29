package Array;


import java.util.Arrays;

public class LartgestNoArray 
{
	public static void main(String[] args)
	{		
			System.out.println("By Using Sorting");
		
			int A[]= {400,20,30,40};
			int size=A.length;
			Arrays.sort(A);
			System.out.println("sorting element : "+Arrays.toString(A));
			int ans=A[size-1];
			System.out.println("Largest No is : " + ans);
			
			System.out.println("\n");
			System.out.println("By Using without Sorting");
			
			int B[]= {10,25,163,43,66};
			int largest=A[0];
			for(int j=0;j<B.length;j++)
			{
				if(B[j]>largest)
				{
					largest=B[j];
				}
			}
			System.out.println("The Largest No from Array : "+largest);
	}

}
