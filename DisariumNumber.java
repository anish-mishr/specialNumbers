package specialNumbers;
/**
 * @author Anish
 *
 * 
 */

public class DisariumNumber {
/*Disarium Number is a number whose sum of its digits powered
 * with their respective position is equal to the original number
 * for Example 89 is disarium Number // ^ = power/exponent
 * Number = 89 => 8^1 + 9^2 = 8 + 81 = 89
 */
	public static void disariumNumber(int num) {	// Static Method
		int temp, totalDigit, rem, sum=0;
		temp = num;	// temp variable to store value of num
		totalDigit = countDigit(num);	// countDigit is another function which return count of digits
		while(temp > 0) {
			rem = temp % 10;	// gets remainder of temp by 10
		// gets sum by adding sum and digit raise to power of its position
			sum = sum + (int)(Math.pow(rem, totalDigit));
			temp = temp / 10;	// updates temp by dividing it by 10
			totalDigit--;	// decreases count of digits by 1
		}
		if(sum == num) // check is sum is same as num
			System.out.println(">> "+ num +" is Disarium Number"); // IF YES prints Disarium Number
		else
			System.out.println(">> "+ num +" is NOT Disarium Number");	//// IF NO prints NOT Disarium Number
	}
		public static int countDigit(int num) {
			int count=0;
			while(num>0) {
				count++;
				num = num / 10;
			}
			return count;
	}
	// MAIN METHOD
	public static void main(String[] args) {
//		Input is another public class having getNumber STATIC Method and a return type of INTEGER
		
		System.out.println(" Find A Number is Disarium Number or NOT");
		int num = Input.getNumber();	// gets the NUM
		disariumNumber(num);	// Static method to check number is Disarium Number or NOT
	}
}
