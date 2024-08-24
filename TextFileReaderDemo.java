/**
 * DOCUMENTATION...
 */

/**
 *
 *<H1>Text File Reader Demo</H1>
 *
 *<H3>Purpose and Description</H3>
 *
 *<P>
 * The `TextFileReaderDemo` class demonstrates how to use the `TextFileReader` class to read a text file and display its contents.
 * This program accepts a filename as a command-line argument, uses the `TextFileReader` class to read the file, and then prints the contents to the console.
 * It also displays the contents line by line with corresponding line numbers.
 *</P>
 *<P>
 * This class serves as an example of how to utilize the `TextFileReader` class in a real-world scenario, such as reading configuration files or displaying text files in a console-based application.
 *</P>
 *
 *<DL>
 *<DT> Compiling and running instructions</DT>
 *<DT> Assuming JDK is set up properly.</DT>
 *<DT> Change to the directory containing the source code.</DT>
 *<DD> Compile:    javac TextFileReaderDemo.java</DD>
 *<DD> Run:        java TextFileReaderDemo [filename]</DD>
 *<DD> Document:   javadoc TextFileReaderDemo.java</DD>
 *</DL>
 */

 /**
 *
 * <H3>Classes</H3>
 *
 *<P>
 * public class TextFileReaderDemo {<BR>
 * This is the main public class for this demo application. It demonstrates the usage of the `TextFileReader` class to read and display the contents of a text file.
 *</P>
 *
 * <H3>TextFileReaderDemo Methods</H3>
 *
 *<P>
   public static void main(String args[]) throws IOException {<BR>
   This is the entry point of the application. It checks if a filename is provided as a command-line argument, reads the file using `TextFileReader`, and displays its contents. If no filename is provided, it outputs an error message.
 *</P>
 *
 * <H3>TextFileReaderDemo Instance Variables</H3>
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
 * 1. Basic functionality test:
 * EXPECTED:
 *    Run the program with a valid text file as a command-line argument.
 *    The program should display the contents of the file, followed by the contents displayed line by line with line numbers.
 * ACTUAL:
 *    The program behaves as expected.
 *</P>
 *<P>
 * 2. Missing filename test:
 * EXPECTED:
 *    Run the program without providing a command-line argument.
 *    The program should output "Please provide a filename as a command-line argument."
 * ACTUAL:
 *    The program handles the missing argument as expected.
 *</P>
 *<P>
 * 3. File not found test:
 * EXPECTED:
 *    Run the program with a non-existent filename as a command-line argument.
 *    The `TextFileReader` class should output "File not found." and the program should terminate gracefully.
 * ACTUAL:
 *    The program handles the file not found case as expected.
 *</P>
 */

/**
 * CODE...
 */

import java.io.IOException;

/** primary (public) class for TextFileReaderDemo */
public class TextFileReaderDemo {

    /**
     * This is the entry point of the application. It checks if a filename is provided as a command-line argument,
     * reads the file using `TextFileReader`, and displays its contents.
     * If no filename is provided, it outputs an error message.
     * 
     * @param args command-line arguments where the first argument should be the filename to read
     * @throws IOException if an I/O error occurs while reading the file
     */
    public static void main(String[] args) throws IOException {

        if (args.length > 0) {

            String fileName = args[0];

            // Create an instance of TextFileReader with the provided filename
            TextFileReader reader = new TextFileReader(fileName);

            // Display the contents of the file as a single string
            System.out.println(reader.contents());

            // Display the contents of the file line by line with line numbers
            reader.display();
        } else {
            System.out.println("Please provide a filename as a command-line argument.");
        }
    }
}