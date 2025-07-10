/**
 * Author: Avery Holmes
 * Course: ITP 120 - Java Programming I
 * Unit 4 - Problem 2
 *
 * Purpose:
 * This program prompts the user to enter the weight of a package
 * and calculates the shipping cost.
 *
 * Pseudocode:
 * 1. Declare a double variable for package weight.
 * 2. Prompt user for weight input.
 * 3. Read weight using Scanner.
 * 4. Use if-else if statements to:
 *    - Validate that the weight is greater than 0.
 *    - Determine shipping cost by multiplying weight with rate:
 *        - $1.20 if weight <= 5
 *        - $1.00 if 5 < weight <= 10
 *        - $0.90 if 10 < weight <= 20
 *        - $0.80 if weight > 20
 * 5. Display the total shipping cost.
 * 6. Close the scanner.
 */

import java.util.Scanner; // Import Standard Input Device

public class Holmes_Avery_Unit4_Problem2 {

    public static void main(String[] args) {

        double packageWeight; // Declare Variable to store input weight

        Scanner keyboard = new Scanner(System.in);

        System.out.println("How much does your package weigh in lbs.?"); // Prompt user to enter package weight
        packageWeight=keyboard.nextDouble(); // Store input


        if (packageWeight <=0) { // Catch all for errors
            System.out.println("Invalid Weight. Please enter a value greater than 0."); // Display error message and prompt to re-enter weight
        }
        else if (packageWeight <= 5) { // First condition for packages greater than or equal to 5lbs in weight
            System.out.println("Your package weight is " + packageWeight + " pounds, the total cost of shipping is $ " + (packageWeight * 1.20)); // Display message indicating package weight and total shipping cost.
        }
        else if (packageWeight > 5 && packageWeight <= 10) { // Second condition for packages greater than 5lbs but less than or equal to 10 lbs in weight
            System.out.println("Your package weight is " + packageWeight + " pounds, the total cost of shipping is $ " + (packageWeight * 1.00)); // Display message indicating package weight and total shipping cost.
        }
        else if (packageWeight > 10 && packageWeight <= 20) { // Third condition for packages greater than 10lbs but less than or equal to 20 lbs in weight
            System.out.println("Your package weight is " + packageWeight + " pounds, the total cost of shipping is $ " + (packageWeight * 0.90)); // Display message indicating package weight and total shipping cost.
        }
        else if (packageWeight > 20) { // Fourth condition for packages greater than 20lbs
            System.out.println("Your package weight is " + packageWeight + " pounds, the total cost of shipping is $ " + (packageWeight * 0.80)); // Display message indicating package weight and total shipping cost.
        }
    keyboard.close(); // Close scanner
    }
}