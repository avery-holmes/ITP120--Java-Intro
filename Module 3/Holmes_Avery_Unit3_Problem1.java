/**
 * @author Avery Holmes
 * Unit 3 - Problem 1
 * This program reads two integers typed on the keyboard and outputs their sum, difference, and product.
 */
/*
Pseudocode:
1. Prompt user to enter first integer
2. Read first integer
3. Prompt user to enter second integer
4. Read second integer
5. Calculate sum, difference, and product
6. Display sum, difference, and product
*/
import java.util.Scanner; // Imports scanner utility

public class Holmes_Avery_Unit3_Problem1 {
    /**
     * Main method: Reads two integers entered by the user and displays their sum, difference, and product.
     */
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in); // Establishes ability to use keyboard as Standard Input Device.

    System.out.println("Enter Integer #1:"); // Displays message to user to enter first integer

        int integerOne = keyboard.nextInt();  // Collects user's first integer

    System.out.println("Enter Integer #2:"); // Displays message to user to enter second integer

        int integerTwo = keyboard.nextInt(); // Collects user's second integer

    System.out.println("Sum: " + (integerOne + integerTwo)); // Displays Sum
    System.out.println("Difference: " + (integerOne - integerTwo)); // Displays Difference
    System.out.println("Product: " + (integerOne * integerTwo)); // Displays Product

        keyboard.close(); // Close Scanner after input is complete (standard best practice)
    }
}
