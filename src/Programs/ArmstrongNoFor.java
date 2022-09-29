package Programs;

public class ArmstrongNoFor 
{
	 public static void main(String[] args)
	 {
			
		 int tempNumber, digit, digitCubeSum;

	        for (int i = 0; i < 1000; i++) 
	        {
	            tempNumber = i;
	            digitCubeSum = 0;
	            while (tempNumber != 0) {

	                /* On each iteration, remainder is powered by thetempNumber of digits n
	                 */

	                digit = tempNumber % 10;

	                //sum of cubes of each digits is equal to thetempNumber itself
	                digitCubeSum = digitCubeSum + digit * digit * digit;

	                tempNumber /= 10;

	            }

	            //check giventempNumber and digitCubeSum is equal to or not 
	            if (digitCubeSum == i)
	                System.out.println(i + " is an Armstrong Number");

	        }
	 }
 
}
