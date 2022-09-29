package Array;

public class DuplicateStringFromArray 
{
	public static void main(String[] Harsh)
	{
	String A[]= {"Harsh","Neha","Rupesh","Rushi","Ak","Harsh","Neha"};
	
	for(int i=0;i<A.length;i++)
	{
		for(int j=i+1;j<A.length;j++)
		{
			if (A[i]==A[j])
			{
				System.out.println("Duplicate String From Array is : "+A[i]);
			}
		}
	}
	}
	
}
