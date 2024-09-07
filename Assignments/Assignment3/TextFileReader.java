package Assignments.Assignment3;
/**
 * title: TextFileReader.java
 * description: Assignment 3, Problem 3 - Create a text file reader class
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
 *<H1>Text File Reader Utility</H1>
 *
 *<H3>Purpose and Description</H3>
 *
 *<P>
 * The `TextFileReader` class provides functionality to read a text file into a string array and perform various operations with the contents of the file.
 * The class can read a file's content line by line and store each line in an array. It provides methods to display the contents of the file and to return the contents as a `StringBuffer`.
 *</P>
 *<P>
 * This class can be used in situations where a file's content needs to be stored and manipulated in memory, such as processing configuration files, logs, or other text-based data.
 *</P>
 *
 *<DL>
 *<DT> Compiling and running instructions</DT>
 *<DT> Assuming JDK is set up properly.</DT>
 *<DT> Change to the directory containing the source code.</DT>
 *<DD> Compile:    javac TextFileReader.java</DD>
 *<DD> Run:        This class is not designed to be run standalone. Instead, create an instance of `TextFileReader` from another Java program.</DD>
 *<DD> Document:   javadoc TextFileReader.java</DD>
 *</DL>
 */

 /**
 *
 * <H3>Classes</H3>
 *
 *<P>
 * public class TextFileReader {<BR>
 * This is the main public class for this utility. It provides methods to read a text file, store its contents in an array, and perform operations such as displaying the contents or returning them as a `StringBuffer`.
 *</P>
 *
 * <H3>TextFileReader Methods</H3>
 *
 *<P>
   public TextFileReader() {<BR>
   This is a no-argument constructor for the `TextFileReader` class. It initializes the string array but does not read any file.
 *</P>
 *<P>
   public TextFileReader(String fileName) throws IOException {<BR>
   This constructor accepts a file name as a parameter and reads the contents of the specified file into the string array. Each line of the file is stored in a separate element of the array.
 *</P>
 *<P>
   public StringBuffer contents() {<BR>
   This method returns the contents of the string array as a `StringBuffer`. It concatenates all non-null elements of the array into a single `StringBuffer`.
 *</P>
 *<P>
   public void display() {<BR>
   This method displays the contents of the string array to the console, with each line prefixed by its line number.
 *</P>
 *
 * <H3>TextFileReader Instance Variables</H3>
 *
 *<P>
 * private String[] stringArray = new String[100]; - This array holds the lines of the file. It has a fixed size of 100 elements, meaning it can store up to 100 lines from the file.
 *</P>
 */

/**
 *
 * <H3>Test Plan</H3>
 *
 *<P>
 * 1. Basic functionality test:
 * EXPECTED:
 *    Create an instance of `TextFileReader` using a sample text file with known content.
 *    The `display()` method should output each line of the file with line numbers.
 *    The `contents()` method should return the concatenated contents of the file as a `StringBuffer`.
 * ACTUAL:
 *    The methods behave as expected.
 *</P>
 *<P>
 * 2. File not found test:
 * EXPECTED:
 *    Provide a non-existent file name. The constructor should output "File not found." and terminate without throwing an unhandled exception.
 * ACTUAL:
 *    The program handles the file not found case as expected.
 *</P>
 *<P>
 * 3. Large file test:
 * EXPECTED:
 *    Provide a file with more than 100 lines. The program should only store and display the first 100 lines, and the remaining lines should be ignored.
 * ACTUAL:
 *    The program correctly limits the stored lines to 100.
 *</P>
 */

/**
 * CODE...
 */

/** Java core packages */
import java.util.*;
import java.io.*;

/** primary (public) class for TextFileReader */
public class TextFileReader {

    /** This array holds the lines of the file. It has a fixed size of 100 elements. */
    private String[] stringArray = new String[100];
    
    /** 
     * No-argument constructor for the `TextFileReader` class. 
     * It initializes the string array but does not read any file.
     */
    public TextFileReader() {
    }

    /** 
     * Constructor that accepts a file name as a parameter and reads the contents of the specified file.
     * Each line of the file is stored in a separate element of the array.
     * 
     * @param fileName the name of the file to read
     * @throws IOException if an I/O error occurs
     */
    public TextFileReader(String fileName) throws IOException {
        File file = new File(fileName);

        BufferedReader br = null;

        int index = 0;

        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return;
        }

        String st;

        // Read the file line by line and store each line in the string array
        while ((st = br.readLine()) != null && index < stringArray.length) {
            stringArray[index] = st;
            index = index + 1;
        }

        try {
            br.close(); // Close the BufferedReader
        } catch (IOException e) {
            System.out.println("Error closing the file.");
        }
    }

    /** 
     * This method returns the contents of the string array as a `StringBuffer`.
     * It concatenates all non-null elements of the array into a single `StringBuffer`.
     * 
     * @return the concatenated contents of the file as a `StringBuffer`
     */
    public StringBuffer contents() {
        StringBuffer result = new StringBuffer();

        for (String line : stringArray) {
            if (line != null) {
                result.append(line);
            }
        }

        return result;
    }

    /** 
     * This method displays the contents of the string array to the console,
     * with each line prefixed by its line number.
     */
    public void display() {

        int index = 1;

        for (String line : stringArray) {

            if (line != null) {
                System.out.println(index + ": " + line);
                index = index + 1;
            }

        }
    }
}

