package Programs;

public class FctorialNo 
{
	public static void main(String[] args) 
	{
		  int i,fact=1;  
		  int number=5;//It is the number to calculate factorial 
		  
		//******By using for loop
		  
		  for(i=1;i<=number;i++)
		  {    
		      fact=fact*i;     
		         
		  }  
		  System.out.println("Factorial of "+number+" is: "+fact); 
		  
		  //******By using while loop
		  
		  int j=1;
		  while(number<=j)
		  {
			  fact=fact*j;
			  j++;
		  }
		  System.out.println("Factorial of "+number+" is: "+fact);
	}
}
