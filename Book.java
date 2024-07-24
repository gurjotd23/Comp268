/**
 * title: Book.java
 * description: Assignment 2, Problem 2 - Create a Book Class
 * date: May 24, 2024
 * @author Gurjot Singh Dhanda 3691531
 * @version 1.0
 */
/**
 * The Book class represents a book with attributes such as title, ISBN number,
 * author, edition, publisher, and year of publication.
 */

/**
 *
 *<H1>Book Class</H1>
 *
 *<H3>Purpose and Description</H3>
 *
 *<P>
 * This class models a book with several attributes, including title, ISBN number,
 * author, edition, publisher, and year of publication. It provides getter and setter
 * methods for these attributes, a method to display book details, and a main method
 * to demonstrate the creation and display of book objects.
 *</P>
 *
 *<DL>
 *<DT> Compiling and running instructions</DT>
 *<DT> Assuming Java SDK is installed and properly set up.</DT>
 *<DT> Change to the directory containing the source code.</DT>
 *<DD> Compile:    javac Book.java</DD>
 *<DD> Run:        java Book</DD>
 *<DD> Document:   javadoc Book.java</DD>
 *</DL>
 */

/**
 *
 *<H3>Book Class Details</H3>
 *
 *<P>
 * public class Book {<BR>
 * This is the main class representing a book. It contains attributes for the title,
 * ISBN, author, edition, publisher, and year of publication, as well as methods to
 * access and modify these attributes, and a method to display the book's details.
 *</P>
 *
 * <H3>Book Methods</H3>
 *
 *<P>
 * public Book(String title, String isbn, String author, String edition, String publisher, int yearOfPublication) {<BR>
 * Constructor for the Book class. Initializes a new book with the provided title, ISBN,
 * author, edition, publisher, and year of publication.
 *</P>
 *<P>
 * public String getTitle() {<BR>
 * Returns the title of the book.
 *</P>
 *<P>
 * public void setTitle(String newTitle) {<BR>
 * Sets the title of the book. Prints a message if the new title is null.
 *</P>
 *<P>
 * public String getISBN() {<BR>
 * Returns the ISBN number of the book.
 *</P>
 *<P>
 * public void setISBN(String newIsbn) {<BR>
 * Sets the ISBN number of the book. Prints a message if the new ISBN is null.
 *</P>
 *<P>
 * public String getAuthor() {<BR>
 * Returns the author of the book.
 *</P>
 *<P>
 * public void setAuthor(String newAuthor) {<BR>
 * Sets the author of the book. Prints a message if the new author is null.
 *</P>
 *<P>
 * public String getEdition() {<BR>
 * Returns the edition of the book.
 *</P>
 *<P>
 * public void setEdition(String newEdition) {<BR>
 * Sets the edition of the book. Prints a message if the new edition is null.
 *</P>
 *<P>
 * public String getPublisher() {<BR>
 * Returns the publisher of the book.
 *</P>
 *<P>
 * public void setPublisher(String newPublisher) {<BR>
 * Sets the publisher of the book. Prints a message if the new publisher is null.
 *</P>
 *<P>
 * public int getYearOfPublication() {<BR>
 * Returns the year of publication of the book.
 *</P>
 *<P>
 * public void setYearOfPublication(int newYearOfPublication) {<BR>
 * Sets the year of publication of the book. Prints a message if the new year is 0.
 *</P>
 *<P>
 * public void displayBookDetails() {<BR>
 * Displays the details of the book, including title, ISBN, author, edition, publisher,
 * and year of publication.
 *</P>
 *<P>
 * public static void main(String[] args) {<BR>
 * Demonstrates the creation of Book objects and displays their details using the
 * displayBookDetails method.
 *</P>
 */

/**
 *
 *<H3>Test Plan</H3>
 *
 *<P>
 * 1. Run the application.
 * EXPECTED:
 *    Console should display the details of five books, each followed by a blank line.
 * ACTUAL:
 *    Console displays the details of each book as expected.
 *</P>
 *<P>
 * 2. Good data cases:
 * EXPECTED:
 *    Book objects created with valid data should display the correct details:
 *    - Book 1: "Too Big to Fail", ISBN: "9780670021253", Author: "Andrew Ross Sorkin", Edition: "1st", Publisher: "Viking Press", Year: 2009
 *    - Book 2: "The Options Playbook", ISBN: "9798989888702", Author: "Brian Overby", Edition: "2nd", Publisher: "Options Playbook, Incorporated", Year: 2009
 *    - Book 3: "Flash Boys: A Wall Street Revolt", ISBN: "9780393244663", Author: "Michael Lewis", Edition: "1st", Publisher: "W. W. Norton & Company", Year: 2014
 *    - Book 4: "No Logo: Taking Aim at the Brand Bullies", ISBN: "9780006530404", Author: "Naomi Klein", Edition: "1st", Publisher: "Knopf Canada, Picador", Year: 1999
 *    - Book 5: "Debt: The First 5000 Years", ISBN: "9781933633862", Author: "David Graeber", Edition: "1st", Publisher: "Melville House", Year: 2011
 * ACTUAL:
 *    Results match the expected output.
 *</P>
 *<P>
 * 3. Bad data cases:
 * EXPECTED:
 *    The setter methods will print appropriate messages if provided null or invalid values.
 *    Example: Setting the title to null should print "New title value is null."
 * ACTUAL:
 *    Results match the expected behavior, with appropriate messages printed for null values.
 *</P>
 */

/**
 * Java core packages
 */
import java.util.*;

/**
 * The Book class represents a book with attributes such as title, ISBN number,
 * author, edition, publisher, and year of publication.
 */
public class Book {
    // Private attributes
    private String title;              // The title of the book
    private String isbn;               // The ISBN number of the book
    private String author;             // The author of the book
    private String edition;            // The edition of the book
    private String publisher;          // The publisher of the book
    private int yearOfPublication;     // The year of publication of the book

    /**
     * Constructs a new Book object with the specified title, ISBN, author, edition,
     * publisher, and year of publication.
     *
     * @param title              the title of the book
     * @param isbn               the ISBN number of the book
     * @param author             the author of the book
     * @param edition            the edition of the book
     * @param publisher          the publisher of the book
     * @param yearOfPublication  the year of publication of the book
     */
    public Book(String title, String isbn, String author, String edition, String publisher, int yearOfPublication) {
        // Assign the provided values to the respective attributes
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.edition = edition;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
    }

    // Getter and setter methods for title
    /**
     * Returns the title of the book.
     *
     * @return the title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the book.
     *
     * @param newTitle the new title of the book
     */
    public void setTitle(String newTitle) {
        // Check if the new title is null
        if (newTitle == null) {
            // Print a message indicating the title is null
            System.out.println("New title value is null.");
        } else {
            // Set the title to the new value
            this.title = newTitle;
        }
    }

    // Getter and setter methods for ISBN
    /**
     * Returns the ISBN number of the book.
     *
     * @return the ISBN number of the book
     */
    public String getISBN() {
        return isbn;
    }

    /**
     * Sets the ISBN number of the book.
     *
     * @param newIsbn the new ISBN number of the book
     */
    public void setISBN(String newIsbn) {
        // Check if the new ISBN is null
        if (newIsbn == null) {
            // Print a message indicating the ISBN is null
            System.out.println("New ISBN value is null.");
        } else {
            // Set the ISBN to the new value
            this.isbn = newIsbn;
        }
    }

    // Getter and setter methods for author
    /**
     * Returns the author of the book.
     *
     * @return the author of the book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author of the book.
     *
     * @param newAuthor the new author of the book
     */
    public void setAuthor(String newAuthor) {
        // Check if the new author is null
        if (newAuthor == null) {
            // Print a message indicating the author is null
            System.out.println("New author value is null.");
        } else {
            // Set the author to the new value
            this.author = newAuthor;
        }
    }

    // Getter and setter methods for edition
    /**
     * Returns the edition of the book.
     *
     * @return the edition of the book
     */
    public String getEdition() {
        return edition;
    }

    /**
     * Sets the edition of the book.
     *
     * @param newEdition the new edition of the book
     */
    public void setEdition(String newEdition) {
        // Check if the new edition is null
        if (newEdition == null) {
            // Print a message indicating the edition is null
            System.out.println("New edition value is null.");
        } else {
            // Set the edition to the new value
            this.edition = newEdition;
        }
    }

    // Getter and setter methods for publisher
    /**
     * Returns the publisher of the book.
     *
     * @return the publisher of the book
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Sets the publisher of the book.
     *
     * @param newPublisher the new publisher of the book
     */
    public void setPublisher(String newPublisher) {
        // Check if the new publisher is null
        if (newPublisher == null) {
            // Print a message indicating the publisher is null
            System.out.println("New publisher value is null.");
        } else {
            // Set the publisher to the new value
            this.publisher = newPublisher;
        }
    }

    // Getter and setter methods for year of publication
    /**
     * Returns the year of publication of the book.
     *
     * @return the year of publication of the book
     */
    public int getYearOfPublication() {
        return yearOfPublication;
    }

    /**
     * Sets the year of publication of the book.
     *
     * @param newYearOfPublication the new year of publication of the book
     */
    public void setYearOfPublication(int newYearOfPublication) {
        // Check if the new year of publication is 0
        if (newYearOfPublication == 0) {
            // Print a message indicating the year of publication is 0
            System.out.println("New year of publication value is 0.");
        } else {
            // Set the year of publication to the new value
            this.yearOfPublication = newYearOfPublication;
        }
    }

    /**
     * Displays the details of the book, including title, ISBN, author, edition,
     * publisher, and year of publication.
     */
    public void displayBookDetails() {
        // Print each attribute of the book using getter methods
        System.out.println("Title: " + getTitle());
        System.out.println("ISBN: " + getISBN());
        System.out.println("Author: " + getAuthor());
        System.out.println("Edition: " + getEdition());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("Year of Publication: " + getYearOfPublication());
    }

    /**
     * The main method demonstrates how to create instances of the Book class and
     * display their details using the displayBookDetails method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create instances of Book with different values
        Book book1 = new Book("Too Big to Fail", "9780670021253", "Andrew Ross Sorkin", "1st", "Viking Press", 2009);
        Book book2 = new Book("The Options Playbook", "9798989888702", "Brian Overby", "2nd", "Options Playbook, Incorporated", 2009);
        Book book3 = new Book("Flash Boys: A Wall Street Revolt", "9780393244663", "Michael Lewis", "1st", "W. W. Norton & Company", 2014);
        Book book4 = new Book("No Logo: Taking Aim at the Brand Bullies", "9780006530404", "Naomi Klein", "1st", "Knopf Canada, Picador", 1999);
        Book book5 = new Book("Debt: The First 5000 Years", "9781933633862", "David Graeber", "1st", "Melville House", 2011);

        // Display the details of each book
        System.out.println(); // Print a blank line for readability
        book1.displayBookDetails();
        System.out.println(); // Print a blank line for readability
        book2.displayBookDetails();
        System.out.println(); // Print a blank line for readability
        book3.displayBookDetails();
        System.out.println(); // Print a blank line for readability
        book4.displayBookDetails();
        System.out.println(); // Print a blank line for readability
        book5.displayBookDetails();
        System.out.println(); // Print a blank line for readability
    }
}