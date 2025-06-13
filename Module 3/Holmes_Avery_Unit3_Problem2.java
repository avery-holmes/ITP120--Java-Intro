/**
 * @author Avery Holmes
 * Unit 3 - Problem 2
 * This program reads a line of text entered by the user and outputs the text first in all uppercase letters
 * and then in all lowercase letters.
 */

/*
Pseudocode:
1. Prompt user to enter a line of text
2. Read entire line of text
3. Convert line of text to uppercase
4. Convert line of text to lowercase
5. Display line in uppercase
6. Display line in lowercase
*/

import java.util.Scanner; // Imports scanner utility

public class Holmes_Avery_Unit3_Problem2 {
    /**
     * Main method: Reads a line of text from the user and displays it in uppercase and lowercase.
     */
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in); // Establishes ability to use keyboard as Standard Input Device. You could use var here.

        System.out.println("Input any line of text: " ); // Displays message to user

        String textEntered = keyboard.nextLine(); // Collects input from user

        String textEnteredUpper = textEntered.toUpperCase(); // Converts input to uppercase
        String textEnteredLower = textEntered.toLowerCase(); // Converts input to lowercase

        System.out.println("String in Upper Case: " + textEnteredUpper); // Displays input in uppercase
        System.out.println("String in Lower Case: " + textEnteredLower); // Displays input in lowercase

        keyboard.close(); // Closes Scanner after input is complete (standard best practice)

    }
}
