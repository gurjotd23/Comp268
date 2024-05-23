/** A program to count the users change
 */

import java.util.Scanner;

public class ChangeCounter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many quarters do you have?: ");
        int quarters = input.nextInt();
        System.out.print("How many nickels do you have?: ");
        int nickels = input.nextInt();
        System.out.print("How many dimes do you have?: ");
        int dimes = input.nextInt();

        input.close();

        float total = ((quarters*25) + (nickels*5) + (dimes*10));
        total = total/100;

        System.out.print("You have a total of ");
        System.out.printf( "$%.2f\n", total);

    }
    
}