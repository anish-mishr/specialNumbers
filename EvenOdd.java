package specialNumbers;
/*
 * @author Anish
 *
 */

public class EvenOdd {
// This Program checks if a number is EVEN or ODD
	
	public static void evenOdd(int num) {
		if (num % 2 == 0) 	//checks number divisible by 2  
			System.out.println(">> "+ num + " is EVEN Number");	// IF YES prints EVEN
		else
			System.out.println(">> "+ num + " is ODD Number"); // IF NO prints ODD
	}
	// MAIN METHOD
	public static void main(String[] args) {
// 	Input is another public class having getNumber STATIC Method and a return type of INTEGER
		
		System.out.println(" Find a Number is EVEN or ODD");
		int num = Input.getNumber();  // Return the value of NUM
		evenOdd(num); // Static method to check the Number EVEN or ODD
	}

}
