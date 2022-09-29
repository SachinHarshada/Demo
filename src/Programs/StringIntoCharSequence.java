package Programs;

public class StringIntoCharSequence 
{
	public static void main(String[] args) 
	{	
		String a="Harshada is Software Tester";
		char b=0;;
		for(int i=0;i<a.length();i++)
		{
			
			b=a.charAt(i);
			if (a.charAt(i)!=' ')
			{
				System.out.println("Character from string is : "+b);
			}
		}
		System.out.println("\n");
		System.out.println("If suppose u dont want to calculate space then....");
		
		for(int i=0;i<a.length();i++)
		{
			
			b=a.charAt(i);
			System.out.println("Character from string is : "+b);

		}
	}
}
