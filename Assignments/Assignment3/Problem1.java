package Assignments.Assignment3;
/**
 * title: Problem1.java
 * description: Assignment 3, Problem 1 - Count whitespaced seperated words in text file.
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
 *<H1>File Word Counter Utility</H1>
 *
 *<H3>Purpose and Description</H3>
 *
 *<P>
 * An application that reads a text file from the user's input and counts the number of words in the file.
 *</P>
 *<P>
 * This program prompts the user to enter the name of a text file, reads the contents of the file, splits the contents into words, and counts the total number of words. The program handles common exceptions like file not found and input/output errors during file processing.
 *</P>
 *<P>
 * The program uses basic file handling classes from the `java.io` package and `ArrayList` from the `java.util` package to store the words.
 *</P>
 *
 *<DL>
 *<DT> Compiling and running instructions</DT>
 *<DT> Assuming JDK is set up properly.</DT>
 *<DT> Change to the directory containing the source code.</DT>
 *<DD> Compile:    javac Problem1.java</DD>
 *<DD> Run:        java Problem1</DD>
 *<DD> Document:   javadoc Problem1.java</DD>
 *</DL>
 */

 /**
 *
 * <H3>Classes</H3>
 *
 *<P>
 * public class Problem1 {<BR>
 * This is the main public class for this application. It contains the main method that serves as the entry point for the program.
 *</P>
 *
 * <H3>Problem1 Methods</H3>
 *
 *<P>
   public static void main(String args[]) throws IOException {<BR>
   This method is the entry point of the application. It handles user input, file reading, word counting, and outputting the total word count to the console.
 *</P>
 *
 * <H3>Problem1 Instance Variables</H3>
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
 *    After the user provides the file name, the program reads the file and counts the number of words.
 *    It then displays the total word count on the console.
 * ACTUAL:
 *    The program behaves as expected.
 *</P>
 *<P>
 * 2. Good data cases:
 * EXPECTED:
 *    Provide a text file with known content and word count. For example:
 *    - If the file contains "Hello World", the output should be 2.
 *    - If the file contains multiple lines, the program should correctly count all words across all lines.
 * ACTUAL:
 *    The program correctly counts the number of words in the file.
 *</P>
 *<P>
 * 3. Bad data cases:
 * EXPECTED:
 *    Provide a non-existent file name. The program should output "File not found." and terminate gracefully.
 *    Provide a text file with no content (empty file). The program should output "0" as the word count.
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

/** primary (public) class for Problem1 */
public class Problem1 {

    /** 
     * This method is the entry point of the application. It handles user input,
     * file reading, word counting, and outputting the total word count to the console.
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream  
        System.out.print("Enter the name of the txt file in the directory to read (including .txt): ");  
        String str = sc.nextLine(); // reads the string   
        System.out.println("You have entered: " + str);

        sc.close(); // close the scanner to free up resources

        File file = new File(str); // create a file object with the user-provided file name

        ArrayList<String> words = new ArrayList<>(); // create an ArrayList to store the words

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(file)); // try to open the file
        } catch (FileNotFoundException e) {
            System.out.println("File not found."); // handle the case where the file is not found
            return;
        }

        String st;

        // read the file line by line
        while ((st = br.readLine()) != null) {
            String[] wordArray = st.split("\\s+"); // split the line into words

            for (String word : wordArray) {
                if (!word.trim().isEmpty()) { // check that the word is not just whitespace
                    words.add(word); // add the word to the ArrayList
                }
            }
        }

        try {
            br.close(); // close the BufferedReader
        } catch (IOException e) {
            System.out.println("Error closing the file."); // handle the case where closing the file fails
        }

        System.out.println("\nNumber of words in the file " + str + " is " + words.size()); // output the number of words
    }

}