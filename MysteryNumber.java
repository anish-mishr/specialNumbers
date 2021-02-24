package specialNumbers;
/**
 * @author Anish
 *
 * 
 */

public class MysteryNumber {
/* Mystery Number is a number which can be expressed as sum of two numbers 
 * and those two numbers should be reverse of each other
 * for example 121 is a mystery number
 * as 92 + 29 => 121 also 29 is reversed of 92
 */
	public static void mysteryNumber(int num) { //Static Method
		
		boolean bool = checkMystery(num);	// call a method checkMystery which returns boolean value
		if(bool)
			System.out.println(">> "+ num +" is Mystery Number");	//IF YES prints Mystery Number
		else
			System.out.println(">> "+ num +" is NOT Mystery Number"); //IF NO prints NOT Mystery Number
	}
	public static boolean checkMystery(int num) {
		
		for(int i=1;i<=num/2;i++) {
		
			// calls static method reverseNumber of Input class 
			int rev = Input.reverseNumber(i); // rev stores reverse of Number
			if(rev + i == num)
				return true;
		}
		return false;
	}
	// MAIN METHOD
	public static void main(String[] args) {
//		Input is another public class having getNumber STATIC Method and a return type of INTEGER
		
		System.out.println(" Find A Number is Mystery Number or NOT");
		int num = Input.getNumber();	// gets the NUM
		mysteryNumber(num); 	// Static method to check number is Mystery Number or NOT
	}
}
 