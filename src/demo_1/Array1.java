package demo_1;

import java.util.Arrays;

public class Array1 
{
	public static void main(String[] args)
	{
		/*int a[]= {1,2,3,'a'};
		short b[]= {1};
		byte c[]= {100};
		float d[]= {1.1f,1};
		double e[]= {1.1,1,3};
		char f[]= {'m','n',10};
		String g[]= {"Harshada", "is", "Soft Tester", "10"};
		
		System.out.println("\n int datatype");
		//System.out.println(a[0]);
		//System.out.println(a[1]);
		//System.out.println(a[2]);
		System.out.println(a[0]+"\n"+a[1]+"\n"+a[2]);
		//System.out.println("for char value : "+a[3]); // for int datatype for charatcter it will
														// print the ascii value of the character
		
		System.out.println("\n short datatype");
		System.out.println(b[0]);
		
		System.out.println("\n byte datatype");
		System.out.println(c[0]);
		
		System.out.println("\n float datatype");
		System.out.println(d[0]);
		System.out.println(d[1]);
		
		System.out.println("\n double datatype");
		//System.out.println(e[0]);
		//System.out.println(e[1]);
		//System.out.println(e[2]);
		System.out.println(e[0]+"\n"+e[1]+"\n"+e[2]);
		
		System.out.println("\n char datatype");
		System.out.println(f[0]);
		System.out.println(f[1]);
		System.out.println("for digit value :" +f[2]); // for char datatype for int value it will
														// print the space value of the integer
		
		
		System.out.println("\n String datatype");
		System.out.println(g[0]);
		System.out.println(g[1]);
		System.out.println(g[2]);
		System.out.println(g[3]);*/
		
		//int A[]= {'a'};
		//System.out.println("1."+A[0]);
		////A[0]=10;
		//System.out.println("2."+A[0]);
		//for (int i=0;i<=3;i++)
		//{
		//	System.out.println(A[i]);
		//}
		
		int B[]=new int[4];
		B[1]=1;
		
		System.out.println(B[1]);
		
		
		
		//*** Largest no from Array***////
		int A[]= {400,20,30,40};
		int size=A.length;
		Arrays.sort(A);
		System.out.println("sorting element : "+Arrays.toString(A));
		int ans=A[size-1];
		System.out.println("Largest No is : " + ans);
		
		
		/*for(int i=0;i<=size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(A[i]>=A[j])
				{
					System.out.println("Largest no is : " +A[i]);
					
				}
			}
		}*/
		
		
	}
}
