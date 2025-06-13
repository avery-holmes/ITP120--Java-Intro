/**
 * Module 02: Chapter 2, Part I, Assignment II
 * @author Avery Holmes
 * This program takes the given temperature of 87.6 degrees Fahrenheit and converts it to Celsius.
 */

/*
Pseudocode:
-Define variable for temperature in Fahrenheit
-Define temperature formula to convert Fahrenheit to Celsius (Per Google: Celsius = ((Fahrenheit - 32) * 5 / 9) and assign to the variable temperatureCelsius
-All values in this program are best stored as floats as that is a decimal accurate up to 7 decimal points while only consuming 4 bytes of memory rather than using a double and consuming 8 bytes.
 */
public class Holmes_Avery_Unit2_Problem2 {

    public static void main(String[] args) {
        float temperatureFahrenheit = 87.6f;
        float temperatureCelsius = (temperatureFahrenheit - 32) * 5 / 9;

        // When using a float it was noted that it will print all available decimal points.
        // To consolidate I added "%.2f\n" to keep only two decimal places in the output as requested by the rubric. Note this rounds the 30.88 up to 30.89 in terms of precision.
        System.out.printf("Fahrenheit Temperature: %.2f\n", temperatureFahrenheit); // Prints Fahrenheit temperature from applicable variable
        System.out.printf("Celsius Temperature: %.2f\n", temperatureCelsius); // Prints result from calculation.
    }
}