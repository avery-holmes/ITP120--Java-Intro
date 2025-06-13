/**
 * Module 02: Chapter 2, Part I, Assignment
 * @author Avery Holmes
 * This program calculates the total number of calories burned for a 150lb person who runs 6 MPH for 30 minutes,
 * plays basketball for 30 minutes, and sleeps for 6 hours.
 */

/*
Pseudocode:
-Define constants for MET values, weight conversion, and calorie data
-Define variables for person weight in lbs and convert to kg per formula in assignment instructions
-Define time spent doing each activity
-Calculate calories burned per minute for each activity
-Derive the sum of all categories to determine total number of calories burned
-Output total calories burned
 */

public class Holmes_Avery_Unit2_Problem1 {

    public static final double RUNNING_MET = 10.0;
    public static final double BASKETBALL_MET = 8.0;
    public static final double SLEEPING_MET = 1.0;
    public static final double KG_LB_CONVERSION = 2.2;
    public static final double CALORIE = 0.0175;

    public static void main(String[] args) {
        /**
          Main method of the program. Calculates and displays total calories burned
          @param args Command-line arguments (not used)
         */
        double weightLbs = 150.0; // Example weight of 150lb person as a variable
        double weightKg = weightLbs / KG_LB_CONVERSION; // Divides 150.0 by 2.2 and stores as variable for later calculations
        double runningCaloriesBurned = (CALORIE * RUNNING_MET * weightKg) * 30; // This will return the value for calories burned per minute for 30 minutes of running at 6MPH
        double basketballCaloriesBurned = (CALORIE * BASKETBALL_MET * weightKg) * 30;   // This will return the value for the basketball calories burned per minute for 30 minutes
        double sleepingCaloriesBurned = (CALORIE * SLEEPING_MET * weightKg) * (60 * 6); // This will return the value for calories burned per minute during 6 hours of sleep

        double totalCaloriesBurned = runningCaloriesBurned + basketballCaloriesBurned + sleepingCaloriesBurned; //Sum of all three activities will equal total calories burned

        System.out.print("The total number of calories burned for a 150lb person that has run 6 MPH for 30 minutes, played basketball for 30 minutes and slept for 6 hours is " + totalCaloriesBurned + "."); // Final output

    }


}
