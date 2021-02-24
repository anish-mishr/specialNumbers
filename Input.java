package specialNumbers;
import java.util.Scanner;
/*
 * @author Anish
 *
 */

public class Input {
//	Static Method can be accessed using class name and without creating any Object
	public static int getNumber() {   // Static Method
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter a Number :");
		int num = sc.nextInt();   // gets the user input
		System.out.println("\t <===== \t  ===== \t  ===== \t  =====>\t");
		sc.close();	// Closes the Scanner Object
		return num;		// returns the Input Number
	}
	public static int reverseNumber(int num) { // Static Method to reverse a number
		int n=num, rev=0, rem;
		while(n>0) {
			rem = n%10;		// gets remainder by 10
			rev = rev*10 + rem;  // Makes Reverse of a number
			n = n/10; 		// Updates the number with quotient with 10
		}
		return rev; 	// returns reverse of number
	}
	public static long binaryDigit(int num) { // Static Method to convert Decimal to Binary
	      long binary = 0;
	      int i=1, rem = 0;
	      
	      while(num != 0) {	
	         rem = num % 2;	//gets remainder of number by dividing it by 2
	         binary = binary + rem * i; // Binary Conversion 
	         num = num / 2; // Num is updated divided by 2
	         i = i * 10; // i is updated i multiply 10
	      }
	      return binary; // returns Binary of Decimal number
	   }

}
