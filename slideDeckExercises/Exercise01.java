/**
 * 
 */
package slideDeckExercises;

import java.util.Scanner;

/**
 * 
 */
public class Exercise01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare and initialise variables
		
		int age = 0;
		
		// Instantiate Scanner
		
		Scanner myScan = new Scanner(System.in);
		
		// Exercise
		
		
		try {
			System.out.println("What is your age?");
			age = myScan.nextInt();
			myScan.nextLine(); // clear buffer
			System.out.printf("%d - That is quite old", age);
			myScan.close();
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			System.out.println("Invalid input - please relaunch the program");
			ex.printStackTrace();
		}

	}

}
