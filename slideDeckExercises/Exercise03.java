/**
 * 
 */
package slideDeckExercises;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 */
public class Exercise03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = askForAge();
		System.out.println("You are " + age + " years old.");
		if (age > 65) {
			System.out.println("That's so old!");
		}

	}

	public static int askForAge() {

		// Declare and Initialise Variables

		int age = 0;
		boolean validInput = false;

		// Instantiate Scanner

		Scanner myScan = new Scanner(System.in);

		// While loop

		while (!validInput) {
			try {
				System.out.println("Please enter your age : ");
				age = myScan.nextInt();
				validInput = true;
			} catch (InputMismatchException ex) {
				System.out.println("Invalid input. Please enter a valid age (a number).");
				myScan.nextLine(); // clear buffer
				ex.printStackTrace();
			}

		}
		return age;
	}

}
