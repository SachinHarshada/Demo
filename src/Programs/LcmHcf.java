package Programs;

public class LcmHcf {
	public static void main(String[] args) {
		// logic for LCM multiplication(product) of given two no.
		// LCM =Least common multiple,
		// GCD=Greatest common division(diviser) also called HCM.
		// HCM =Highest common Factor

		int a = 10;// 11, 2, 5, 10
		int b = 20;// 1 3 7 21
 		int LCM;
		int HCF = 0;

		for (int i = 1; i <= a; i++)//1
		{
			if (a % i == 0 && b % i == 0)//10%1 20%1 
			{
				HCF = i;// higest value will be here(10)// HCF
			}
		}

		System.out.println("HCF =" + HCF);
		LCM = a * b / HCF; // 50*60/10=3000/10=300 //
		System.out.println("LCM =" + LCM);
		
		

	}
}
