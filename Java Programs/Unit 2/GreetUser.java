/** A program to ask the users name, then greet them by it
 */

import java.util.Scanner;

public class GreetUser {
    
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter your name please: ");
    String name = input.nextLine();
    System.out.println();

    System.out.println("Hello " + name.toUpperCase() + ", nice to meet you!");

    input.close();

    }
}
