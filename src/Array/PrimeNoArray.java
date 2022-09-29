package Array;

public class PrimeNoArray 
{
	public static void main(String[] args) 
	{
		int a[]= {2,3,4};
		//int d =0;
		
		int size=a.length;
		System.out.println("The size of array : "+size);
		
		for(int b=0;b<size;b++) 
		{
			 
			int count=0;
			for(int c=1;c<=a[b];c++)
			{
				if(a[b]%c==0) 
				{
					count++; 
				}
			}
			if(count==2)
			{
				System.out.println("Number is prime : "+a[b]);
			}
		}
		
		
	}
}