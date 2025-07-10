/**
 * Author: Avery Holmes
 * Course: ITP 120
 * Assignment: Unit 5 - Problem 1
 *
 * Purpose:
 * This program compares two names entered by the user.
 * It first checks for an exact match, then compares again after
 * converting both names to uppercase to simulate case-insensitive comparison.
 * If that comparison fails, it prints final message stating names aren't equal.
 *
 * Pseudocode:
 * 1. Create Scanner for input
 * 2. Prompt and store two names
 * 3. Compare names using .equals()
 *    - If equal → print confirmation
 *    - Else → convert both to uppercase and compare again
 *        - If equal → print case-insensitive match message
 *        - Else → print mismatch message
 * 4. Close Scanner
 */

import java.util.Scanner;

public class Holmes_Avery_Unit5_Problem1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Create a Scanner object for user input

        System.out.println("Today we will be comparing two names."); // Inform user of the purpose of this program
        System.out.println("Enter Name 1: "); // Prompt user to enter Name 1
        String name1 = input.nextLine(); // Gather input for Name 1

        System.out.println("Enter Name 2: "); // Prompt user to enter Name 2
        String name2 = input.nextLine(); // Gather input for Name 2

        if (name1.equals(name2)) { // if statement to compare Name 1 to Name 2
            System.out.println("The names are the same!"); // If above condition is true, print this confirmation
        } else {
            String name1Upper = name1.toUpperCase(); // Convert Name 1 to uppercase
            String name2Upper = name2.toUpperCase(); // Convert Name 2 to uppercase

            if (name1Upper.equals(name2Upper)) { // Statement to compare them again
                System.out.println("The names are equal if case is ignored!"); // If true, print message that they are equal if case is ignored
            } else {
                System.out.println(name1 + " is not equal to " + name2 + " even after ignoring case."); // If all conditions are false, print message that names are not equal
            }
        }
        input.close(); // Close scanner to free up resources
    }
}