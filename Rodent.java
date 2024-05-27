/**
 * title: Book.java
 * description: Assignment 2, Problem 4 - Create an Rodent Class
 * date: May 25, 2024
 * @author Gurjot Singh Dhanda 3691531
 * @version 1.0
 */
/**
 * The Rodent class represents a generic rodent with basic behaviors such as eating, sleeping,
 * moving, grooming, and dying. It serves as a base class for specific types of rodents.
 */
public class Rodent {
    
    /**
     * Constructor for the Rodent class.
     * Prints a message indicating that a rodent has been created.
     */
    public Rodent() {
        System.out.println("A rodent was brought into existence.");
    }

    /**
     * Method to simulate the rodent eating.
     * Prints a message indicating that the rodent is eating.
     */
    public void eat() {
        System.out.println("The rodent is eating.");
    }

    /**
     * Method to simulate the rodent sleeping.
     * Prints a message indicating that the rodent is sleeping.
     */
    public void sleep() {
        System.out.println("The rodent is sleeping.");
    }

    /**
     * Method to simulate the rodent moving.
     * Prints a message indicating that the rodent is moving.
     */
    public void move() {
        System.out.println("The rodent is moving.");
    }

    /**
     * Method to simulate the rodent grooming itself.
     * Prints a message indicating that the rodent is grooming itself.
     */
    public void groom() {
        System.out.println("The rodent is grooming itself.");
    }

    /**
     * Method to simulate the rodent dying.
     * Prints a message indicating that the rodent is dead.
     */
    public void die() {
        System.out.println("The rodent is dead.");
    }

    /**
     * The main method to demonstrate the creation and usage of various rodent types.
     * It creates instances of Mouse, Gerbil, Hamster, and Guinea_Pig and calls their respective methods.
     *
     */
    public static void main(String[] args) {
        System.out.println();
        
        // Scenario 1: Create and demonstrate a Mouse
        Mouse mouse = new Mouse();
        mouse.eat();
        mouse.sleep();
        mouse.move();
        mouse.groom();
        mouse.die();
        System.out.println();

        // Scenario 2: Create and demonstrate a Gerbil
        Gerbil gerbil = new Gerbil();
        gerbil.eat();
        gerbil.sleep();
        gerbil.move();
        gerbil.groom();
        gerbil.die();
        System.out.println();

        // Scenario 3: Create and demonstrate a Hamster
        Hamster hamster = new Hamster();
        hamster.eat();
        hamster.sleep();
        hamster.move();
        hamster.groom();
        hamster.die();
        System.out.println();

        // Scenario 4: Create and demonstrate a Guinea Pig
        Guinea_Pig guinea_pig = new Guinea_Pig();
        guinea_pig.eat();
        guinea_pig.sleep();
        guinea_pig.move();
        guinea_pig.groom();
        guinea_pig.die();
        System.out.println();
    }
}

/**
 * The Mouse class extends the Rodent class and represents a specific type of rodent.
 * It overrides certain methods to provide behavior specific to a mouse.
 */
class Mouse extends Rodent {

    /**
     * Constructor for the Mouse class.
     * Prints a message indicating that the rodent is a mouse.
     */
    public Mouse() {
        System.out.println("The rodent is a mouse.");
    }

    /**
     * Method to simulate the mouse eating.
     * Prints a message indicating that the mouse is eating grains.
     */
    @Override
    public void eat() {
        System.out.println("The mouse is eating grains it found around the house.");
    }

    /**
     * Method to simulate the mouse sleeping.
     * Prints a message indicating that the mouse is sleeping in its burrow.
     */
    @Override
    public void sleep() {
        System.out.println("The mouse retreats to his burrow in the sideboard to sleep.");
    }

    /**
     * Method to simulate the mouse dying.
     * Prints a message indicating that the mouse got caught in a mouse trap.
     */
    @Override
    public void die() {
        System.out.println("The mouse got caught in a mouse trap trying to get a piece of cheese and died.");
    }
}

/**
 * The Gerbil class extends the Rodent class and represents a specific type of rodent.
 * It overrides certain methods to provide behavior specific to a gerbil.
 */
class Gerbil extends Rodent {
    
    /**
     * Constructor for the Gerbil class.
     * Prints a message indicating that the rodent is a gerbil.
     */
    public Gerbil() {
        System.out.println("The rodent is a gerbil.");
    }

    /**
     * Method to simulate the gerbil eating.
     * Prints a message indicating that the gerbil is eating apples.
     */
    @Override
    public void eat() {
        System.out.println("The gerbil is eating apples that dropped from a tree.");
    }

    /**
     * Method to simulate the gerbil sleeping.
     * Prints a message indicating that the gerbil is sleeping in its burrow.
     */
    @Override
    public void sleep() {
        System.out.println("The gerbil goes to his underground burrow in the field to sleep with his group.");
    }

    /**
     * Method to simulate the gerbil grooming.
     * Prints a message indicating that the gerbil is grooming itself.
     */
    @Override
    public void groom() {
        System.out.println("The gerbil grooms itself and others in its group.");
    }

    /**
     * Method to simulate the gerbil dying.
     * Prints a message indicating that the gerbil was taken by a hawk.
     */
    @Override
    public void die() {
        System.out.println("A hawk came down and took away the gerbil. The gerbil is dead.");
    }
}

/**
 * The Hamster class extends the Rodent class and represents a specific type of rodent.
 * It overrides certain methods to provide behavior specific to a hamster.
 */
class Hamster extends Rodent {

    /**
     * Constructor for the Hamster class.
     * Prints a message indicating that the rodent is a hamster.
     */
    public Hamster() {
        System.out.println("The rodent is a hamster.");
    }

    /**
     * Method to simulate the hamster eating.
     * Prints a message indicating that the hamster is eating pellets.
     */
    @Override
    public void eat() {
        System.out.println("The hamster eats pellets given to it by its owner.");
    }

    /**
     * Method to simulate the hamster sleeping.
     * Prints a message indicating that the hamster is sleeping in its crate.
     */
    @Override
    public void sleep() {
        System.out.println("The hamster burrows in its crate to sleep alone.");
    }

    /**
     * Method to simulate the hamster moving.
     * Prints a message indicating that the hamster is exercising in its wheel.
     */
    @Override
    public void move() {
        System.out.println("The hamster is exercising in its hamster wheel.");
    }

    /**
     * Method to simulate the hamster grooming.
     * Prints a message indicating that the hamster is grooming itself.
     */
    @Override
    public void groom() {
        System.out.println("The hamster grooms itself at night.");
    }
}

/**
 * The Guinea_Pig class extends the Rodent class and represents a specific type of rodent.
 * It overrides certain methods to provide behavior specific to a guinea pig.
 */
class Guinea_Pig extends Rodent {
    
    /**
     * Constructor for the Guinea_Pig class.
     * Prints a message indicating that the rodent is a guinea pig.
     */
    public Guinea_Pig() {
        System.out.println("The rodent is a guinea pig.");
    }

    /**
     * Method to simulate the guinea pig eating.
     * Prints a message indicating that the guinea pig is eating Timothy grass.
     */
    @Override
    public void eat() {
        System.out.println("The guinea pig is eating some Timothy grass given to it by its owner.");
    }

    /**
     * Method to simulate the guinea pig sleeping.
     * Prints a message indicating that the guinea pig is sleeping in its cage.
     */
    @Override
    public void sleep() {
        System.out.println("The guinea pig sleeps in its cage with its siblings.");
    }

    /**
     * Method to simulate the guinea pig moving.
     * Prints a message indicating that the guinea pig is running in the garden.
     */
    @Override
    public void move() {
        System.out.println("The guinea pig is running around in its owner's wild garden.");
    }

    /**
     * Method to simulate the guinea pig grooming.
     * Prints a message indicating that the guinea pig is being spot cleaned.
     */
    @Override
    public void groom() {
        System.out.println("The guinea pig is being spot cleaned by its owner.");
    }
}
