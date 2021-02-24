package specialNumbers;
/**
 * @author Anish
 *
 * 
 */

public class TechNumber {
/* Tech Number is a number which has an even number of digits,
 * and when the number of digits split into two halves 
 * then the square of the sum of those halves is equal to the original number
 * for example 2025
 * Number of digits = 4 (even)
 * Split 2025 into two halves, then
 * first half = 20	second half = 25
 * sum of the halves = 20+25 = 45
 * square of the sum of the halves = 45*45 = 2025
 */
	public static void techNumber(int num) {	// Sttaic Method
		int totalDigit, firstHalf, secondHalf,sum=0;
		totalDigit = DisariumNumber.countDigit(num); // calls a static Method in DisariumNumber class to count digits
		if(totalDigit%2 != 0)  // check Number of digit is even or NOT
			System.out.println(" Total Number of Digits is not EVEN");
		
		firstHalf = num / (int)Math.pow(10, totalDigit/2); // gets the first half of number
		secondHalf = num % (int)Math.pow(10, totalDigit/2); // gets the second half of number
		
		sum = firstHalf + secondHalf; // gets sum of both halves of number
		
		if((sum*sum) == num)  // check whether square of sum of both halves of number is same as number
			System.out.println(">> "+ num +" is Tech Number");	 // IF YES prints Tech Number
		else
			System.out.println(">> "+ num +" is NOT Tech Number"); // IF NO prints NOT Tech Number
	}
	// MAIN METHOD
	public static void main(String[] args) {
//		Input is another public class having getNumber STATIC Method and a return type of INTEGER
		
		System.out.println(" Find A Number is Tech Number or NOT");
		int num = Input.getNumber();	// gets the NUM
		techNumber(num);	// Static method to check number is Tech Number or NOT
	}
}
