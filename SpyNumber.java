package specialNumbers;
/**
 * @author Anish
 *
 * 
 */

public class SpyNumber {
/* A Spy Number is a number whose sum of the digits of is equal to the product of its digit.
 * for example 132
 * The sum of digits = 1 + 3 + 2 = 6
 * The product of the digits = 1 * 3 * 2 = 6
 * 132 is a spy number.
 */
	public static void spyNumber(int num) {		// Static Method
		int sum=0, product=1, rem,temp;
		temp = num;	// Temp stores the value of num
		while(temp>0) {
			rem = temp % 10;	// gets remainder by dividing by 10
			sum = sum + rem;		// stores sum and add remainder to it
			product = product * rem ;	// stores multiplication by multiplying itself with the remainder
			temp = temp / 10;	// updates temp by dividing by 10
		}
		if(sum == product)	// checks condition for Spy Number
			System.out.println(">> "+ num +" is Spy Number");	// IF YES prints Spy Number
		else
			System.out.println(">> "+ num +" is NOT Spy Number");	// IF NO prints NOT Spy Number 
	}
	// MAIN METHOD
	public static void main(String[] args) {
//		Input is another public class having getNumber STATIC Method and a return type of INTEGER
		
		System.out.println(" Find A Number is Spy Number or NOT");
		int num = Input.getNumber();	// gets the NUM
		spyNumber(num);	// Static method to check number is Spy Number or NOT


	}
}
