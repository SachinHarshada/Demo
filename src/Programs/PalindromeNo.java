package Programs;

public class PalindromeNo 
{
	public static void main(String[] args)
	{
		int num=1235397831;
		int originalno=num;
		int rev=0;
		int rem;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		System.out.println("Reverse No is : "+rev);
		if (originalno==rev)
		{
			System.out.println("The given no is palindrome no");
		}
		else 
		{
			System.out.println("The given no is not a palindrome no");
		}
	}
}
