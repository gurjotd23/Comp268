/**
 * title: Problem5.java
 * description: Assignment 1, Problem 5 - Create program to list prime numbers from 1 to 10,000
 * date: May 22, 2024
 * @author Gurjot Singh Dhanda
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;

/**
 * A program to list all the prime numbers from 1 to 10,000.
 * Prime numbers are displayed on the standard output.
 */
public class Problem5 {
    /**
     * The main method where the program execution begins.
     * It finds and prints all prime numbers between 1 and 10,000.
     */
    public static void main(String[] args) {
        // Print the program's purpose
        System.out.println("Program to list all the prime numbers from 1 to 10,000:");
        System.out.println();

        // Variable declarations
        int n; // Represents the current number being checked for primality
        int i; // Loop variable used for checking factors

        // Loop through numbers from 2 to 10,000
        for (n = 2; n < 10001; n++) {
            // Create lists to store factors for comparison
            List<Integer> factor_check = new ArrayList<>();
            List<Integer> factors = new ArrayList<>();

            // Add 1 and n to the factor_check list as these are always factors of n
            factor_check.add(1);
            factor_check.add(n);

            // Find all factors of n and add them to the factors list
            for (i = 1; i <= n; i++) {
                if (n % i == 0) {
                    factors.add(i);
                }
            }

            // Check if the factors list matches the factor_check list
            // If they match, n is a prime number (only 1 and n are factors)
            if (factor_check.equals(factors)) {
                System.out.println(n); // Print the prime number
            }
        }

        // Print an empty line for better readability
        System.out.println();
    }
}
