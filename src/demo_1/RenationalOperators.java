package demo_1;

public class RenationalOperators 
{
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		int c=5;
		int d =5;
		
		// GREATER THAN (>)//
		
		boolean result = a>b;
		System.out.println("Result of greater than : " +result);
		
		boolean result1 = b>c;
		System.out.println("Result1 of greater than : " +result1);
		
		System.out.println("\n");
		
	    // LESS THAN (<)//
		
		result = a<b;
		System.out.println("Result of less than : " +result);
		
		result1 = b<c;
		System.out.println("Result1 of less than : " +result1);
		System.out.println("\n");
		
		// GREATER THAN EQUAL TO (>=)//
		
		result = a>=b;
		System.out.println("Result of greater than equal to : " +result);
				
		result1 = b>=c;
		System.out.println("Result1 of greater than equal to : " +result1);
		System.out.println("\n");
		
        // LESS THAN EQUAL TO (<=)//
		
		result = a<=b;
		System.out.println("Result of less than equal to : " +result);
		
		result1 = b<=c;
		System.out.println("Result1 of less than equal to: " +result1);
		System.out.println("\n");
		
		// EQUAL EQUAL (==)//
		
		result = a==b;
		System.out.println("Result of equal equal is : " +result);
				
		result1 = b==c;
		System.out.println("Result1 of equal equal is : " +result1);
		
		boolean result2 = c==d;
		System.out.println("Result2 of equal equal is : " +result2);
		
		System.out.println("\n");
		
		// NOT EQUAL (!=)//
		
		result = a!=b;
		System.out.println("Result of not equal to is : " +result);
				
		result1 = b!=c;
		System.out.println("Result1 of not equal to is : " +result1);
		
		result2 = c!=d;
		System.out.println("Result2 of not equal is : " +result2);
		
		
		System.out.println("\n");
	}
}
