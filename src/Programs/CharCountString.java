package Programs;

//import java.util.Scanner;

public class CharCountString 
{
	public static void main(String[] Har)
	{	
		//Scanner s=new Scanner(System.in);
		//String a;
		//System.out.println("Enter the String : ");
		//int a=s.nextInt();
		String a ="Harshada is the Software Tester";
		
		System.out.println(a);
		System.out.println("\n"); 	   
		System.out.println("Total index from the string : "+a.length());
		System.out.println("\n");
		int count=0;
		for(int i=0;i<a.length();i++)
		{
			if (a.charAt(i)!=' ')
			{
				 count++;
			}
				
		}
		System.out.println("Total character count is : "+count);
	}
	
}
