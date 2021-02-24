package specialNumbers;
/**
 * @author Anish
 *
 * 
 */

public class NeonNumber {
/* If the sum of digits of the square of the number is equal to the same number 
 * then the number is called Neon number.
 * for example 9
 * Square of 9 = 92= 81
 * Sum of the digits of the square = 8+1= 9
 * 9 is a Neon Number.
 */
	public static void neonNumber(int num) {	//Static Method
		int sqr, sqrSum=0, rem;
		sqr = num * num;	// gets square of num
		while(sqr > 0) {
			rem = sqr % 10;	// gets remainder by 10
			sqrSum = sqrSum + rem;		// gets sum of digits of square of number
			sqr = sqr / 10;	// update sqr with sqr divided by 10
		}
		if(sqrSum == num) 
			System.out.println(">> "+ num +" is Neon Number");
		else
			System.out.println(">> "+ num +" is NOT Neon Number");
		System.out.println(">> There is only 3 NEON number in 1 Billion");
	}
	// MAIN METHOD
	public static void main(String[] args) {
//		Input is another public class having getNumber STATIC Method and a return type of INTEGER
		
		System.out.println(" Find A Number is Neon Number or NOT");
		int num = Input.getNumber();	// gets the NUM
		neonNumber(num);	// Static method to check number is Neon Number or NOT

	}

}
