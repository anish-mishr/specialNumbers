package specialNumbers;
/*
 * @author Anish
 *
 */

public class PrimeNumber {
/* Prime Number is a Number having at most (Maximum) 2 factors or Multiples
	i.e., Only Divisible by 1 and itself.
	for example:-->> 2 is prime number having 1 and 2 as its factor
*/
	public static void checkprime(int num) {
		int i, fact=0;
		
		for(i=1;i<=num;i++) {		// to check the factors/Multiples of number
			if(num%i==0)	// divides number by 1 to number to find factors
				fact++;			// increases factors count if number divided by i gives 0 remainder
		}
		if (fact==2)	// checks the factors counts
			System.out.println(">> "+ num + " is PRIME Number");	// IF exact two (2) factors prints PRIME
		else
			System.out.println(">> "+ num + " is NOT PRIME Number"); // IF not the prints Not PRIME
	}
	// MAIN METHOD
	public static void main(String[] args) {
//		Input is another public class having getNumber STATIC Method and a return type of INTEGER.
		
		System.out.println(" Check a number is Prime or NOT");
		int num = Input.getNumber();	// gets Num
		checkprime(num);	// Static Method for checking Prime or NOT
	}

}
