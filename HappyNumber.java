package specialNumbers;

public class HappyNumber {
/*AHappy Number is any positive number greater than zero(positive integer) is called happy number,
  if we repeatedly replace the number, 
  by sum of square of its digits till the final result becomes 1
  Example > 19 is a happy number 
	1^2+9^2 = 82 	( ^ = power )
	8^2+2^2 = 68	
	6^2+8^2 = 100	
	1^2+0^2+0^2 = 1
*/
	public static void happyNumber(int num) {		// Static Method
		int oNumber, number;	
		oNumber = number = num;		// oNumber and number are same as num
		do {
			oNumber = squareSum(oNumber);		// squareSum finds the sum of squares of oNumber
			number = squareSum(squareSum(number));	// squareSum finds the sum of squares of number and again finds the sum of squares
		}while(oNumber != number);	// repeat until oNumber gets equals to number
		if(oNumber == 1)	// check the happy number condition
			System.out.println(">> "+ num + " is a Happy number");		//IF TRUE prints Happy Number 
		else
			System.out.println(">> "+ num + " is a Sad number");	// IF FALSE prints Sad number
	}
	public static int squareSum(int num) {	// Calculates the sum of squares of a number
		int sqrSum=0;
		while(num>0) {
			sqrSum = sqrSum + ((num % 10) * (num % 10)); // add the squareSum with the square of last digit of number
			num = num / 10;		// updates number by dividing it by 10
		}
		return sqrSum;	// Returns the Sum of Squares
	}
	// MAIN METHOD
	public static void main(String[] args) {
//		Input is another public class having getNumber STATIC Method and a return type of INTEGER
		
		System.out.println(" Find A Number is Happy or Sad");
		int num = Input.getNumber();	// gets the NUM
		happyNumber(num);	// Static method to check number is Happy or Sad
	}

}
