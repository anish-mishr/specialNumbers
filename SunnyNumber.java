package specialNumbers;
/**
 * @author Anish
 *
 * 
 */

public class SunnyNumber {
/* Sunny Number is a number if the square root of the number N+1 is an integer number.
 * i.e., sqrt(N+1)%1 == 0
 * for example 24 is a sunny number because 24+1 = 25 has a square root of 5 which is an integer.
 */
	public static void sunnyNumber(int num) {	// Static Method
		if((Math.sqrt(num+1)) % 1 == 0)		// Checks the condition for Sunny Number
			System.out.println(">> "+ num +" is Sunny Number");		// IF TRUE prints Sunny Number
		else
			System.out.println(">> "+ num +" is NOT Sunny Number");		// IF not TRUE prints NOT Sunny number
	}
	// MAIN METHOD
	public static void main(String[] args) {
//		Input is another public class having getNumber STATIC Method and a return type of INTEGER
				
				System.out.println(" Find A Number is Sunny or NOT");
				int num = Input.getNumber();	// gets the NUM
				sunnyNumber(num);	// Static method to check number is Sunny or Not
	}
}
