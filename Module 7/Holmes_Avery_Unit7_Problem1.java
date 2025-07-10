/**
 * Author: Avery Holmes
 * Course: ITP 120
 * Assignment: Unit 7 - Problem 1: Sum & Factorial
 *
 * Purpose:
 * This program asks the user to choose whether to calculate the sum or the factorial
 * of a number. Based on the user’s input, the appropriate method is called, and the
 * result is displayed to the user.
 *
 * Pseudocode:
 * 1. Import Scanner for user input
 * 2. Prompt user to enter "sum" or "factorial"
 * 3. Read user input and store the selection
 * 4. Prompt user to enter a number to compute
 * 5. Use switch statement to call sum() or factorial() based on user input
 * 6. sum(): Use a loop to add numbers from 1 to input
 * 7. factorial(): Use a loop to multiply numbers from 1 to input
 * 8. Display the result in main method
 * 9. Close Scanner
 */

import java.util.Scanner; // import Scanner class

public class Holmes_Avery_Unit7_Problem1 // class declaration
{
    public static void main(String[] args) // main method
    {
        Scanner keyboard = new Scanner(System.in); // Scanner to take user input

        System.out.println("Enter 'sum' to add numbers from 1 to n, or 'factorial' to multiply them:"); // prompt for method
        String userChoice = keyboard.next(); // read user selection

        System.out.print("Enter a positive integer: "); // prompt for number
        int number = keyboard.nextInt(); // read the number

        int result = 0; // variable to hold result

        switch (userChoice) // determine appropriate method to call
        {
            case "sum":
                result = sum(number); // call sum method
                System.out.println("The sum from 1 to " + number + " is: " + result); // display result
                break; // exit case

            case "factorial":
                result = factorial(number); // call factorial method
                System.out.println("The factorial of " + number + " is: " + result); // display result
                break; // exit case

            default:
                System.out.println("Invalid input. Please enter 'sum' or 'factorial'."); // handle invalid input
        }

        keyboard.close(); // best practice to close Scanner
    }

    public static int sum(int input) // method to calculate sum
    {
        int total = 0; // running total
        for (int i = 1; i <= input; i++) // loop from 1 to input
        {
            total += i; // add current number to total
        }
        return total; // return final total
    }

    public static int factorial(int input) // method to calculate factorial
    {
        int product = 1; // running product
        for (int i = 1; i <= input; i++) // loop from 1 to input
        {
            product *= i; // multiply current number with product
        }
        return product; // return final product
    }
}