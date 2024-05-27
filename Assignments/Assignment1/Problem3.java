package Assignments.Assignment1;
/**
 * title: Problem3.java
 * description: Assignment 1, Problem 3 - Make a temperature conversion table
 * date: May 22, 2024
 * @author Gurjot Singh Dhanda
 * @version 1.0
 */
/**
 * A program to display temperature conversion tables between Fahrenheit and Celsius.
 * It prints a table where each row shows a temperature in Fahrenheit with its equivalent in Celsius,
 * and vice versa. The table includes temperatures from -40 to 455 degrees Fahrenheit and Celsius.
 */
public class Problem3 {
    /**
     * The main method where the program execution begins.
     * It prints the headers and the conversion table.
     */
    public static void main(String[] args) {
        // Print the table headers
        System.out.println("            Temperature Conversion Tables");
        System.out.println();
        System.out.println("       Temperature      |       Temperature");
        System.out.println("        (degrees)       |        (degrees)");
        System.out.println("      F           C     |      C           F");

        // Declare variables for temperatures in Celsius and Fahrenheit
        double celsius, fahrenheit, celsius1, fahrenheit1, i;

        // Loop to generate and print temperature conversions
        for (i = -40; i < 456; i += 5) {
            // Convert the current Fahrenheit temperature (i) to Celsius
            fahrenheit = i;
            celsius = ((i - 32) * 5) / 9;

            // Convert the current Celsius temperature (i) to Fahrenheit
            fahrenheit1 = ((i * 9) / 5) + 32;
            celsius1 = i;

            // Print the formatted temperatures in both directions
            System.out.printf("%10.3f %10.3f | %10.3f %10.3f%n", fahrenheit, celsius1, celsius, fahrenheit1);
        }

        // Print an empty line for better readability after the table
        System.out.println();
    }
}
