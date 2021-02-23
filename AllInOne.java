package specialNumbers;

public class AllInOne {
// this Programs checks all the Specialty of a number
	
	// MAIN METHOD
	public static void main(String[] args) {
//		Input is another public class having getNumber STATIC Method and a return type of INTEGER
				
		System.out.println(" Find Special properties of a Number like: ");
		System.out.println(" > Palindrome OR Not \n > Armstrong OR Not \n > Special OR Not > EVEN or ODD \n > and Fibonacii Upto Number Count \n > Prime or Not");
		
		int num = Input.getNumber();	//gets NUM
		
		PalindromeNumber.palindromeNumber(num); 	// Palindromic check
		ArmStrongNumber.armstrongNumber(num);		// Armstrong Check
		SpecialNumber.specialNumber(num);		// Speciality check
		EvenOdd.evenOdd(num);		// EVEN or ODD
		PrimeNumber.checkprime(num); 	// Prime or NOT
		FibonaciiNumber.print(num);		// Fibonacii up to that number
		
	}
}
