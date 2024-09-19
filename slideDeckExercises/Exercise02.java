/**
 * 
 */
package slideDeckExercises;

/**
 * 
 */
public class Exercise02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int num1, num2, answer;
			num1 = 9;
			num2 = 2;
			
			// about to cause the exception
			
			answer = num1 / num2;
			System.out.println(answer);
			
			//about to catch a specific exception
		} catch (java.lang.ArithmeticException ex){
			System.out.println("The second number is zero");
			System.out.println(ex.getMessage());
			System.out.println(ex.toString());
			ex.printStackTrace();
		} catch (Exception ex) {
			System.out.println("Sorry there has been a problem");
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("And there you go folks");
		}

	}

}
