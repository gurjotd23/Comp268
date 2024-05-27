package Assignments.Assignment1;
/**
 * title: Problem1.java
 * description: Assignment 1, Problem 1 - generate a multiplication table for 1 - 12
 * date: May 21, 2024
 * @author Gurjot Singh Dhanda
 * @version 1.0
 */
/**
 * A program to display a multiplication table on standard output.
 * The table includes numbers from 1 to 12.
 */
public class Problem1 {
    /**
     * The main method where the program execution begins.
     * It prints a formatted multiplication table for numbers 1 to 12.
     */
    public static void main(String[] args) {
        // Declare variables N (for rows) and M (for columns)
        int N;
        int M;

        // Outer loop to handle the rows (0 to 12)
        for (N = 0; N < 13; N++) {
            // For the first row (header row)
            if (N == 0) {
                // Print leading space for alignment and the first header cell
                System.out.print("     |");
            } else {
                // For all other rows, print the row header (the current value of N)
                System.out.print(String.format("%1$4s", N) + " |");
            }
            
            // Inner loop to handle the columns (1 to 12)
            for (M = 1; M < 13; M++) {
                // For the first row (header row), print the column headers
                if (N == 0) {
                    System.out.print(String.format("%1$4s", M) + " |");
                } else {
                    // For all other rows, print the product of the current row and column numbers
                    System.out.print(String.format("%1$4s", N * M) + " |");
                }
            }
            
            // Move to the next line after printing all columns in the current row
            System.out.println();
        }
    }
}
