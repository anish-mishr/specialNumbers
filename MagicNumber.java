package specialNumbers;
/**
 * @author Anish
 *
 * 
 */

public class MagicNumber {
/* Magic Number is the number in which the sum of its digits recursively are calculated till a single digit 
 * If the single digit is 1 then the number is a magic number.
 * for example 226 is said to be a magic number
 * 2+2+6=10 sum of digits is 10 then again 1+0=1 now we get a single digit number is 1.
 */
	public static void magicNumber(int num) {	//Static Method
		int temp, rem, sum = 0;
		temp = num;		// temp is temporary number which holds the value of num
		while(temp > 9) {
			while(temp > 0) {
				rem = temp % 10;	// gets remainder with 10
				sum = sum + rem;  // calculates sum
				temp = temp /10;	// updated temp variable by dividing itself by  10
			}
			temp = sum; // temp stores sum
			sum = 0;	// Sum reinitialized to 0
		}
		if (temp == 1)		// checks if temp is exact 1 to satisfy Magic number condition
			System.out.println(">> "+ num +" is Magic Number");		// IF YES prints Magic Number
		else
			System.out.println(">> "+ num +" is NOT Magic Number");		// IF NO prints NOT Magic Number
		
	}
	// MAIN METHOD
	public static void main(String[] args) {
//		Input is another public class having getNumber STATIC Method and a return type of INTEGER
		
		System.out.println(" Find A Number is Magic Number or NOT");
		int num = Input.getNumber();	// gets the NUM
		magicNumber(num);	// Static method to check number is Magic Number or NOT
	}
}
