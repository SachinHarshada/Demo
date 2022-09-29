package demo_1;

public class EncapClassB extends EncapClassA
{
	public static void main(String[] args) 
	{
		EncapClassA.addition();
		
		String a=EncapClassA.returnUserName();
		String b=EncapClassA.returnPassword();
		
		System.out.println(a);
		System.out.println(b);
		
		//EncapClassA.a=40; while we change access spec as public we can change the value of a
						// but for private access spec we cannot change the value
		
		EncapClassB m=new EncapClassB();
		m.addition(500);
		
		String n=m.returnUserName1();
		System.out.println(n);
		
		String o=m.returnPassword1();
		System.out.println(o);
		
	}
}
