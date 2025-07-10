/**
 * Author: Avery Holmes
 * Course: ITP 120
 * Assignment: Unit 5 - Problem 2
 *
 * Purpose:
 * This program prompts the user to enter three names.
 * It then compares the names using conditional logic (not built-in sort methods)
 * to sort them alphabetically and display their order using printf formatting.
 *
 * Pseudocode:
 * 1. Create Scanner for user input
 * 2. Prompt for and store three names
 * 3. Use nested if/else comparisons to sort names alphabetically
 *    - Use .compareTo() to compare each pair
 * 4. Display the sorted names using printf formatting
 * 5. Close Scanner
 */

import java.util.Scanner;

public class Holmes_Avery_Unit5_Problem2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // Scanner object for input

        System.out.println("Today we will be comparing names using conditional logic: "); // Display purpose of program message

        System.out.println("Enter Name 1: "); // Prompt to enter Name 1
        String name1 =keyboard.nextLine(); // Capture input

        System.out.println("Enter Name 2: "); // Prompt to enter Name 2
        String name2 =keyboard.nextLine(); // Capture input

        System.out.println("Enter Name 3: "); // Prompt to enter Name 3
        String name3 =keyboard.nextLine(); // Capture input

        String first, second, third; // Create variables to manipulate in if-else statement ordering

        if (name1.compareTo(name2) < 0 && name1.compareTo(name3) < 0) { // Compare Name 1 to 2 & 3 to determine order.
            first = name1; // If statement true for Name 1, then first.
            if (name2.compareTo(name3) < 0) { // Compare Name 2 to 3
                second = name2; // If true, Name 2 is second
                third = name3; // Name 3 is third
            } else { // If the above is not true
                second = name3; // Name 3 is second
                third = name2; // NAme 2 is third
            }
        } else if (name2.compareTo(name1) < 0 && name2.compareTo(name3) < 0) { // If first "if" condition is false, do the same for Name 2
            first = name2;
            if (name1.compareTo(name3) < 0) {
                second = name1;
                third = name3;
            } else {
                second = name3;
                third = name1;
            }
        } else { // If both above conditions fail, Name 3 is the default choice and compare 1 against 2.
            first = name3;
            if (name1.compareTo(name2) < 0) {
                second = name1;
                third = name2;
            } else {
                second = name2;
                third = name1;
            }
        }
        // Display final result
        System.out.printf("The names in alphabetical order are:\nFIRST: %s\nSECOND: %s\nTHIRD: %s\n", first, second, third);

        keyboard.close(); // Close Scanner
    }
  }