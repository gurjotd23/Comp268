/**
 * title: Problem4.java
 * description: Assignment 1, Problem 4 - Create a Java help menu
 * date: May 22, 2024
 * @author Gurjot Singh Dhanda
 * @version 1.0
 */

import java.util.Scanner;

/**
 * A program to display a help menu for various Java control flow statements.
 * The user can select an option to view a description of a specific statement.
 * The program continues to prompt the user for selections until they choose to exit.
 */
public class Problem4 {
    /**
     * The main method where the program execution begins.
     * It displays a help menu, handles user input, and shows descriptions for selected options.
     */
    public static void main(String[] args) {
        // Variable to control the continuation of the loop
        boolean cont = true;

        // Create a single Scanner object outside the loop to read user input
        Scanner input = new Scanner(System.in);

        // Loop to continue showing the menu and processing user input until they choose to exit
        while (cont) {
            // Display the help menu
            System.out.println("Java Help Menu");
            System.out.println("Select Help on:");
            System.out.println("1. If");
            System.out.println("2. Switch");
            System.out.println("3. For");
            System.out.println("4. While");
            System.out.println("5. Do-while");
            System.out.println("x. Exit");
            System.out.println();

            // Prompt the user for selection
            System.out.print("Selection: ");
            char selection = input.next().charAt(0); // Read the first character of the input
            System.out.println();

            // Handle the user's selection using a switch statement
            switch (selection) {
                case '1':
                    System.out.println("If: The if statement is the most basic control flow statement.");
                    System.out.println("It tells your program to execute a certain section of code only if a particular test evaluates to true.");
                    System.out.println("The if statement can be combined with other if and else statements to check multiple cases and perform different actions for each.");
                    break;
                case '2':
                    System.out.println("Switch: The switch statement is a branching control flow statement that allows for multiple execution paths like the if statement.");
                    System.out.println("It is more efficient than using a large number of if-else statements and can save some time on execution.");
                    System.out.println("The switch statement tests a given value and jumps directly to some part of the switch statement corresponding to that value.");
                    break;
                case '3':
                    System.out.println("For: The for statement provides a compact way to iterate over a range of values.");
                    System.out.println("It repeatedly loops over a specified set of actions until a certain condition is satisfied.");
                    System.out.println("The for statement is typically used to run some code a certain number of times in a counting loop structure.");
                    break;
                case '4':
                    System.out.println("While: The while statement is a control flow statement that allows code to be executed repeatedly based on a given Boolean condition.");
                    System.out.println("The value the while loop checks against does not have to be a Boolean value, but the condition will be.");
                    System.out.println("The while loop can be very useful especially when the number of iterations needed is not fixed.");
                    break;
                case '5':
                    System.out.println("Do-while: The do-while statement is very similar to the while statement except for one key difference.");
                    System.out.println("The while loop checks the Boolean condition before running any code, while the do-while statement checks the Boolean condition after running the code once.");
                    System.out.println("The do-while statement is useful in situations where some code must be executed at least once, possibly more.");
                    break;
                case 'x':
                    System.out.println("Thank you. Goodbye.");
                    cont = false; // Set the control variable to false to exit the loop
                    break;
                default:
                    System.out.println("Invalid selection, please try again."); // Handle invalid selections
                    break;
            }

            System.out.println(); // Print an empty line for better readability
        }

        // Close the Scanner object to release resources
        input.close();
    }
}