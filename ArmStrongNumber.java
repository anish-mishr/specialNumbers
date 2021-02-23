package specialNumbers;

public class ArmStrongNumber {
/*	Armstrong number is a number that is equal to the sum of cubes of its digits.
 	for example 153 = 1^3 + 5^3 + 3^3
*/
	
	public static void armstrongNumber(int num) {	 	// Static Method
		int temp, rem, arm=0;
		temp = num;
		while(temp>0) {
			rem = temp % 10;	//gets remainder by 10
			arm = arm + (rem*rem*rem);		// calculates the the new number based on Armstrong definition
			temp = temp/10; 		// updates the temporary number divided by 10
		}
		if (arm == num)		// Checks  Number is Armstrong 
			System.out.println(">> "+ num + " is an Armstrong Number ");   	// if YES prints Number is Armstrong
		
		else
			System.out.println(">> "+ num + " is NOT an Armstrong Number ");	//	if NO prints Number is NOT Armstrong
	}
	// MAIN METHOD
	public static void main(String[] args) {
//		Input is another public class having getNumber STATIC Method and a return type of INTEGER
	
		System.out.println(" Find a Number is Armstrong Number or NOT");
		int num = Input.getNumber(); // Returns a NUM
		armstrongNumber(num); 	// gets NUM for Armstrong calculation
	}
}
