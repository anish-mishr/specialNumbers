package specialNumbers;
/**
 * @author Anish
 *
 * 
 */

public class PronicNumber {
/* Pronic Number s a number which is the product of two consecutive integers
 * i.e., a number of the form n(n + 1)
 * for example  0, 2, 6, 12 are Pronic number
 * pronic number is also called oblong numbers, heteromecic numbers, or rectangular numbers.
 */
	public static void pronicNumber(int num) {	// Static Method
		int pronic=0,i;
		// check whether i * (i+1) is same as num
			// also i will always smaller or equal to the sqr root of num as 
		// it will be then a bigger than original number 
		for(i=0;i<= (int)Math.sqrt(num);i++) {	
			if(num == i*(i+1))	// check if i*(i+1) is same as num
				pronic = i*(i+1);	// if yes assigns i*(i+1) to pronic 
		}
		if(pronic == num) // check whether pronic is same as num
			System.out.println(">> "+ num +" is Pronic Number"); // IF YES prints Pronic Number
		else
			System.out.println(">> "+ num +" is NOT Pronic Number"); // IF NOT prints NOT Pronic Number
	}
	// MAIN METHOD
	public static void main(String[] args) {
//		Input is another public class having getNumber STATIC Method and a return type of INTEGER
		
		System.out.println(" Find A Number is Pronic Number or NOT");
		int num = Input.getNumber();	// gets the NUM
		pronicNumber(num);	// Static method to check number is Pronic Number or NOT
	}
}
