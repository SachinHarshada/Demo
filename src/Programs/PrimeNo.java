package Programs;

public class PrimeNo 
{
	public static void main(String[] args)
	{
	
		int num=6,m,count=0;
	
		for(m=2;m<num;m++)//2
		{
			if(num%m==0)//0
			{
				count++; //1
			}
		}
		if(count==0)
		{
			System.out.println("The number is a prime");
		}
		else
		{
			System.out.println("Number is not a prime");
		}
	
	/*System.out.println("*************finding prime no 1 to 10");
		int a=0;
		for(int x=2; x<=30; x++)
		{
			int count1=0;
			for(int y=2; y<x; y++)
			{
				if(x%y==0)
				{
					count1++;
				}
			}
			
			if(count1==0)
			{
				
				a++;
				System.out.println(x+" ");
				
			}
			
		}
		System.out.println("count of prime number :" +a);*/
		
		int a[]= {1,2,3,4,5,6};
		//int b=0;
		
		for(int i=1;i<a.length;i++)//1 2
		{
			int b=0; 
			for(int j=0;j<a[i];j++)//0 1
			{
				if(a[i]%j==0) //1
				{
					b++;//1
				}
			}
			if(b==0)
			{
				System.out.println("Prime number is :"+a[i]);
				//b=0;
			}
		}
	}
	
}
