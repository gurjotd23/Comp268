/** A program to count the users eggs
 */

import java.util.Scanner;

public class EggCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many eggs do you have?: ");
        int eggs = input.nextInt();

        input.close();

        int eggs_after_gross = eggs%144;
        
        int eggs_after_dozen = eggs%12;

        int gross = (int)Math.floor(eggs/144);
        int dozen = (int)Math.floor(eggs_after_gross/12);

        System.out.println("Your number of eggs is " + gross + " gross, " + dozen + " dozen, and " + 
        eggs_after_dozen + " eggs.");

    }
}