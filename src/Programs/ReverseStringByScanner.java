package Programs;
import java.util.Scanner;
public class ReverseStringByScanner 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String: ");
		String string=sc.nextLine();
		
		String rev="";
		for (int i=string.length()-1;i>=0;i--)
		{
			rev=rev+string.charAt(i);
			
		}
		System.out.println(rev);
	}
}
