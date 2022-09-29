package Programs;

public class ArmstrongNoWhile 
{
	public static void main(String[] args) 
	{
		/* int no=153;
		int a=no;
		 int leng=0;
		 while(a!=0)
		 {
		 a=a/10;
		 leng=leng+1;
		// }

		
		 int number = 371, originalNumber, remainder, result = 0;
		 
		 originalNumber = number;
		 
		  while (originalNumber != 0) 
		  { 
		  	remainder = originalNumber % 10; 
		 	result +=Math.pow(remainder, 3); 
		  	originalNumber /= 10; 
		  }
		  
		 if(result == number) 
		  { 
		  		System.out.println(number +
		  " is an Armstrong number."); 
		  
		  } else 
		  { System.out.println(number +
		  " is not an Armstrong number."); 
		  }*/
		 

		int n1 = 153, n, rem, addResult = 0;
		n = n1;

		while (n1 != 0) 
		{
			rem = n % 10;
			n = n / 10;
			addResult = addResult + (rem * rem * rem);
		}
		if (n1 == addResult) 
		{
			System.out.println("The number is amstrong no : " + n1);
		} 
		else 
		{
			System.out.println("The number is not an amstrong no : " + n1);
		}
	}

}
