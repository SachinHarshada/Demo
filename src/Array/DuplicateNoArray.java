package Array;

public class DuplicateNoArray 
{
	public static void main(String[] args)
	{
		int A[]= {1,2,1,4,5,6,2,5};
		int size=A.length;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(A[i]==A[j])
				{
					System.out.println("Duplicate No are : "  +A[i]);
				}
			}
		}
				
	}
}
