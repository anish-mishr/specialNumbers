package specialNumbers;
/*
 * @author Anish
 *
 */

public class SpecialNumber {
/*	A number is said to be special number when the 
 	sum of factorial of its digits is equal to the number itself.
 	it is Some times called as Krishnamurthy Number or Peterson Number or Strong Number
 	Example- 145 is a Special Number as 1!+4!+5!=145.
*/
	
	public static void specialNumber(int num) {		// Static Method
		int fact, sum=0, rem, temp,i;
		temp = num;			
		
		while(temp>0) {
			rem = temp % 10;	// remainder with 10
			fact = 1;		// Factorial
			
			for(i=1;i<=rem;i++) // calculates factorial of a number
				fact = fact*i;		// factorial of number
			
			sum = sum + fact;	// calculates the Sum of Factorial of Number
			temp = temp / 10; 		// Temporary variable updated with divided by 10
		}
		
		if(sum == num)		// checks if SUM of factorial of number is same as number
			System.out.println(">> "+ num + " is a Special Number"); 	// if YES prints  Special Number
		else
			System.out.println(">> "+ num + " is NOT a Special Number");	// if NO prints NOT Special Number

	}
	// MAIN METHOD
	public static void main(String[] args) {
//		Input is another public class having getNumber STATIC Method and a return type of INTEGER
		
		System.out.println(" Find a Number is Special or NOT");
		int num = Input.getNumber();  // Return the value of NUM
		specialNumber(num); // Static method to check the Number is Special OR NOT
	}
}

