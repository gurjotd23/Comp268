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