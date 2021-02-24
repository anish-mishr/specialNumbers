package specialNumbers;
/**
 * @author Anish
 *
 * 
 */

public class BuzzNumber { // Static Method
/* Buzz Number is a number which is completely divided by 7 or the last digit of number is 7
 * for example 14 and 17 are Buzz Number 
 * 14 gives 0 as remainder upon division by 7
 * and 17 has as digit as 7
 */
	public static void buzzNumber(int num) {	//Static Method 
		
		if((num % 7 == 0) || (num % 10 == 7)) //check condition for Buzz Number
			System.out.println(">> "+ num +" is Buzz Number");	// IF YES prints Buzz Number
		
		else
			System.out.println(">> "+ num +" is NOT Buzz Number"); // IF NO prints NOT Buzz Number
	}
	// MAIN METHOD
	public static void main(String[] args) {
//		Input is another public class having getNumber STATIC Method and a return type of INTEGER
		
		System.out.println(" Find A Number is Buzz Number or NOT");
		int num = Input.getNumber();	// gets the NUM
		buzzNumber(num);	// Static method to check number is Buzz Number or NOT

	}
}
