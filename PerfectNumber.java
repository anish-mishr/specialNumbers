package specialNumbers;

public class PerfectNumber {
/* Perfect Number is is a positive integer that is equal to the sum of its positive divisors,
   excluding the number itself.
   For Example, 6 has divisors 1, 2 and 3, and 1 + 2 + 3 = 6,
   so 6 is a perfect number.
*/

	public static void perfectNumber(int num) {	//Static MEthod
		int sum=0;
		
		for(int i=1;i<num;i++) {	// Loops till i is smaller than num
			if(num%i==0)	// checks if i is a factor of num
				sum = sum + i;		// if i is factor add to sum
		}
		if (sum == num)	// check whether sum is same as num itself
			System.out.println(">> "+ num +" is a Perfect number");		// IF YES prints Perfect NUmber
		else
			System.out.println(">> "+ num +" is NOT a Perfect number");		// IF NOT prints not perfect Number
	}
	public static void main(String[] args) {
//		Input is another public class having getNumber STATIC Method and a return type of INTEGER
		
		System.out.println(" Find a Number is Perfect or Not");
		int num = Input.getNumber(); // gets NUM
		perfectNumber(num);	// Static Method to check a Number is perfect or not
	}

}
