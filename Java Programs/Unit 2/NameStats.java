import java.util.Scanner;

public class NameStats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your first name and last name, separated by a space: ");
        String name = input.nextLine();

        input.close();

        String[] splitStr = name.trim().split("\\s+");

        System.out.println("Your first name is " + splitStr[0] + ", which has " + splitStr[0].length() + " characters");
        System.out.println("Your last name is " + splitStr[1] + ", which has " + splitStr[1].length() + " characters");
        System.out.println("Your initials are " + splitStr[0].charAt(0) + splitStr[1].charAt(0));

    }
}
