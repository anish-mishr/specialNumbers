package specialNumbers;
/**
 * @author Anish
 *
 * 
 */

public class NelsonNumber {
/* Nelson Number is a Number which is completely divisible by 111.
 * for Example 333
 */
	public static void nelsonNumber(int num) { // Static Method
		// Check condition for Nelson Number
		if(num%111==0)
			System.out.println(">> "+ num +" is Nelson Number");
		else
			System.out.println(">> "+ num +" is NOT Nelson Number");
	}
	// MAIN METHOD
	public static void main(String[] args) {
//		Input is another public class having getNumber STATIC Method and a return type of INTEGER
		
		System.out.println(" Find A Number is Nelson Number or NOT");
		int num = Input.getNumber();	// gets the NUM
		nelsonNumber(num);	// Static method to check number is Nelson Number or NOT		
	}
}
