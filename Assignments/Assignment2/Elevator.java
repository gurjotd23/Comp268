package Assignments.Assignment2;
/**
 * title: Animal.java
 * description: Assignment 2, Problem 3 - Create an Elevator class.
 * date: July 23, 2024
 * @author Gurjot Singh Dhanda 3691531
 * @version 1.0
 * @copyright 2011- 2024 Gurjot Singh Dhanda
 */
/**
 * The Elevator class represents an elevator in a building, capable of moving between floors.
 * It includes functionality to initialize the elevator, move between floors, and simulate the 
 * destruction of the elevator.
 */

/**
 *
 *<H1>Elevator Class</H1>
 *
 *<H3>Purpose and Description</H3>
 *
 *<P>
 * This class models an elevator system within a building. It allows the initialization of
 * an elevator for a building with a specified number of floors, provides methods to move
 * between floors, and includes functionality to simulate the destruction of the elevator.
 *</P>
 *
 *<DL>
 *<DT> Compiling and running instructions</DT>
 *<DT> Assuming Java SDK is installed and properly set up.</DT>
 *<DT> Change to the directory containing the source code.</DT>
 *<DD> Compile:    javac Elevator.java</DD>
 *<DD> Run:        java Elevator</DD>
 *<DD> Document:   javadoc Elevator.java</DD>
 *</DL>
 */

/**
 *
 *<H3>Elevator Class Details</H3>
 *
 *<P>
 * public class Elevator {<BR>
 * This is the main class representing an elevator. It includes attributes for the number of floors
 * in the building and the current floor of the elevator, and methods to interact with these attributes.
 *</P>
 *
 * <H3>Elevator Methods</H3>
 *
 *<P>
 * public Elevator() {<BR>
 * Default constructor for the Elevator class. Initializes an elevator for a 5-storey building, starting
 * on the 1st floor.
 *</P>
 *<P>
 * public Elevator(int N) {<BR>
 * Parameterized constructor for the Elevator class. Initializes an elevator for a building with the specified
 * number of floors, starting on the 1st floor. Throws an IllegalArgumentException if the number of floors is less
 * than 2.
 *</P>
 *<P>
 * public int getStoreys() {<BR>
 * Returns the number of floors in the building.
 *</P>
 *<P>
 * public int getFloor() {<BR>
 * Returns the current floor the elevator is on.
 *</P>
 *<P>
 * public void setFloor(int newFloor) {<BR>
 * Sets the elevator to a new floor, ensuring the new floor is within the valid range. Throws an IllegalArgumentException
 * if the new floor is less than 1 or greater than the number of floors. Provides feedback if the elevator is already
 * on the desired floor.
 *</P>
 *<P>
 * public void finalize() {<BR>
 * Simulates the destruction of the elevator. Moves the elevator to the 1st floor if it's not already there, resets
 * the building and elevator attributes, and prints a message indicating the destruction.
 *</P>
 *<P>
 * public static void main(String[] args) {<BR>
 * Demonstrates the creation and usage of the Elevator class. Includes scenarios for creating an elevator, moving it
 * to different floors, handling invalid operations, and destroying the elevator.
 *</P>
 */

/**
 *
 *<H3>Test Plan</H3>
 *
 *<P>
 * 1. Run the application.
 * EXPECTED:
 *    Console should display the results of each scenario, including creating the elevator, moving to different floors,
 *    handling exceptions, and destroying the elevator.
 * ACTUAL:
 *    Results match the expected output.
 *</P>
 *<P>
 * 2. Good data cases:
 * EXPECTED:
 *    - Elevator is created for a 100-floor building.
 *    - Successfully moves to the 90th floor.
 *    - Handles illegal move attempts (e.g., trying to move to floor 101) with appropriate exceptions.
 *    - Displays the current floor correctly.
 * ACTUAL:
 *    Results match the expected behavior.
 *</P>
 *<P>
 * 3. Bad data cases:
 * EXPECTED:
 *    - IllegalArgumentException is thrown for invalid floor numbers (e.g., floor less than 1 or greater than the number of floors).
 * ACTUAL:
 *    Results match the expected behavior, with appropriate exception messages printed for invalid floor values.
 *</P>
 */

/**
 * Java core packages
 */
import java.util.*;

/**
 * The Elevator class represents an elevator in a building, capable of moving between floors.
 */
public class Elevator {
    private int N;               // The number of floors in the building
    private int current_floor;   // The current floor the elevator is on

    /**
     * Default constructor for the Elevator class.
     * Initializes an elevator for a 5-storey building, starting on the 1st floor.
     */
    public Elevator() {
        this.N = 5;
        this.current_floor = 1;
        System.out.println("Elevator was installed for the " + N + "-storey building. Currently on the 1st floor.");
    }

    /**
     * Parameterized constructor for the Elevator class.
     * Initializes an elevator for a building with the specified number of floors, starting on the 1st floor.
     *
     * @param N the number of floors in the building
     * @throws IllegalArgumentException if the building has less than 2 floors
     */
    public Elevator(int N) {
        if (N < 2) {
            // Check if the number of floors is valid
            throw new IllegalArgumentException("Building must have more than 1 floor to need an elevator.");
        } else {
            this.N = N;
        }
        this.current_floor = 1;
        System.out.println("Elevator was installed for the " + N + "-storey building. Currently on the 1st floor.");
    }

    /**
     * Returns the number of floors in the building.
     *
     * @return the number of floors
     */
    public int getStoreys() {
        return N;
    }

    /**
     * Returns the current floor the elevator is on.
     *
     * @return the current floor
     */
    public int getFloor() {
        return current_floor;
    }

    /**
     * Sets the elevator to a new floor.
     * Ensures the new floor is within valid range and provides feedback if the elevator is already on the desired floor.
     *
     * @param newFloor the floor to move the elevator to
     * @throws IllegalArgumentException if the new floor is less than 1 or greater than the number of floors
     */
    public void setFloor(int newFloor) {
        if (newFloor < 1) {
            // Check for invalid lower floor
            throw new IllegalArgumentException("The building does not have a basement.");
        } else if (newFloor > N) {
            // Check for invalid upper floor
            throw new IllegalArgumentException("The floor you want to go to does not exist, the building only has " + N + " floors.");
        } else if (newFloor == current_floor) {
            // Feedback if already on the desired floor
            System.out.println("You are already on floor " + newFloor);
        } else {
            this.current_floor = newFloor;
            System.out.println("Elevator moved to floor number: " + newFloor);
        }
    }

    /**
     * Simulates the destruction of the elevator.
     * Moves the elevator to the 1st floor if it's not already there and resets the building and elevator attributes.
     */
    public void finalize() {
        if(current_floor != 1) {
            // Move elevator to the 1st floor if not already there
            System.out.println("Moving elevator to the first floor.");
            this.setFloor(1);
        }
        System.out.println("Elevator ending: elevator returned to the first floor.");
        
        // Reset the building and elevator attributes
        this.N = 0;
        this.current_floor = 0;

        System.out.println("Building and elevator were destroyed.");
    }

    /**
     * The main method to demonstrate the creation and usage of the Elevator class.
     * Scenarios include creating an elevator, moving it to different floors, and handling invalid operations.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println();
        
        // Scenario 1: Create Elevator with 100 floors
        System.out.println("Scenario 1: Create Elevator with 100 floors");
        Elevator elevator1 = new Elevator(100);
        System.out.println();

        // Scenario 2: Move Elevator to 90th floor
        System.out.println("Scenario 2: Move Elevator to 90th floor");
        elevator1.setFloor(90);
        System.out.println();

        // Scenario 3: Move Elevator to illegal floor
        System.out.println("Scenario 3: Move Elevator to illegal floor");
        try {
            elevator1.setFloor(101);
        } catch (IllegalArgumentException e) {
            System.out.println("Failed to move elevator: " + e.getMessage());
        }
        System.out.println();

        // Scenario 4: Get current floor
        System.out.println("Scenario 4: Get current floor");
        System.out.println("The current floor the elevator is on is: " + elevator1.getFloor());
        System.out.println();

        // Scenario 5: Destroy Elevator
        System.out.println("Scenario 5: Destroy Elevator");
        elevator1.finalize();
        System.out.println();
    }
}
