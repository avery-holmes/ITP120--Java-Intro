/**
 * Author: Avery Holmes
 * Course: ITP 120 - Java Programming I
 * Unit 4 - Problem 1
 *
 * Purpose:
 * This program prompts the user to enter a test score and then
 * prints the corresponding letter grade based on a standard grading scale.
 *
 * Pseudocode:
 * 1. Declare an integer variable for the test score.
 * 2. Prompt the user to enter a test score.
 * 3. Use Scanner to capture user input.
 * 4. Use if-else if statements to determine the letter grade:
 *    - A: 90 and above
 *    - B: 80–89
 *    - C: 70–79
 *    - D: 60–69
 *    - F: below 60
 * 5. Display the corresponding letter grade to the user.
 */

import java.util.Scanner; //Imports keyboard as Standard Input Device

public class Holmes_Avery_Unit4_Problem1 {

    public static void main(String[] args) {

        int testScore; // Step 1: Declare variable of Test Score

        Scanner keyboard = new Scanner(System.in);

            System.out.println ("Enter test score:"); // Step 2: Prompt user to enter a test score
            testScore=keyboard.nextInt(); // Use scanner to capture user input

        if (testScore >= 90) { // A: 90+
            System.out.println("You got an A on the test!");
        }
        else if (testScore >= 80) { // B: 80-89
            System.out.println("You got a B on the test!");
        }
        else if (testScore >= 70) { // C: 70-79
            System.out.println("You got a C on the test!");
        }
        else if (testScore >= 60) { // D: 60-69
            System.out.println("You got a D on the test!");
        }
        else { // F: Any number below 60
            System.out.println("You got an F on the test!");
        }

        keyboard.close(); // Close scanner
    }
}