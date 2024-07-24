/**
 * title: Animal.java
 * description: Assignment 2, Problem 1 - Create an Animal Class
 * date: May 24, 2024
 * @author Gurjot Singh Dhanda 3691531
 * @version 1.0
 * @copyright 2011- 2024 Gurjot Singh Dhanda
 */
/**
 * The Animal class and its subclasses represent different animals.
 * Each animal can make a sound, and the program demonstrates polymorphism by calling the sound method on different animal objects.
 *
 * <H1>Animal Class Hierarchy</H1>
 * <P>
 * The program consists of an abstract base class <code>Animal</code> and several subclasses representing specific animals.
 * Each subclass overrides the <code>sound</code> method to provide an animal-specific sound.
 * </P>
 *
 * <H2>Test Plan:</H2>
 * <H3>1. No Command-Line Argument</H3>
 * <P>
 * Run the program without any command-line arguments.
 * <BR> Expected Output: "One animal name is required!" and the program should exit.
 * </P>
 *
 * <H3>2. Multiple Command-Line Arguments</H3>
 * <P>
 * Run the program with more than one command-line argument.
 * <BR> Example: <code>java AnimalTest pig cow</code>
 * <BR> Expected Output: "Only one animal name can be passed into the parameters!" and the program should exit.
 * </P>
 *
 * <H3>3. Valid Animal Names</H3>
 * <P>
 * Run the program with a single valid animal name (pig, sheep, duck, cow).
 * <BR> Example: <code>java AnimalTest pig</code>
 * <BR> Expected Output:
 * <UL>
 *   <LI>"I am an animal"</LI>
 *   <LI>"I am a pig"</LI>
 *   <LI>"Pig says oink"</LI>
 * </UL>
 * </P>
 *
 * <H3>4. Invalid Animal Name</H3>
 * <P>
 * Run the program with an invalid animal name.
 * <BR> Example: <code>java AnimalTest cat</code>
 * <BR> Expected Output:
 * <UL>
 *   <LI>"Invalid input, please try again."</LI>
 *   <LI>"Input must be one of pig, sheep, duck, or cow."</LI>
 * </UL>
 * </P>
 */

/**
 * The Animal class represents a generic animal.
 * It provides a constructor that prints a generic animal message and a method to print a generic sound.
 */
public class Animal {

    /**
     * Constructor for the Animal class.
     * Prints a generic message indicating an animal is created.
     */
    public Animal() {
        System.out.println("I am an animal");
    }

    /**
     * Method to print a generic sound message.
     * This method should be overridden by subclasses to provide specific animal sounds.
     */
    public void sound() {
        System.out.println("An animal makes a sound based on the animal that it is");
    }

    /**
     * The main method demonstrates polymorphism by creating instances of various animal subclasses.
     * It calls the <code>sound</code> method on each instance to display the animal-specific sounds.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Loop to create and display sounds of animals 10 times
        for (int i = 0; i < 10; i++) {
            // Create instances of each animal subclass
            Pig pig = new Pig();
            Sheep sheep = new Sheep();
            Duck duck = new Duck();
            Cow cow = new Cow();

            // Call the sound method for each animal
            pig.sound();
            sheep.sound();
            duck.sound();
            cow.sound();

            // Print an empty line for better readability
            System.out.println();
        }
    }
}

/**
 * The Pig class represents a pig and extends the Animal class.
 * It overrides the <code>sound</code> method to provide a pig-specific sound.
 */
class Pig extends Animal {

    /**
     * Constructor for the Pig class.
     * Prints a message indicating a pig is created.
     */
    public Pig() {
        System.out.println("I am a pig");
    }

    /**
     * Method to print the sound a pig makes.
     */
    @Override
    public void sound() {
        System.out.println("Pig says oink");
    }
}

/**
 * The Sheep class represents a sheep and extends the Animal class.
 * It overrides the <code>sound</code> method to provide a sheep-specific sound.
 */
class Sheep extends Animal {

    /**
     * Constructor for the Sheep class.
     * Prints a message indicating a sheep is created.
     */
    public Sheep() {
        System.out.println("I am a sheep");
    }

    /**
     * Method to print the sound a sheep makes.
     */
    @Override
    public void sound() {
        System.out.println("Sheep says baah");
    }
}

/**
 * The Duck class represents a duck and extends the Animal class.
 * It overrides the <code>sound</code> method to provide a duck-specific sound.
 */
class Duck extends Animal {

    /**
     * Constructor for the Duck class.
     * Prints a message indicating a duck is created.
     */
    public Duck() {
        System.out.println("I am a duck");
    }

    /**
     * Method to print the sound a duck makes.
     */
    @Override
    public void sound() {
        System.out.println("Duck says quack");
    }
}

/**
 * The Cow class represents a cow and extends the Animal class.
 * It overrides the <code>sound</code> method to provide a cow-specific sound.
 */
class Cow extends Animal {

    /**
     * Constructor for the Cow class.
     * Prints a message indicating a cow is created.
     */
    public Cow() {
        System.out.println("I am a cow");
    }

    /**
     * Method to print the sound a cow makes.
     */
    @Override
    public void sound() {
        System.out.println("Cow says moo");
    }
}
