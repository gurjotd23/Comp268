package Assignments.Assignment2;
/**
 * title: AnimalTest.java
 * description: Assignment 2, Problem 1 - Create an AnimalTest Class
 * date: May 24, 2024
 * @author Gurjot Singh Dhanda 3691531
 * @version 1.0
 * @copyright 2011- 2024 Gurjot Singh Dhanda
 */
/**
 * The AnimalTest class demonstrates the use of inheritance and polymorphism in Java.
 * It accepts a single command-line argument representing an animal type and outputs the corresponding animal sound.
 */
public class AnimalTest {
    
    /**
     * The main method is the entry point of the program.
     * It checks the command-line arguments and creates an instance of the specified animal class to print the animal's sound.
     *
     * @param args Command-line arguments, where only one animal name is expected.
     */
    public static void main(String[] args) {

        System.out.println();

        // Validate the number of command-line arguments
        if (args.length == 0) {
            System.out.println("One animal name is required!");
            System.exit(1);
        } else if (args.length > 1) {
            System.out.println("Only one animal name can be passed into the parameters!");
            System.exit(1);
        }

        // Convert the input animal name to lowercase for case-insensitive comparison
        String input = args[0].toLowerCase();

        // Switch statement to handle different animal names and print corresponding sounds
        switch (input) {
            case "pig":
                Pig pig = new Pig();
                pig.sound();
                break;
            case "sheep":
                Sheep sheep = new Sheep();
                sheep.sound();
                break;
            case "duck":
                Duck duck = new Duck();
                duck.sound();
                break;
            case "cow":
                Cow cow = new Cow();
                cow.sound();
                break;
            default:
                System.out.println("Invalid input, please try again.");
                System.out.println("Input must be one of pig, sheep, duck, or cow.");
                break;
        }
        
        System.out.println();
    }
}

/**
 * The Animal class represents a generic animal.
 * It serves as a base class for specific animal classes.
 */
class Animal {
    
    /**
     * Constructor for the Animal class.
     * Prints a message indicating that an animal object is created.
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
}

/**
 * The Pig class represents a pig and extends the Animal class.
 * It overrides the sound method to provide a pig-specific sound.
 */
class Pig extends Animal {

    /**
     * Constructor for the Pig class.
     * Prints a message indicating that a pig object is created.
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
 * It overrides the sound method to provide a sheep-specific sound.
 */
class Sheep extends Animal {

    /**
     * Constructor for the Sheep class.
     * Prints a message indicating that a sheep object is created.
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
 * It overrides the sound method to provide a duck-specific sound.
 */
class Duck extends Animal {

    /**
     * Constructor for the Duck class.
     * Prints a message indicating that a duck object is created.
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
 * It overrides the sound method to provide a cow-specific sound.
 */
class Cow extends Animal {

    /**
     * Constructor for the Cow class.
     * Prints a message indicating that a cow object is created.
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