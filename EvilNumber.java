package specialNumbers;
/**
 * @author Anish
 *
 * 
 */

public class EvilNumber {
/* Evil Number is a positive whole number that has an even number of 1’s in its binary equivalent
 * for example 9 is evil number
 * The binary equivalent of 9 is 1001
 * and 1001 contains even numbers of 1’s
 */
	public static void evilNumber(int num) {	//Stattic Method
		
		// calls static method binaryDigit of Input class
		long binary = Input.binaryDigit(num);	// binary stores the binary digit of Num
		int count = 0;
		
		while(binary != 0) {
			
			if(binary % 10 == 1) // if binary divided by 10 gives remaider 1
				count++;	//increase count by 1
			
			binary = binary / 10; // binary is updated bu dividing by 10
		}
		if(count % 2 == 0) // check count is even for Evil condition
			System.out.println(">> "+ num +" is Evil Number"); // IF YES prints Evil Number
		else
			System.out.println(">> "+ num +" is NOT Evil Number"); // IF NO prints NOT Evil Number
	}
	// MAIN METHOD
	public static void main(String[] args) {
//		Input is another public class having getNumber STATIC Method and a return type of INTEGER
		
		System.out.println(" Find A Number is Evil or NOT");
		int num = Input.getNumber();	// gets the NUM
		evilNumber(num);	// Static method to check number is Evil or NOT

	}
}
