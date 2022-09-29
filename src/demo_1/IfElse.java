package demo_1;

public class IfElse 
{
	public static void main(String[] args) 
	{
	  String s="Harshada";
	  if(s == "Harsha")
	  {
	  System.out.println("1.condition is true");
	  }
	  else
	  {
		  System.out.println("1.condition is not true");
	  }
	  System.out.println("********************************");
	  //*****///
	  int a=2;
	  float b=3;
	  if((a+b)>=(a-b))
	  {
		  System.out.println("2.Given solution is correct");
	  }
	  else 
	  {
		  System.out.println("2.Given solution is not correct");
	  }
	  System.out.println("********************************");
	  
	  int A=20;
	  float B=30.30f;
	  if(A>=B)
	  {
		  System.out.println("3.Given solution is correct");
	  }
	  else 
	  {
		  System.out.println("3.Given solution is not correct");
	  }	  
	  System.out.println("\n");
	  System.out.println("********************************");
	  System.out.println("\n");
	  
	  
	  int number=1;
	  if(number>0)
	  {
		  System.out.println("The number is positive");
		  
	  }
	  else if(number<0)
	  {
		  System.out.println("The number is negative");
		  
	  }
	  else 
	  {
		  System.out.println("The number is 0");
		  
	  }
	  int y=100;
	  if((y>=110)||(y>120)) 
	   	{
		  System.out.println("will get condition1");
		}
	  else if((y<10) && (y<50)) 
	  {
		  System.out.println("will get else if 1st condition");
	  }
	  else if ((y==50)||(y!=100)) 
	  {
		  System.out.println("will get else if 2nd condition");
	  }
	  else 
	  {
		  System.out.println("will getting false output");
	  }
	  System.out.println("\n");
	  System.out.println("********************************");
	  System.out.println("\n");
	  
	  int num=97;
	  if(num%2<=0&&num%2>=0)
	  {
		  System.out.println("The number is even");
		  
	  }
	  else if(num%2!=0)
	  {
		  System.out.println("The number is odd");
		  
	  }
	  //else
	  //{
		//  System.out.println("The number is 0");
		  
//	  } 
	  //*********Nested if else***********//
		 // declaring double type variables
		 double n1 = 2222, n2 = 42, n3 = -5.3, largest;

		 // checks if n1 is greater than or equal to n2
		 if (n1 >= n2) 
		 	{

		  // if...else statement inside the if block
		 // checks if n1 is greater than or equal to n3
			 	if (n1 >= n3) 
			 	{
			 			largest = n1;
		        }

		        else 
		        {
		        largest = n3;
		        }
		    } 
		 else 
		 {

		      // if..else statement inside else block
		      // checks if n2 is greater than or equal to n3
		      if (n2 >= n3) 
		      {
		        largest = n2;
		      }

		      else 
		      {
		        largest = n3;
		      }
		  }

		 System.out.println("Largest Number: " + largest);
		
     }

}
