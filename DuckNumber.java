package specialNumbers;
/**
 * @author Anish
 *
 * 
 */

public class DuckNumber {
/* Duck Number is a Number which has at least one ZERO(0) in it.
 * Zero can not be in the beginning.
 * for Example 10 1002 etc
*/
	public static void duckNumber(int num) { //Static Method
		int temp,count=0;
		temp = num;
		while(temp>0) {
			if(temp%10 == 0)
				count++;
			temp = temp / 10;
		}
		if(count>0)
			System.out.println(">> "+ num +" is Duck Number");
		else
			System.out.println(">> "+ num +" is NOT Duck Number");
	}
	// MAIN METHOD
	public static void main(String[] args) {
//		Input is another public class having getNumber STATIC Method and a return type of INTEGER
		
		System.out.println(" Find A Number is Happy or Sad");
		int num = Input.getNumber();	// gets the NUM
		duckNumber(num);	// Static method to check number is Duck Number or NOT
	}
}