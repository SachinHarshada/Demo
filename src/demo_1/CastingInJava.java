package demo_1;

public class CastingInJava
{
	public static void main(String[] Har)
	{
		////// for implicit
		
		//byte a=127; // it is not possible 
		//short b=a; // we can store the data but memory wastage problem is occured
		
		/// explicit
		
		short c=128;
		byte a1=(byte)c; // we can do for to avoid the memory wastage
		System.out.println(a1);
		
	
	}
}
