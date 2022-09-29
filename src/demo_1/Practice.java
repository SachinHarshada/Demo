package demo_1;

public class Practice 
{
		public static void main(String[] args) 
		{
			//int a=10, b=22, c=3;
			
			/*for (a=1;a<=10;a++)
			{
				for (b=10;b>=a;b--)
				{
					System.out.print(" ");
				}
				for (c=1;c<=2*a-1;c++)
				{
					System.out.print("*");
				}
				System.out.println();
			}*/
			
			/*if (a<b)
			{
				if (a<c)
				{
					System.out.println("a is less : " + a);
				}
				else
				{
					System.out.println("c is less : " +c);
				}
			}
			else
			{
				if (b<c)
				{
					System.out.println("b is less : " + b);
				}
				else
				{
					System.out.println("c is less : " +c);
				}
			}
			
			int n=10,i;
			if (n==1||n==0)
			{
				for (i=2;i<n;i++)
				{
					if(n%i==0)
					{
						System.out.println("Number is not aprime number");
					}
					else
					{
						System.out.println("Number is prime number");
					}
						
				}
				
			}*/
			Methods A= new Methods();
			A.sub();
			//Methods B= new Methods();
			//B.add(10,20,30);
			Methods.add(10,20,30);
			Methods.sub(10);
		}
		
		
}
