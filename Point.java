/**
 * Class representing a point in a 2D plane.
 */
public class Point {
    
    // The x-coordinate of the point
    private int x;
    
    // The y-coordinate of the point
    private int y;

    /**
     * Constructor to initialize a Point with the specified coordinates.
     * @param x the x-coordinate of the point.
     * @param y the y-coordinate of the point.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;

        // Print a message indicating that the point has been created with the given coordinates
        System.out.println("A point has been created at " + x + ", " + y);
    }

    /**
     * Gets the x-coordinate of the point.
     * @return the x-coordinate of the point.
     */
    public int getX() {
        return x;
    }

    /**
     * Sets the x-coordinate of the point to the specified value.
     * @param newX the new x-coordinate value.
     */
    public void setX(int newX) {
        this.x = newX;
    }

    /**
     * Gets the y-coordinate of the point.
     * @return the y-coordinate of the point.
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the y-coordinate of the point to the specified value.
     * @param newY the new y-coordinate value.
     */
    public void setY(int newY) {
        this.y = newY;
    }

    /**
     * Displays the coordinates of the point in the format "Point coordinates are x, y".
     */
    public void show() {
        System.out.println("Point coordinates are " + getX() + ", " + getY());
    }

    /**
     * Subtracts the specified values from the current coordinates of the point.
     * @param x1 the x value to subtract.
     * @param y1 the y value to subtract.
     */
    public void subtract(int x1, int y1) {
        this.x = this.x - x1;
        this.y = this.y - y1;
    }

    /**
     * Adds the specified values to the current coordinates of the point.
     * @param x1 the x value to add.
     * @param y1 the y value to add.
     */
    public void add(int x1, int y1) {
        this.x = this.x + x1;
        this.y = this.y + y1;
    }

    /**
     * Main method to test the Point class.
     * Creates a Point, performs addition and subtraction, and displays the point's coordinates.
     * @param args command-line arguments (not used).
     */
    public static void main(String[] args) {
        Point p = new Point(5, 4);  // Create a new point at (5, 4)

        p.show();  // Display the point's coordinates

        p.add(5, 4);  // Add (5, 4) to the point's coordinates

        p.show();  // Display the updated point's coordinates

        p.subtract(5, 4);  // Subtract (5, 4) from the point's coordinates

        p.show();  // Display the updated point's coordinates
    }
}