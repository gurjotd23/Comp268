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
 * 
 * Test Plan:
 * 
 * 1. Test Default Behavior
 *    - Run the main method.
 *    - Expected Output: Demonstrates creation and behavior of Mouse, Gerbil, Hamster, and Guinea Pig.
 *      - Example Output:
 *        "The rodent is a mouse."
 *        "The mouse is eating grains it found around the house."
 *        "The mouse retreats to his burrow in the sideboard to sleep."
 *        "The rodent is moving."
 *        "The rodent is grooming itself."
 *        "The mouse got caught in a mouse trap trying to get a piece of cheese and died."
 *        (Similar output for Gerbil, Hamster, and Guinea Pig)
 *    - Actual Output: Should match the expected output.
 * 
 * 2. Test No Data
 *    - Run the program without command-line arguments.
 *    - Expected Output: Should not be applicable since the main method does not handle command-line arguments in the Rodent class.
 *    - Actual Output: N/A
 * 
 * 3. Test Invalid Data
 *    - Run the program with invalid command-line arguments (not applicable directly to Rodent class but could be useful for a comprehensive test plan).
 *    - Expected Output: Should not be applicable since the main method does not handle command-line arguments in the Rodent class.
 *    - Actual Output: N/A
 */
public class Rodent {
    
    public Rodent() {
        System.out.println("A rodent was brought into existence.");
    }

    public void eat() {
        System.out.println("The rodent is eating.");
    }

    public void sleep() {
        System.out.println("The rodent is sleeping.");
    }

    public void move() {
        System.out.println("The rodent is moving.");
    }

    public void groom() {
        System.out.println("The rodent is grooming itself.");
    }

    public void die() {
        System.out.println("The rodent is dead.");
    }

    public static void main(String[] args) {
        System.out.println();
        
        Mouse mouse = new Mouse();
        mouse.eat();
        mouse.sleep();
        mouse.move();
        mouse.groom();
        mouse.die();
        System.out.println();

        Gerbil gerbil = new Gerbil();
        gerbil.eat();
        gerbil.sleep();
        gerbil.move();
        gerbil.groom();
        gerbil.die();
        System.out.println();

        Hamster hamster = new Hamster();
        hamster.eat();
        hamster.sleep();
        hamster.move();
        hamster.groom();
        hamster.die();
        System.out.println();

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
 * 
 * Test Plan:
 * 
 * 1. Test Mouse Behavior
 *    - Run the program.
 *    - Expected Output:
 *      "The rodent is a mouse."
 *      "The mouse is eating grains it found around the house."
 *      "The mouse retreats to his burrow in the sideboard to sleep."
 *      "The mouse is moving."
 *      "The mouse is grooming itself."
 *      "The mouse got caught in a mouse trap trying to get a piece of cheese and died."
 *    - Actual Output: Should match the expected output.
 * 
 * 2. Test No Data
 *    - Run the program without command-line arguments.
 *    - Expected Output: Not applicable as it does not affect Mouse class directly.
 *    - Actual Output: N/A
 * 
 * 3. Test Invalid Data
 *    - Run the program with invalid command-line arguments (not applicable directly to Mouse class).
 *    - Expected Output: Not applicable.
 *    - Actual Output: N/A
 */
class Mouse extends Rodent {

    public Mouse() {
        System.out.println("The rodent is a mouse.");
    }

    @Override
    public void eat() {
        System.out.println("The mouse is eating grains it found around the house.");
    }

    @Override
    public void sleep() {
        System.out.println("The mouse retreats to his burrow in the sideboard to sleep.");
    }

    @Override
    public void die() {
        System.out.println("The mouse got caught in a mouse trap trying to get a piece of cheese and died.");
    }
}

/**
 * The Gerbil class extends the Rodent class and represents a specific type of rodent.
 * It overrides certain methods to provide behavior specific to a gerbil.
 * 
 * Test Plan:
 * 
 * 1. Test Gerbil Behavior
 *    - Run the program.
 *    - Expected Output:
 *      "The rodent is a gerbil."
 *      "The gerbil is eating apples that dropped from a tree."
 *      "The gerbil goes to his underground burrow in the field to sleep with his group."
 *      "The gerbil is moving."
 *      "The gerbil grooms itself and others in its group."
 *      "A hawk came down and took away the gerbil. The gerbil is dead."
 *    - Actual Output: Should match the expected output.
 * 
 * 2. Test No Data
 *    - Run the program without command-line arguments.
 *    - Expected Output: Not applicable as it does not affect Gerbil class directly.
 *    - Actual Output: N/A
 * 
 * 3. Test Invalid Data
 *    - Run the program with invalid command-line arguments (not applicable directly to Gerbil class).
 *    - Expected Output: Not applicable.
 *    - Actual Output: N/A
 */
class Gerbil extends Rodent {
    
    public Gerbil() {
        System.out.println("The rodent is a gerbil.");
    }

    @Override
    public void eat() {
        System.out.println("The gerbil is eating apples that dropped from a tree.");
    }

    @Override
    public void sleep() {
        System.out.println("The gerbil goes to his underground burrow in the field to sleep with his group.");
    }

    @Override
    public void groom() {
        System.out.println("The gerbil grooms itself and others in its group.");
    }

    @Override
    public void die() {
        System.out.println("A hawk came down and took away the gerbil. The gerbil is dead.");
    }
}

/**
 * The Hamster class extends the Rodent class and represents a specific type of rodent.
 * It overrides certain methods to provide behavior specific to a hamster.
 * 
 * Test Plan:
 * 
 * 1. Test Hamster Behavior
 *    - Run the program.
 *    - Expected Output:
 *      "The rodent is a hamster."
 *      "The hamster eats pellets given to it by its owner."
 *      "The hamster burrows in its crate to sleep alone."
 *      "The hamster is exercising in its hamster wheel."
 *      "The hamster grooms itself at night."
 *    - Actual Output: Should match the expected output.
 * 
 * 2. Test No Data
 *    - Run the program without command-line arguments.
 *    - Expected Output: Not applicable as it does not affect Hamster class directly.
 *    - Actual Output: N/A
 * 
 * 3. Test Invalid Data
 *    - Run the program with invalid command-line arguments (not applicable directly to Hamster class).
 *    - Expected Output: Not applicable.
 *    - Actual Output: N/A
 */
class Hamster extends Rodent {

    public Hamster() {
        System.out.println("The rodent is a hamster.");
    }

    @Override
    public void eat() {
        System.out.println("The hamster eats pellets given to it by its owner.");
    }

    @Override
    public void sleep() {
        System.out.println("The hamster burrows in its crate to sleep alone.");
    }

    @Override
    public void move() {
        System.out.println("The hamster is exercising in its hamster wheel.");
    }

    @Override
    public void groom() {
        System.out.println("The hamster grooms itself at night.");
    }
}

/**
 * The Guinea_Pig class extends the Rodent class and represents a specific type of rodent.
 * It overrides certain methods to provide behavior specific to a guinea pig.
 * 
 * Test Plan:
 * 
 * 1. Test Guinea Pig Behavior
 *    - Run the program.
 *    - Expected Output:
 *      "The rodent is a guinea pig."
 *      "The guinea pig is eating some Timothy grass given to it by its owner."
 *      "The guinea pig sleeps in its cage with its siblings."
 *      "The guinea pig is running around in its owner's wild garden."
 *      "The guinea pig is being spot cleaned by its owner."
 *    - Actual Output: Should match the expected output.
 * 
 * 2. Test No Data
 *    - Run the program without command-line arguments.
 *    - Expected Output: Not applicable as it does not affect Guinea_Pig class directly.
 *    - Actual Output: N/A
 * 
 * 3. Test Invalid Data
 *    - Run the program with invalid command-line arguments (not applicable directly to Guinea_Pig class).
 *    - Expected Output: Not applicable.
 *    - Actual Output: N/A
 */
class Guinea_Pig extends Rodent {
    
    public Guinea_Pig() {
        System.out.println("The rodent is a guinea pig.");
    }

    @Override
    public void eat() {
        System.out.println("The guinea pig is eating some Timothy grass given to it by its owner.");
    }

    @Override
    public void sleep() {
        System.out.println("The guinea pig sleeps in its cage with its siblings.");
    }

    @Override
    public void move() {
        System.out.println("The guinea pig is running around in its owner's wild garden.");
    }

    @Override
    public void groom() {
        System.out.println("The guinea pig is being spot cleaned by its owner.");
    }
}
