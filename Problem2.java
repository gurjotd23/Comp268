/**
 * title: Problem2.java
 * description: Assignment 3, Problem 2 - Open text file and display contents line by line.
 * date: August 14th, 2024
 * @author Gurjot Singh Dhanda 3691531
 * @version 1.0
 * @copyright 2011- 2024 Gurjot Singh Dhanda
 */
/**
 * DOCUMENTATION...
 */

/**
 *
 *<H1>Line-by-Line File Reader Utility</H1>
 *
 *<H3>Purpose and Description</H3>
 *
 *<P>
 * An application that reads a text file from the user's input and displays its contents line by line, waiting for the user to press the Enter key before displaying each new line.
 *</P>
 *<P>
 * The program prompts the user to enter the name of a text file. It then reads and displays each line of the file, pausing after each line until the user presses Enter. This allows the user to read the file at their own pace.
 *</P>
 *<P>
 * The program uses basic file handling classes from the `java.io` package and a `Scanner` from the `java.util` package to manage user input and file reading.
 *</P>
 *
 *<DL>
 *<DT> Compiling and running instructions</DT>
 *<DT> Assuming JDK is set up properly.</DT>
 *<DT> Change to the directory containing the source code.</DT>
 *<DD> Compile:    javac Problem2.java</DD>
 *<DD> Run:        java Problem2</DD>
 *<DD> Document:   javadoc Problem2.java</DD>
 *</DL>
 */

 /**
 *
 * <H3>Classes</H3>
 *
 *<P>
 * public class Problem2 {<BR>
 * This is the main public class for this application. It contains the main method that serves as the entry point for the program.
 *</P>
 *
 * <H3>Problem2 Methods</H3>
 *
 *<P>
   public static void main(String args[]) throws IOException {<BR>
   This method is the entry point of the application. It handles user input, file reading, and outputting each line of the file to the console. It waits for the user to press Enter before displaying each new line.
 *</P>
 *
 * <H3>Problem2 Instance Variables</H3>
 *
 *<P>
 * No instance variables are declared in this class. All operations are handled within the main method using local variables.
 *</P>
 */

/**
 *
 * <H3>Test Plan</H3>
 *
 *<P>
 * 1. Run the application.
 * EXPECTED:
 *    The program prompts the user to enter the name of a text file in the directory.
 *    After the user provides the file name, the program reads and displays the file's content one line at a time, pausing after each line until the user presses Enter.
 *    When the end of the file is reached, the program displays "End of file."
 * ACTUAL:
 *    The program behaves as expected.
 *</P>
 *<P>
 * 2. Good data cases:
 * EXPECTED:
 *    Provide a text file with known content. For example:
 *    - The program should display each line of the file in sequence, pausing after each line until Enter is pressed.
 * ACTUAL:
 *    The program correctly displays the lines as expected.
 *</P>
 *<P>
 * 3. Bad data cases:
 * EXPECTED:
 *    Provide a non-existent file name. The program should output "File not found." and terminate gracefully.
 *    Provide a text file with no content (empty file). The program should immediately display "End of file."
 * ACTUAL:
 *    The program handles these cases as expected.
 *</P>
 */

/**
 * CODE...
 */

/** Java core packages */
import java.util.*;
import java.io.*;

/** primary (public) class for Problem2 */
public class Problem2 {

    /** 
     * This method is the entry point of the application. It handles user input,
     * file reading, and outputting each line of the file to the console. 
     * It waits for the user to press Enter before displaying each new line.
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream  
        System.out.print("Enter the name of the txt file in the directory to read (including .txt): ");  
        String str = sc.nextLine(); // reads the string   
        System.out.println("You have entered: " + str);

        File file = new File(str); // create a file object with the user-provided file name

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(file)); // try to open the file
        } catch (FileNotFoundException e) {
            System.out.println("File not found."); // handle the case where the file is not found
            return;
        }

        String st;

        System.out.println("Press enter to display first line and each line after.");

        // read the file line by line and wait for the user to press Enter after each line
        while ((st = br.readLine()) != null) {
            sc.nextLine(); // wait for the user to press Enter
            System.out.println(st); // display the line
        }

        sc.close(); // close the scanner to free up resources

        try {
            br.close(); // close the BufferedReader
        } catch (IOException e) {
            System.out.println("Error closing the file."); // handle the case where closing the file fails
        }

        System.out.println();

        System.out.println("End of file."); // indicate that the end of the file has been reached
    }

}