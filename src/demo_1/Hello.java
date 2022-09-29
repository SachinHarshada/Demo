package demo_1;

public class Hello 

{
 public static void main(String[] args) 
 {
	 double a=10, b=10, c=30,ans;
	 if ((ans=a+b+c)>=100)
	 {
		 if(ans%2==0)
		 {
			 System.out.println(ans+"\n"+"Answer is greater than 100 and it is even no");
		 }
		 else
		 {
			 System.out.println(ans+"\n"+"Answer is greater than 100 and it is odd no");
		 }
	 }
	 else if((ans=a+b+c)<=100&&ans>=0)
	 {
		 if(ans%2==0)
		 {
			 System.out.println(ans+"\n"+"Answer is smaller than 100 and it is even no");
		 }
		 else
		 {
			 System.out.println(ans+"\n"+"Answer is smaller than 100 and it is odd no");
		 }
	 }
	 else if ((ans=a+b+c)<0)
	 {
		 if(ans%2==0)
		 {
			 System.out.println(ans+"\n"+"Answer is smaller but negative and it is even no");
		 }
		 else
		 {
			 System.out.println(ans+"\n"+"Answer is smaller but negative and it is odd no");
		 }
	 }
	 /////********program for even and odd*******\\\\\\\
	 int no=7;
		//int b=20;
		if(no%2==0)
		{
			System.out.println("The given no is even");
		}
		else if(no%2!=0)
		{
			System.out.println("The given no is odd");
		}
		int d=10;
		int e=20;
		int f=30;
		int z=d+e+f;
		if(z>=100)
		{
			System.out.println("No is greater");
		}
		else if(z<=100)
		{
			System.out.println("No is Smaller");
		}
		else if(z<0)
		{
			System.out.println("No is less than zero");
		}
		 
 }
}
