package specialNumbers;
/*
 * @author Anish
 *
 */

public class FibonaciiNumber {
/*  Fibonacci Number is a number such that each number is the sum of the two preceding ones,
 	starting from 0 and 1.
 	ALWAYS starts from 0 and 1 
*/
	public static void print(long num) {
		long n1=0, n2=1,sum=0;   
		System.out.println(" The "+num+" Fibonacii Series Number are: ");  // Maximum Value up to which Fibonacci number be printed
		System.out.print("\t"+n1+"\t"+n2); // Printing number 1 and number 2 of fibonacii series
		
		for(int i=2;i<num;i++) {
			sum = n1+n2;				// Sums the number 
			System.out.print("\t"+sum); 	//Prints the numbers inn series
			n1 = n2;  	// Next number becomes the previous number and 
			n2 = sum;	 // Sum becomes the next number
		}
			
	}
	// MAIN METHOD
	public static void main(String[] args) {
//		Input is another public class having getNumber STATIC Method and a return type of INTEGER
		
		System.out.println(" \"Enter a Number to which you wanted to get Fibonacii Series\" ");
		long num = Input.getNumber(); // Returns the number NUM
		print(num); // calls  print method to print the Fibonacci Sequence 

	}

}
