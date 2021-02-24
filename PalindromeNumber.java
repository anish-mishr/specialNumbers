package specialNumbers;
/*
 * @author Anish
 *
 */

public class PalindromeNumber {
/* Palindrome Number is a number that remains 
	the same when its digits are reversed. 
	for example 151
*/ 
	
	public static void palindromeNumber(int num) {  //Static Method
		
		// calls static method reverseNumber of Input class 
		int rev =Input.reverseNumber(num); //rev stores reversed value of number
				
		if(rev == num)  // Check if Original Number is same as reversed Number
			System.out.println(">> "+ num + " is Palindrome Number.");  //IF TRUE prints Palindrome
		
		else
			System.out.println(">> "+ num + " is not Palindrome Number.");   // IF NOT  prints NOT Palindrome
	}
	// MAIN METHOD
	public static void main(String [] agrs) {
//		Input is another public class having getNumber STATIC Method and a return type of INTEGER
		
		System.out.println(" Find a Number is Palindrome or NOT");
		int num = Input.getNumber();  // Return the value of NUM
		palindromeNumber(num); // Static method to check the Number Palindrome OR Not Palindrome
	}
}
