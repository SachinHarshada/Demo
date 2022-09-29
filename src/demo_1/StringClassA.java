package demo_1;

public class StringClassA
{

	public static void main(String[] args) 
	{
		String a="Velocity";
		System.out.println("a is :"+a);
		String b="Velocity";
		System.out.println("b is :"+b);
		
		String c=new String("Velocity");
		System.out.println("c is :"+c);
		String d=new String("Velocity");
		System.out.println("d is :"+d);
		
		// for compairing the address
		System.out.println("****Memorylocation comparsion == ***");
		System.out.println("Mem Loc Comp of a&b : " + (a==b)); //Memory location comparison
		System.out.println("Mem Loc Comp of c&d : " + (c==d));
		System.out.println("Mem Loc Comp of a&c : " + (c==a));
		System.out.println("\n");
		b="Class"; // Suppose I changed the value of b
		
		System.out.println("after changing the value of b mem loc is :"+ (a==b));
		System.out.println("\n");
		
		String f= "velocity";
		System.out.println("f is :"+f);
		System.out.println("\n");
		
		// for equals the data //equals method
		System.out.println("*******equals method **********");
		System.out.println("c&d by using equals : " + (c.equals(d)));
		
		System.out.println("a&f by using equals : " + (a.equals(f)));
		
		// for equals the data //equalIgnorecase method
		System.out.println("*******equalIgnorecase method **********");
		
		System.out.println("a&f by using equalsIgnoreCase : " + (a.equalsIgnoreCase(f)));
		System.out.println("a&d by using equalsIgnoreCase : " + (a.equalsIgnoreCase(d)));
		
		System.out.println("\n");
		
		//toUpperCase   // convert String data in Uppercase
		System.out.println("*******toUpperCase method **********");
		//System.out.println("f is :"+f);
		String t=f.toUpperCase();
		System.out.println("Uppercase of f is : "+ t);
		
		//toLowerCase  // convert String data in Lowercase
		System.out.println("*******toLower method **********");
		String s= a.toLowerCase();
		System.out.println("Lowercase of f is : "+s);
		
		System.out.println("\n");
		
		String m1="Velocity class";
		System.out.println("m1 is :"+m1);
		String m2="Engineer";
		System.out.println("m2 is : "+m2);
		String m3="Everywhere";
		System.out.println("m3 is : "+m3);
		
		//indexOf('') it is case sensitive
		System.out.println("*******indexOd('') method **********");
		int i =m1.indexOf('e');
		
		System.out.println("index i from Velocity Class : "+i);
		System.out.println("index of e from Engineer : "+ m2.indexOf('e'));
		System.out.println("index of e from Everywhere : "+ m3.indexOf('e'));
		
		System.out.println("*******lastIndexOf('') method **********");
		//lastIndexOf('')
		System.out.println("index of e from Engineer from last :"+m2.lastIndexOf('e'));
		System.out.println("index of e from Everywhere from last :"+m3.lastIndexOf('e'));		
		
		System.out.println("\n");
		
		// charAt(index)
		System.out.println("*******charAt(index) method **********");
		char j =m1.charAt(4);
		System.out.println("Char from index 4 : "+j);
		System.out.println("\n");
		
		//length();
		System.out.println("*******length() method **********");
		
		int k= m1.length();
		System.out.println("Total Index of m1 : " +k);  //length-1= last index
		
		System.out.println("\n");
		String m4=" Velocity class";
		System.out.println("m4 is : "+m4);// 
		System.out.println("\n");
		
		int k1= m4.length(); 	
		System.out.println("Total Index of m4 : " +k1);//it calculate space bet two words, also 
		// calculate the space before starting of first word or letter
		System.out.println("\n");
		
		//startsWith(" ")
		System.out.println("*******startsWith(\" \") method **********");
		
		boolean p=m1.startsWith("Vel");
		System.out.println("m1 is start from Vel :"+p);
				
		boolean p1=m1.startsWith("vel");
		System.out.println("m1 is start from vel :"+p1); // it is case sensitive
		
		boolean p2=m4.startsWith("vel");
		System.out.println("m4 is start from Vel :"+p2); // it is case sensitive in m4 after 
		// 	" i will provide the space sso he also compair the space also
		
		//endsWith(" ")
		System.out.println("*******endsWith(\" \") method **********");
		boolean q= m1.endsWith("class");
		System.out.println("m1 ends with class : " +q);
		
		System.out.println("m4 ends with class : " +(m4.endsWith("clas")));
		
		System.out.println("\n");
		
		//substring - overloaded (2)
		System.out.println("*******substring- overloaded (2) method **********");
		String subStr =m1.substring(4);
		System.out.println("starting string from index 4 : "+subStr);
				
		String subStr2 =m1.substring(4,7);
		System.out.println("starting string from index 4 and till 9th index : "+subStr2); //4<7 it is not a 4<=7
		// it will not counted the 7the index var
		System.out.println("\n");
		
		
		//trim()
		System.out.println("*******trim() method **********");
		
		String m5="  Velocity class   ";
		System.out.println("m5 is : "+m5);
		String r=m5.trim();
		System.out.println("before using trim string is : "+m5);// space is also calculate
		System.out.println("after using trim string is : "+r); // first and last space is not calculate
		System.out.println("\n");
		
		// concatinating
		System.out.println("*******concatinating method **********");
		String v=  "Velocity";
		System.out.println("v is : "+v);
		String v1= " class";
		System.out.println("v1 is : "+v1);
		String v2= v+" is"; //1 
		System.out.println("v2 is : "+v2);
		String v3= v+" Everywhere";
		System.out.println("v3 is : "+v3);
				
		String v4=v.concat(" at Katraj");//2
		System.out.println("V4 is concat of v and at katraj  : "+v4);
		
		String v5=v2+v1+v3;  //3
		System.out.println("concat of multiple strings by using + : "+v5);
		
		
		String v6= v.concat(v1);
		System.out.println("Concat of two strings : "+v6);
		
		String v7=v.concat(v1).concat(v3).concat(v4); //4
		System.out.println("concat of multiple strings by using concat : "+v7);
		
		System.out.println("\n");
		
		//split
		System.out.println("*******split method **********");
		
		String y="Velocity Class Katraj";
		System.out.println("y is : "+y);
		
		String y1[]= y.split(" ");//for split the words from spaces
		System.out.println("First word is : "+y1[0]);
		System.out.println("Second word is : "+y1[1]); // showing second word becoz indexing of words start from zero
		System.out.println("Third word is : "+y1[2]);
		
		
		String y2=y1[1];
		System.out.println("only second word is stored in another string : "+y2);
		System.out.println("Printing that second word string as it is : "+y1[1]);
		
		String y3[]=y.split("t");
		System.out.println("word is before t : "+y3[0]);
		System.out.println("Word is after t : "+y3[1]);
		
				
	}
}
