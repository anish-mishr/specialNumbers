package specialNumbers;
/**
 * @author Anish
 *
 * 
 */

public class KaprekarNumber {
/* Kaprekar Number is a number whose square divided into two parts (none of the parts have only 0)
 * and the sum of the parts is equal to the original number
 * for example 45 is Kaprekar Number
 * The square of 45 = 2025
 * sum of square of digits =20 + 25 = 45
 */
	public static void kaprekarNumber(int num) { // Static Method
		boolean bool = checkKaprekar(num);	// call a method checkKaprekar which returns boolean value
		if(bool)
			System.out.println(">> "+ num +" is Kaprekar Number");	//IF YES prints Kaprekar Number
		else
			System.out.println(">> "+ num +" is NOT Kaprekar Number"); //IF NO prints NOT Kaprekar Number
	}
	public static boolean checkKaprekar(int num) { //check number is Kaprekar Number or NOT
		int sqr, totalDigit, eqParts, sum=0;
		sqr = num * num;	// holds square of number
		//gets count of total digit of square of number
		totalDigit = DisariumNumber.countDigit(sqr);	// call static method countDigit from DisariumNumber
		
		for(int i=1;i<totalDigit;i++) {
			eqParts = (int) Math.pow(10, i);		// gets equal halves of Square
			if (eqParts == num) // if equal parts is same as number then skip that calculation
                continue; 	 
			
			sum = (sqr / eqParts) + (sqr % eqParts);	// gets sum of halves of square
			
			if(sum == num) // check if sum of firstHalf and secondHalf is exactly same as number
				return true;
		}
		
		return false;
	}
	// MAIN METHOD
	public static void main(String[] args) {
//		Input is another public class having getNumber STATIC Method and a return type of INTEGER
		
		System.out.println(" Find A Number is Kaprekar Number or NOT");
		int num = Input.getNumber();	// gets the NUM
		kaprekarNumber(num); 	// Static method to check number is Kaprekar Number or NOT
	}
}
