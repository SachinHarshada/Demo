package Programs;

public class ReverseString 
{
	public static void main(String[] args)
	{
		String string="Harshada is the good cook";
		System.out.println(string);
		String rev="";
		for (int i=string.length()-1;i>=0;i--)
		{
			rev=rev+string.charAt(i);
			
		}
		System.out.println(rev);
	}
}
