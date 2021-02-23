package specialNumbers;
import java.util.Scanner;
/*
 * @author Anish
 *
 */

public class Input {
	public static int getNumber() {   // Static Method
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter a Number :");
		int num = sc.nextInt();   // gets the user input
		System.out.println("\t <===== \t  ===== \t  ===== \t  =====>\t");
		sc.close();
		return num;		// returns the Input Number
		
	}

}
