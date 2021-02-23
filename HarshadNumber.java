package specialNumbers;

public class HarshadNumber {
/*	Harshad Number is number which is divisible by the sum of its digits.
 	156 is divisible by the sum (12) of its digits (1, 5, 6 ). 
 */
	public static void harshadNumber(int num) {		//Static Method
		int temp, sum=0, rem;
		temp = num;
		
		while(temp>0) {		
			rem = temp % 10;		// gets remainder temporary divided by 10
			sum = sum + rem;	// gets sum
			temp = temp /10;		// updates temporary with temporary divided by 10
		}
		if(num%sum==0) 	// Checks num divisible by sum of its digits is ZERO (0)
			System.out.println(">> "+ num +" is Harshad Number");  		//IF YES prints Harshad Number
		else 
			System.out.println(">> "+ num +" is NOT Harshad Number");		//IF NO prints NOT Harshad Number
	}
	public static void main(String[] args) {
//		Input is another public class having getNumber STATIC Method and a return type of INTEGER
		
		System.out.println(" Find a Number is Harshad Number or NOT");
		int num = Input.getNumber();	// Return NUM
		harshadNumber(num);			// Static method to check the Harshad Number
	}

}
