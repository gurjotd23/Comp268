/**
 * title: Bookshelf.java
 * description: Assignment 3, Problem 5 - Create a Bookshelf
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
 *<H1>Bookshelf Class</H1>
 *
 *<H3>Purpose and Description</H3>
 *
 *<P>
 * The `Bookshelf` class represents a collection of `Book` objects stored in an `ArrayList`.
 * This class demonstrates how to create and sort a list of books. The books are first displayed in the order they were added to the list, and then the list is sorted by title and year of publication in ascending order before being displayed again.
 *</P>
 *<P>
 * The class leverages the `Book` class, which must implement the `Comparable` interface to enable sorting by title and year. The sorting is performed using the `Collections.sort()` method.
 *</P>
 *
 *<DL>
 *<DT> Compiling and running instructions</DT>
 *<DT> Assuming Java SDK is installed and properly set up.</DT>
 *<DT> Change to the directory containing the source code.</DT>
 *<DD> Compile:    javac Bookshelf.java</DD>
 *<DD> Run:        java Bookshelf</DD>
 *<DD> Document:   javadoc Bookshelf.java</DD>
 *</DL>
 */

 /**
 *
 * <H3>Bookshelf Class Details</H3>
 *
 *<P>
 * public class Bookshelf {<BR>
 * This is the main class that demonstrates the usage of the `Book` class by creating, displaying, and sorting a list of books. It includes a main method to execute the program and a helper method to sort the list of books.
 *</P>
 *
 * <H3>Bookshelf Methods</H3>
 *
 *<P>
 * public static void main(String[] args) {<BR>
 * The main method creates a list of books, displays them in their original order, sorts them, and then displays them in sorted order.
 *</P>
 *<P>
 * public static void sortBooks(ArrayList<Book> books) {<BR>
 * This method sorts the `ArrayList` of books by title and year of publication in ascending order.
 *</P>
 *
 * <H3>Bookshelf Instance Variables</H3>
 *
 *<P>
 * No instance variables are declared in this class. All operations are handled within the methods using local variables.
 *</P>
 */

 /**
 *
 * <H3>Test Plan</H3>
 *
 *<P>
 * 1. Basic functionality test:
 * EXPECTED:
 *    The program should first display the list of books in the order they were added. After sorting, the program should display the books sorted by title in ascending order, and for books with the same title, sorted by year of publication.
 * ACTUAL:
 *    The program behaves as expected, displaying the books in unsorted order first and then in sorted order.
 *</P>
 *<P>
 * 2. Edge case with books of the same title:
 * EXPECTED:
 *    If multiple books have the same title, they should be sorted by year of publication in ascending order.
 * ACTUAL:
 *    The program correctly sorts books with the same title by year of publication.
 *</P>
 */

/**
 * CODE...
 */

/** Java core packages */
import java.util.ArrayList;
import java.util.Collections;

/**
 * The Bookshelf class represents a collection of Book objects stored in an ArrayList.
 * This class demonstrates how to create and sort a list of books. The books are first displayed
 * in the order they were added to the list, and then the list is sorted by title and year of
 * publication in ascending order before being displayed again.
 */
public class Bookshelf {

    /**
     * The main method creates a list of books, displays them in their original order, sorts them,
     * and then displays them in sorted order.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        
        // Create an ArrayList to hold Book objects
        ArrayList<Book> books = new ArrayList<>(12);

        // Add 12 Book objects to the ArrayList
        books.add(new Book("Too Big to Fail", "9780670021253", "Andrew Ross Sorkin", "1st", "Viking Press", 2009));
        books.add(new Book("The Options Playbook", "9798989888702", "Brian Overby", "2nd", "Options Playbook, Incorporated", 2009));
        books.add(new Book("Flash Boys: A Wall Street Revolt", "9780393244663", "Michael Lewis", "1st", "W. W. Norton & Company", 2014));
        books.add(new Book("No Logo: Taking Aim at the Brand Bullies", "9780006530404", "Naomi Klein", "1st", "Knopf Canada, Picador", 1999));
        books.add(new Book("Debt: The First 5000 Years", "9781933633862", "David Graeber", "1st", "Melville House", 2011));
        books.add(new Book("The Lean Startup", "9780307887894", "Eric Ries", "1st", "Crown Publishing Group", 2011));
        books.add(new Book("Thinking, Fast and Slow", "9780374275631", "Daniel Kahneman", "1st", "Farrar, Straus and Giroux", 2011));
        books.add(new Book("The Power of Habit", "9780812981605", "Charles Duhigg", "1st", "Random House", 2012));
        books.add(new Book("Sapiens: A Brief History of Humankind", "9780062316097", "Yuval Noah Harari", "1st", "Harper", 2014));
        books.add(new Book("The Subtle Art of Not Giving a F*ck", "9780062457714", "Mark Manson", "1st", "HarperOne", 2016));
        books.add(new Book("Educated", "9780399590504", "Tara Westover", "1st", "Random House", 2018));
        books.add(new Book("Becoming", "9781524763138", "Michelle Obama", "1st", "Crown Publishing Group", 2018));

        // Display the unsorted list of books
        System.out.println();
        System.out.println("Displaying unsorted bookshelf: ");
        System.out.println();

        for (Book book : books) {
            book.displayBookDetails();
            System.out.println();
        }

        // Sort the list of books
        sortBooks(books);

        // Display the sorted list of books
        System.out.println("Displaying sorted bookshelf: ");
        System.out.println();

        for (Book book : books) {
            book.displayBookDetails();
            System.out.println();
        }

    }

    /**
     * This method sorts the ArrayList of books by title and then by year of publication
     * in ascending order.
     *
     * @param books the ArrayList of Book objects to sort
     */
    public static void sortBooks(ArrayList<Book> books) {
        Collections.sort(books);
    }
}
