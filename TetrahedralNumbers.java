package specialNumbers;
/*
 * @author Anish
 *
 */

public class TetrahedralNumbers {
/* Tetrahedral Numbers are those numbers which can be represented as a pyramid with a triangular base and three sides.
   Formula for nth tetrahedral number:
   	Tn = (n * (n + 1) * (n + 2)) / 6
	for example:
	1, 4, 10, 20, 35, 56, 84, 120, 165, 220, … 
*/
	public static void tetrahedralNumber(long num) {	// Static Method
		long n;
		n = (num * (num +1) * (num + 2)) / 6; 	// Tetrahedral Formula for N-th Tetrahedral number
		System.out.println(">> " + num +"th tetrahedral number is : "+ n);	// Prints the Tetrahedral NUmber
		
	}
	// MAIN METHOD
	public static void main(String[] args) {
//		Input is another public class having getNumber STATIC Method and a return type of INTEGER
		
		System.out.println(" Find N-th Tetrahedral Number");
		long num = Input.getNumber();	// gets NUM
		tetrahedralNumber(num);		//Static method for printing N-th tetrahedral number
	}
}
