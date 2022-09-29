package Programs;

public class ReverseWordAtSamePosition 
{
	public static void main(String[] args)
	{

		String A1="Harshada is good girl";
		System.out.println(A1);
		String[] B = A1.split(" ");
		String rev="";
			
		for(int i=0;i<B.length;i++)
		{	
			String word=B[i];
			for(int j=word.length()-1;j>=0;j--)
			{
				rev=rev	+word.charAt(j);
			}
			rev=rev+" ";
		}
			
		System.out.println(rev);
			
			
			/*String a="Harshada is the Software Tester";
			
			int size=a.length();
			String count1 = "";
			
			String[] b=a.split(" ");
			for(int i=0;i<size;i++)
			{	
				String count="";
				String c=b[i];
				for(int j=size-1;j>=0;j--)
				{
					count = count+c.charAt(i);
					System.out.println(b);
				}
				count1=count1+count+" ";
			}
			System.out.println("String is : "+b);
			System.out.println("Reversed string is : "+count1);
			
			
			
			
			String str = "Harsha harshada";
			String[] A = str.split(" ");
			String reversedString = "";
			for (int i = 0; i < A.length; i++)
		    {
		           String word = A[i]; 
		           String reverseWord = "";
		           for (int j = word.length()-1; j >= 0; j--) 
		           {
		        	 
		        	   reverseWord = reverseWord + word.charAt(j);
		        	   
		           }
		           //System.out.println(reverseWord);
		          reversedString = reversedString + reverseWord+" ";
			}
			System.out.println(str);
			System.out.println(reversedString);
			*/
			
		
	 }
}
