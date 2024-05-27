package Assignments.Assignment1;
import java.util.Scanner;
/**
 * title: Problem2.java
 * description: Assignment 1, Problem 2 - Make a program to covert temperature units
 * date: May 21, 2024
 * @author Gurjot Singh Dhanda
 * @version 1.0
 */
/**
 * A program to convert temperatures between Fahrenheit and Celsius.
 * The user can input a temperature and specify the unit (F or C),
 * and the program will output the equivalent temperature in the other unit.
 * The program continues to prompt the user for conversions until they choose to exit.
 */
public class Problem2 {
    /**
     * The main method where the program execution begins.
     * It handles user input, performs temperature conversions, and outputs the results.
     */
    public static void main(String[] args) {
        // Inform the user about the purpose of the program
        System.out.println("This program converts Temperatures from Fahrenheit to Celsius and vice versa.");

        // Variable to control the continuation of the conversion loop
        boolean cont = true;

        // Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Loop to continue processing conversions until the user chooses to exit
        while (cont) {
            // Prompt the user to enter the temperature
            System.out.print("Please enter your temperature: ");
            double temp = input.nextDouble();

            System.out.println(); // Print an empty line for better readability

            // Prompt the user to enter the units (F for Fahrenheit, C for Celsius)
            System.out.print("Please enter the units (F/C): ");
            char unit = input.next().charAt(0);

            // Convert the unit character to uppercase to ensure case insensitivity
            unit = Character.toUpperCase(unit);

            // Check the unit and perform the appropriate conversion
            if (unit == 'F') {
                // Convert Fahrenheit to Celsius
                double c_temp = ((temp - 32) * 5) / 9;
                // Print the result
                System.out.println("A temperature of " + String.format("%.0f", temp) + " degrees Fahrenheit is equivalent to " + String.format("%.0f", c_temp) + " degrees Celsius.");
            } else {
                // Convert Celsius to Fahrenheit
                double f_temp = ((temp * 9) / 5) + 32;
                // Print the result
                System.out.println("A temperature of " + String.format("%.0f", temp) + " degrees Celsius is equivalent to " + String.format("%.0f", f_temp) + " degrees Fahrenheit.");
            }

            // Prompt the user to decide whether to perform another conversion
            System.out.print("Do you wish to do another conversion? (Y/N):");
            char continue_choice = input.next().charAt(0);

            System.out.println(); // Print an empty line for better readability

            // Convert the continue choice character to uppercase to ensure case insensitivity
            continue_choice = Character.toUpperCase(continue_choice);

            // Check the user's choice to continue or exit the loop
            if (continue_choice == 'N') {
                // Set the control variable to false to exit the loop
                cont = false;
                // Thank the user and print a goodbye message
                System.out.println("Thank you. Goodbye.");
            }
        }

        // Close the Scanner object to release resources
        input.close();
    }
}