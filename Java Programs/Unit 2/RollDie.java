/** A program to display the message
 *  "Hello World!" on standard output.
 */
public class RollDie {

    public static void main(String[] args) {

        int first;
        int second;
        int total;

        first = (int)(Math.random()*6) + 1;
        second = (int)(Math.random()*6) + 1;
        total = first + second;

        System.out.println("The first die comes up " + first);
        System.out.println("The second die comes up " + second);
        System.out.println("Your total roll is " + total);

    }

}   // end of class HelloWorld