package demo_1;

public class ArithmaticOperators 

{
	public static void main(String[] args) 
	{
		//*****ADDITION(+)****//
		
		int a=20;  
		int b=10;
		System.out.println("Addition is : " +(a+b)); // add of two integer datatype
		float f1=21.10f;
		float f2=30;  //noneed to write f bcoz value is not in fraction
		System.out.println("Addition is : " +(f1+f2));  // add of two float datatype
		System.out.println("\n");
		
		//*****SUBSTRACTION(-)****//
		
		System.out.println("Substraction is : " +(a-b)); // sub of two integer datatype
		System.out.println("Substraction is : " +(f1-f2));  // sub of two float datatype
		System.out.println("\n");
		
		//*****MULTIPLICATION(*)****//
		
		System.out.println("Multiplication is : " +(a*b)); // Mult of two integer datatype
		System.out.println("Multiplication is : " +(f1*f2));  // Mult of two float datatype
		System.out.println("\n");
		
		//*****DIVISION(/)****//
		
		System.out.println("Division is : " +(a/b)); // Div of two integer datatype
		System.out.println("Division is : " +(f1/f2));  // Div of two float datatype
		System.out.println("\n");	
		
		//*****MODULUS(%)****//
		
		System.out.println("Modulus is : " +(a%b)); // mod of two integer datatype
		System.out.println("Modulus is : " +(f1%f2));  // mod of two float datatype
		System.out.println("\n");
		
		//*****INCREMENT OPERATOR (++)*****//
		a++;
		b++;
		f1++;
		f2++;
		System.out.println("Increment of a is : " +(a++)); //a=20
		System.out.println("Increment of b is : " +(b++)); //b=10
		System.out.println("Increment of f1 is : " +(f1++)); //f1=21.10f
		System.out.println("Increment of f2 is : " +(f2++)); //f1=30
		System.out.println("\n");		
		
		//*****DECREMENT OPERATOR (--)*****//
		a--;
		b--;
		f1--;
		f2--;
		System.out.println("Decrement of a is : " +(a--));
		System.out.println("Decrement of b is : " +(b--));
		System.out.println("Decrement of f1 is : " +(f1--));
		System.out.println("Decrement of f2 is : " +(f2--));
		
		}

}
