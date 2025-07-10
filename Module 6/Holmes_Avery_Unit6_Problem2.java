/**
 * Author: Avery Holmes
 * Course: ITP 120
 * Assignment: Unit 6 - Problem 2
 *
 * Purpose:
 * This program estimates the future cost of an item after a number of years
 * based on a user-provided annual inflation rate. It applies the rate
 * incrementally each year using a loop to calculate compound inflation.
 *
 * Pseudocode:
 * 1. Create Scanner to accept user input
 * 2. Prompt user for item price, years to purchase, and inflation rate
 * 3. Convert inflation percent to decimal
 * 4. Use a for loop to calculate the inflated cost year over year
 * 5. Display the final estimated price
 * 6. Close Scanner
 */

import java.util.Scanner;

public class Holmes_Avery_Unit6_Problem2 {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner keyboard = new Scanner(System.in);

        // Display program purpose
        System.out.println("This is a basic inflation calculator for calculating the cost of an item over a certain period of time: ");

        // Prompt user to enter the initial price of the item
        System.out.println("Enter price of item: ");
        double itemPrice = keyboard.nextDouble(); // Read item price

        // Prompt user to enter how many years until the item is purchased
        System.out.println("Enter the number of years from now the item will be purchased: ");
        int years = keyboard.nextInt(); // Read number of years

        // Prompt user to enter inflation rate (in percent form)
        System.out.println("Enter the rate of inflation (Entered as a percentage - Ex. 5.6 for 5.6%): ");
        float inflation = keyboard.nextFloat(); // Read inflation rate
        inflation = inflation / 100; // Convert percent to decimal

        // Loop to apply inflation year over year
        for (int i = 1; i <= years; i++) {
            itemPrice = itemPrice + (itemPrice * inflation); // Apply inflation
        }

        // Display the final inflated cost using formatted output using printf
        System.out.printf("The estimated cost of the item over %d year(s) of inflation at %.2f%% will be $%.2f%n", years, inflation * 100, itemPrice);

        // Close Scanner object to preserve resources
        keyboard.close();
    }
}
