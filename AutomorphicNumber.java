package specialNumbers;
/**
 * @author Anish
 *
 * 
 */

public class AutomorphicNumber {
/* Automorphic Number is a number in which the square of the number ends with the same number.
 * for example 5 is Automorphic Number
 * 5 => 5^2 => 25 and last digit of 25 is 5 which is same as number
 */
	public static void automorphicNumber(int num) {	// Static Method
		int sqr, lstDigitNum, lstDigitSqr;
		sqr = num * num;	// Holds Square of Num
		lstDigitSqr = sqr % 10;		// holds last digit of Square
		lstDigitNum = num % 10;	 //holds lst digit of Num
		
		if(lstDigitNum == lstDigitSqr) //Check Condition for Automorphic Number
			System.out.println(">> "+ num +" is Automorphic Number"); // IF YES prints Automorphic Number
		else
			System.out.println(">> "+ num +" is NOT Automorphic Number"); // IF NO prints NOT Automorphic Number
	}
	// MAIN METHOD
	public static void main(String[] args) {
//		Input is another public class having getNumber STATIC Method and a return type of INTEGER
		
		System.out.println(" Find A Number is Automorphic Number or NOT");
		int num = Input.getNumber();	// gets the NUM
		automorphicNumber(num);	// Static method to check number is Automorphic Number or NOT

	}
}
