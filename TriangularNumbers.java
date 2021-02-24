package specialNumbers;
/**
 * @author Anish
 *
 */

public class TriangularNumbers {
/* Triangular Number is a number which  we can represent it in the form of triangular grid 
 * of points such that the points form an equilateral triangle and each row contains as many points as the row number.
 * i.e., the first row has one point, 
 * second row has two points, third row has three points and so on.
 * The starting triangular numbers are 1, 3 (1+2), 6 (1+2+3), 10 (1+2+3+4).
*/
	public static void triangularNumber(int num) {
		int sum = 0;
		if(num < 0)  // Checks whether Num is not zero or negative
			System.out.println(">> Number is 0 or Negative Integer");
		
		for(int i=1;sum<num;i++) {
			sum = sum + i;		// Triangular number condition 
		}
		if(sum == num) // checks if sum is equals to num
			System.out.println(">> "+ num +" is a Triangular Number");		// IF YES prints Triangular
		else
			System.out.println(">> "+ num +" is NOT a Triangular Number");		//IF NO prints NOT Triangular
	}
	// MAIN METHOD
	public static void main(String[] args) {
//		Input is another public class having getNumber STATIC Method and a return type of INTEGER
		
		System.out.println(" Find a Number is Triangular or NOT");
		int num = Input.getNumber();	//gets NUM
		triangularNumber(num);		// checks if the number is Triangular or NOT
	}
}
