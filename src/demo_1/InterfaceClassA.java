package demo_1;

public interface InterfaceClassA 
{ 
	 int r=50; //public,static,final
	 
	 void test(); //public abstract
	 
	 public static void demo()
	 {
		 System.out.println("Static method interface");
	 }
	 
	 public default void defaultMethod()
	 {
		 System.out.println("Default Method of interface");
	 }
	 
	 ///****For generalisation***///
	 
	 //void Axis();
	 void Hdfc();
}
