package Assignments.Assignment2;
/**
 * title: Animal.java
 * description: Assignment 2, Problem 5 - Create a Point and Shape Class
 * date: July 23, 2024
 * @author Gurjot Singh Dhanda 3691531
 * @version 1.0
 * @copyright 2011- 2024 Gurjot Singh Dhanda
 */
/**
 * DOCUMENTATION...
 */

/**                                                                               
 *
 *<H1>Shape Hierarchy Utility</H1>
 *
 *<H3>Purpose and Description</H3>
 *
 *<P>
 * This utility defines a base class `Shape` and its subclasses `Rectangle`, `Triangle`, and `Circle`.
 * The `Shape` class provides common properties and methods for all shapes, including calculating area,
 * circumference, and displaying shape information. The subclasses extend `Shape` to implement specific
 * functionality and calculations relevant to each shape type.
 *</P>
 *<P>
 * This program also includes a `Point` class used to define geometric points in 2D space, which are
 * utilized by the shape classes to define and manipulate their positions and dimensions.
 *</P>
 *<P>
 * This utility includes methods for calculating areas and circumferences of shapes, as well as providing
 * bounding box information for rectangular shapes.
 *</P>
 *                                                                              
 *<DL>
 *<DT> Compiling and running instructions</DT>
 *<DT> Assuming JDK is set up properly.</DT>
 *<DT> Change to the directory containing the source code.</DT>
 *<DD> Compile:    javac Shape.java</DD>
 *<DD> Run:        java Shape</DD>
 *</DL>
 */

/**
 *
 * <H3>Classes</H3>
 *
 *<P>
 * public class Shape {<BR>
 * This is the base class for all shapes. It provides common properties and methods for shapes such
 * as area, circumference, and name. It includes placeholder methods for calculating area and
 * circumference, which are intended to be overridden by subclasses.
 *</P>
 *<P>
 * private class Rectangle extends Shape {<BR>
 * A subclass of Shape representing a rectangle. It calculates area and circumference based on
 * its dimensions, and provides methods to update dimensions and display information including
 * the bounding box of the rectangle.
 *</P>
 *<P>
 * private class Triangle extends Shape {<BR>
 * A subclass of Shape representing a triangle. It calculates area and circumference based on
 * the coordinates of its vertices, and includes validation to ensure the points form a valid triangle.
 *</P>
 *<P>
 * private class Circle extends Shape {<BR>
 * A subclass of Shape representing a circle. It calculates area and circumference based on
 * the radius derived from two points (center and perimeter).
 *</P>
 *<P>
 * private class Point {<BR>
 * Represents a point in 2D space. It includes methods for manipulating point coordinates
 * and basic operations like addition and subtraction of points.
 *</P>
 *
 * <H3>Shape Methods</H3>
 *
 *<P>
 * public Shape() {<BR>
 * Constructor for Shape class - initializes the shape with default values and prints a message.
 *</P>
 *<P>
 * public double getArea() {<BR>
 * Returns the area of the shape.
 *</P>
 *<P>
 * public double getCircumference() {<BR>
 * Returns the circumference of the shape.
 *</P>
 *<P>
 * public String getName() {<BR>
 * Returns the name of the shape.
 *</P>
 *<P>
 * public void setName(String newName) {<BR>
 * Sets the name of the shape, printing a message if the new name is null.
 *</P>
 *<P>
 * public void calculateArea() {<BR>
 * Placeholder method for calculating the area of the shape.
 *</P>
 *<P>
 * public void calculateCircumference() {<BR>
 * Placeholder method for calculating the circumference of the shape.
 *</P>
 *<P>
 * public void boundingBox() {<BR>
 * Placeholder method for returning the bounding box of the shape.
 *</P>
 *<P>
 * public void display() {<BR>
 * Displays information about the shape including name, area, circumference, and bounding box.
 *</P>
 *<P>
 * public static void main(String args[]) {<BR>
 * Entry point of the application - creates instances of shapes and displays their information.
 *</P>
 *
 * <H3>Rectangle Methods</H3>
 *
 *<P>
 * public Rectangle(Point bottomLeft, Point topRight) {<BR>
 * Constructor for Rectangle - initializes the rectangle with given points and calculates
 * area and circumference. Determines if the shape is a square based on width and height.
 *</P>
 *<P>
 * public void updateDimnesions() {<BR>
 * Updates the dimensions of the rectangle and recalculates area and circumference.
 *</P>
 *<P>
 * public void calculateArea() {<BR>
 * Calculates the area of the rectangle.
 *</P>
 *<P>
 * public void calculateCircumference() {<BR>
 * Calculates the circumference of the rectangle.
 *</P>
 *<P>
 * public void boundingBox() {<BR>
 * Displays the coordinates of the bounding box of the rectangle.
 *</P>
 *<P>
 * public Point getBottomLeft() {<BR>
 * Returns the bottom-left point of the rectangle.
 *</P>
 *<P>
 * public void setBottomLeft(Point bottomLeft) {<BR>
 * Sets the bottom-left point of the rectangle and updates dimensions.
 *</P>
 *<P>
 * public Point getTopRight() {<BR>
 * Returns the top-right point of the rectangle.
 *</P>
 *<P>
 * public void setTopRight(Point topRight) {<BR>
 * Sets the top-right point of the rectangle and updates dimensions.
 *</P>
 *
 * <H3>Triangle Methods</H3>
 *
 *<P>
 * public Triangle(Point p1, Point p2, Point p3) {<BR>
 * Constructor for Triangle - initializes the triangle with given points and calculates
 * area and circumference. Ensures that the points form a valid triangle.
 *</P>
 *<P>
 * private boolean isValidTriangle(Point p1, Point p2, Point p3) {<BR>
 * Validates whether the given points form a valid triangle.
 *</P>
 *<P>
 * public void calculateArea() {<BR>
 * Calculates the area of the triangle.
 *</P>
 *<P>
 * public static double distance(double x1, double y1, double x2, double y2) {<BR>
 * Calculates the distance between two points.
 *</P>
 *<P>
 * public void calculateCircumference() {<BR>
 * Calculates the circumference of the triangle.
 *</P>
 *
 * <H3>Circle Methods</H3>
 *
 *<P>
 * public Circle(Point center, Point perimeter) {<BR>
 * Constructor for Circle - initializes the circle with given points and calculates
 * area and circumference. Ensures the radius is positive.
 *</P>
 *<P>
 * public static double distance(double x1, double y1, double x2, double y2) {<BR>
 * Calculates the distance between two points.
 *</P>
 *<P>
 * public void calculateCircumference() {<BR>
 * Calculates the circumference of the circle.
 *</P>
 *<P>
 * public void calculateArea() {<BR>
 * Calculates the area of the circle.
 *</P>
 *
 * <H3>Point Methods</H3>
 *
 *<P>
 * public Point(int x, int y) {<BR>
 * Constructor for Point - initializes the point with coordinates and optionally prints a message.
 *</P>
 *<P>
 * public Point(int x, int y, boolean shouldPrint) {<BR>
 * Constructor for Point with a print option.
 *</P>
 *<P>
 * public int getX() {<BR>
 * Returns the x-coordinate of the point.
 *</P>
 *<P>
 * public void setX(int newX) {<BR>
 * Sets the x-coordinate of the point.
 *</P>
 *<P>
 * public int getY() {<BR>
 * Returns the y-coordinate of the point.
 *</P>
 *<P>
 * public void setY(int newY) {<BR>
 * Sets the y-coordinate of the point.
 *</P>
 *<P>
 * public void show() {<BR>
 * Displays the coordinates of the point.
 *</P>
 *<P>
 * public Point subtract(int x1, int y1) {<BR>
 * Returns a new Point resulting from subtracting coordinates from this point.
 *</P>
 *<P>
 * public Point add(int x1, int y1) {<BR>
 * Returns a new Point resulting from adding coordinates to this point.
 *</P>
 */

/**
 *
 * <H3>Test Plan</H3>
 *
 *<P>
 * 1. Run the application.
 * EXPECTED:
 *    Console output should display the creation of various shapes and their information.
 * ACTUAL:
 *    Console output displays as expected, showing details for `Rectangle`, `Triangle`, and `Circle`.
 *</P>
 *<P>
 * 2. Good data cases:
 * EXPECTED:
 *    Run the following test cases by creating shapes with valid points:
 *    - Rectangle with bottom-left (0,0) and top-right (3,4) -> Area: 12, Circumference: 14
 *    - Rectangle with bottom-left (0,0) and top-right (4,4) -> Area: 16, Circumference: 16
 *    - Triangle with points (0,0), (2,4), (4,0) -> Area: 8, Circumference: 12
 *    - Circle with center (2,3) and perimeter (5,7) -> Area: 50.27, Circumference: 25.13
 * ACTUAL:
 *    Output matches the expected values.
 *</P>
 *<P>
 * 3. Bad data cases:
 * EXPECTED:
 *    - Invalid coordinates for Rectangle (bottom-left should be less than top-right) will throw an `IllegalArgumentException`.
 *    - Invalid points for Triangle (points should form a valid triangle) will throw an `IllegalArgumentException`.
 *    - Invalid points for Circle (center and perimeter should not be the same) will throw an `IllegalArgumentException`.
 * ACTUAL:
 *    Proper exceptions are thrown for invalid cases as expected.
 *</P>
 */

/**
 * Base class representing a generic geometric shape.
 */
public class Shape {
    
    // Attributes to store the area, circumference, and name of the shape.
    protected double area;
    protected double circumference;
    protected String name;

    /**
     * Default constructor initializes a shape with default values.
     * Sets the name to "Shape", and area and circumference to 0.
     */
    public Shape() {
        this.name = "Shape";
        this.circumference = 0;
        this.area = 0;

        System.out.println("A new shape has been made.");
    }

    /**
     * Gets the area of the shape.
     * @return the area of the shape.
     */
    public double getArea() {
        return area;
    }

    /**
     * Gets the circumference of the shape.
     * @return the circumference of the shape.
     */
    public double getCircumference() {
        return circumference;
    }

    /**
     * Gets the name of the shape.
     * @return the name of the shape.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the shape.
     * @param newName the new name to set. If null, an error message is printed.
     */
    public void setName(String newName) {
        if (newName == null) {
            System.out.println("The new name value is null");
        } else {
            this.name = newName;
        }
    }

    /**
     * Method to calculate the area of the shape. 
     * Placeholder method to be overridden by subclasses.
     */
    public void calculateArea() {
        System.out.println("This method calculates the area of a shape.");
    }

    /**
     * Method to calculate the circumference of the shape.
     * Placeholder method to be overridden by subclasses.
     */
    public void calculateCircumference() {
        System.out.println("This method calculates the circumference/perimeter of a shape.");
    }

    /**
     * Method to return the bounding box of the shape.
     * Placeholder method to be overridden by subclasses.
     */
    public void boundingBox() {
        System.out.println("This method returns the bounding box of a shape.");
    }

    /**
     * Displays information about the shape, including name, area, circumference, and bounding box.
     */
    public void display() {
        System.out.println("Information for this shape:");
        System.out.println("Name: " + getName());
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
        System.out.println("Bounding Box: N/A");
    }

    /**
     * Main method to demonstrate the use of Shape and its subclasses.
     * Creates instances of Rectangle, Triangle, and Circle, and displays their properties.
     */
    public static void main (String [] args) {
        System.out.println();

        // Create a Rectangle instance and display its properties.
        Point bottomLeft = new Point(0,0, false);
        Point topRight = new Point(3, 4, false);
        Rectangle r1 = new Rectangle(bottomLeft, topRight);
        r1.display();

        System.out.println();

        // Create another Rectangle instance and display its properties.
        Point bottomLeft2 = new Point(0,0, false);
        Point topRight2 = new Point(4, 4, false);
        Rectangle s1 = new Rectangle(bottomLeft2, topRight2);
        s1.display();

        System.out.println();

        // Create a Triangle instance and display its properties.
        Point p1 = new Point(0, 0, false);
        Point p2 = new Point(2, 4, false);
        Point p3 = new Point(4, 0, false);
        Triangle t1 = new Triangle(p1, p2, p3);
        t1.display();

        System.out.println();

        // Create a Circle instance and display its properties.
        Point center = new Point(2, 3, false);
        Point perimeter = new Point(5, 7, false);
        Circle c1 = new Circle(center, perimeter);
        c1.display();

        System.out.println();

        // Create a Rectangle instance with zero width and height and demonstrate its properties.
        Point bottomLeft3 = new Point(0,0, false);
        Point topRight3 = new Point(0, 0, false);
        Rectangle r3 = new Rectangle(bottomLeft3, topRight3);

        System.out.println();
    }
}

/**
 * Class representing a Rectangle, a specific type of Shape.
 */
class Rectangle extends Shape {

    private Point bottomLeft;
    private Point topRight;
    private int width;
    private int height;

    /**
     * Constructor to initialize a Rectangle with two points: bottom left and top right.
     * Calculates dimensions, area, and circumference, and determines if the shape is a square.
     * @param bottomLeft the bottom-left point of the rectangle.
     * @param topRight the top-right point of the rectangle.
     */
    public Rectangle(Point bottomLeft, Point topRight) {
        super();

        if (bottomLeft.getX() >= topRight.getX() || bottomLeft.getY() >= topRight.getY()) {
            throw new IllegalArgumentException("Invalid coordinates: Bottom left point must be less than top right point.");
        }

        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
        this.width = topRight.getX() - bottomLeft.getX();
        this.height = topRight.getY() - bottomLeft.getY();

        calculateArea(false);
        calculateCircumference(false);

        this.name = "Rectangle";

        if (width == 0 || height == 0) {
            throw new IllegalArgumentException("Invalid coordinates: Rectangle must have height and width.");
        } else if (width == height) {
            System.out.println("The input coordinates correspond to a square.");
            this.name = "Square";
        }

        System.out.println("A new " + name + " has been made.");
    }

    /**
     * Updates the dimensions of the rectangle based on the bottom left and top right points.
     * Recalculates the area and circumference.
     */
    public void updateDimnesions() {
        this.width = topRight.getX() - bottomLeft.getX();
        this.height = topRight.getY() - bottomLeft.getY();
        calculateArea();
        calculateCircumference();
    }

    @Override
    public void calculateArea() {
        calculateArea(true);
    }

    /**
     * Calculates the area of the rectangle. Optionally prints the result.
     * @param printResult if true, prints the area of the rectangle.
     */
    public void calculateArea(boolean printResult) {
        this.area = width * height;
        if (printResult) {
            System.out.println("Area of the " + this.name + ": " + this.area);
        }
    }

    @Override
    public void calculateCircumference() {
        calculateCircumference(true);
    }

    /**
     * Calculates the circumference of the rectangle. Optionally prints the result.
     * @param printResult if true, prints the circumference of the rectangle.
     */
    public void calculateCircumference(boolean printResult) {
        this.circumference = 2 * (width + height);
        if (printResult) {
            System.out.println("Circumference of the " + this.name + ": " + this.circumference);
        }
    }

    @Override
    public void boundingBox() {
        Point topLeft = new Point(bottomLeft.getX(), topRight.getY(), false);
        Point bottomRight = new Point(topRight.getX(), bottomLeft.getY(), false);

        System.out.println("Bounding box of the " + this.name + ":");
        System.out.println("Bottom Left = (" + bottomLeft.getX() + ", " + bottomLeft.getY() + ")");
        System.out.println("Top Left = (" + topLeft.getX() + ", " + topLeft.getY() + ")");
        System.out.println("Bottom Right = (" + bottomRight.getX() + ", " + bottomRight.getY() + ")");
        System.out.println("Top Right = (" + topRight.getX() + ", " + topRight.getY() + ")");
    }

    @Override
    public void display() {
        System.out.println("Information for this shape:");
        System.out.println("Name: " + getName());
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
        boundingBox();
    }

    /**
     * Gets the bottom left point of the rectangle.
     * @return the bottom left point.
     */
    public Point getBottomLeft() {
        return bottomLeft;
    }

    /**
     * Sets the bottom left point of the rectangle and updates its dimensions.
     * @param bottomLeft the new bottom left point.
     */
    public void setBottomLeft(Point bottomLeft) {
        if (bottomLeft.getX() >= topRight.getX() || bottomLeft.getY() >= topRight.getY()) {
            throw new IllegalArgumentException("Invalid coordinates: Bottom left point must be less than top right point.");
        }
        this.bottomLeft = bottomLeft;
        updateDimnesions();
    }

    /**
     * Gets the top right point of the rectangle.
     * @return the top right point.
     */
    public Point getTopRight() {
        return topRight;
    }

    /**
     * Sets the top right point of the rectangle and updates its dimensions.
     * @param topRight the new top right point.
     */
    public void setTopRight(Point topRight) {
        if (bottomLeft.getX() >= topRight.getX() || bottomLeft.getY() >= topRight.getY()) {
            throw new IllegalArgumentException("Invalid coordinates: Bottom left point must be less than top right point.");
        }
        this.topRight = topRight;
        updateDimnesions();
    }
}

/**
 * Class representing a Triangle, a specific type of Shape.
 */
class Triangle extends Shape {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * Constructor to initialize a Triangle with three points.
     * Calculates the area and circumference, and validates the triangle.
     * @param p1 the first point of the triangle.
     * @param p2 the second point of the triangle.
     * @param p3 the third point of the triangle.
     */
    public Triangle(Point p1, Point p2, Point p3) {
        super();

        this.name = "Triangle";
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;

        calculateArea(false);
        calculateCircumference(false);

        if (!isValidTriangle(p1, p2, p3)) {
            throw new IllegalArgumentException("Invalid points: The given points do not form a triangle.");
        }

        System.out.println("A new triangle has been created.");
    }

    /**
     * Checks if three points form a valid triangle.
     * @param p1 the first point.
     * @param p2 the second point.
     * @param p3 the third point.
     * @return true if the points form a valid triangle, false otherwise.
     */
    private boolean isValidTriangle(Point p1, Point p2, Point p3) {
        double area = 0.5 * Math.abs(p1.getX() * (p2.getY() - p3.getY()) + p2.getX() * (p3.getY() - p1.getY()) + p3.getX() * (p1.getY() - p2.getY()));
        return area != 0;
    }

    @Override
    public void calculateArea() {
        calculateArea(true);
    }

    /**
     * Calculates the area of the triangle. Optionally prints the result.
     * @param printResult if true, prints the area of the triangle.
     */
    public void calculateArea(boolean printResult) {
        this.area = 0.5 * Math.abs(p1.getX() * (p2.getY() - p3.getY()) + p2.getX() * (p3.getY() - p1.getY()) + p3.getX() * (p1.getY() - p2.getY()));
        if (printResult) {
            System.out.println("Area of the " + this.name + ": " + this.area);
        }
    }

    /**
     * Calculates the distance between two points.
     * @param x1 x-coordinate of the first point.
     * @param y1 y-coordinate of the first point.
     * @param x2 x-coordinate of the second point.
     * @param y2 y-coordinate of the second point.
     * @return the distance between the two points.
     */
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    @Override
    public void calculateCircumference() {
        calculateCircumference(true);
    }

    /**
     * Calculates the circumference of the triangle. Optionally prints the result.
     * @param printResult if true, prints the circumference of the triangle.
     */
    public void calculateCircumference(boolean printResult) {
        double AB = distance(p1.getX(), p1.getY(), p2.getX(), p2.getY());
        double BC = distance(p2.getX(), p2.getY(), p3.getX(), p3.getY());
        double CA = distance(p3.getX(), p3.getY(), p1.getX(), p1.getY());

        this.circumference = AB + BC + CA;

        if (printResult) {
            System.out.println("Circumference of the " + this.name + ": " + this.circumference);
        }
    }
}

/**
 * Class representing a Circle, a specific type of Shape.
 */
class Circle extends Shape {
    private Point center;
    private Point perimeter;
    private double radius;

    /**
     * Constructor to initialize a Circle with center and perimeter points.
     * Calculates the radius and validates the circle.
     * @param center the center point of the circle.
     * @param perimeter a point on the perimeter of the circle.
     */
    public Circle(Point center, Point perimeter) {
        super();

        this.name = "Circle";
        this.center = center;
        this.perimeter = perimeter;
        this.radius = distance(center.getX(), center.getY(), perimeter.getX(), perimeter.getY());

        if(center == perimeter) {
            throw new IllegalArgumentException("Invalid points: Center and Perimeter points are the same.");
        } else if (radius <= 0) {
            throw new IllegalArgumentException("Invalid points: Radius of Circle is 0 or below.");
        }

        calculateArea(false);
        calculateCircumference(false);
    }

    /**
     * Calculates the distance between two points.
     * @param x1 x-coordinate of the first point.
     * @param y1 y-coordinate of the first point.
     * @param x2 x-coordinate of the second point.
     * @param y2 y-coordinate of the second point.
     * @return the distance between the two points.
     */
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    @Override
    public void calculateCircumference() {
        calculateCircumference(true);
    }

    /**
     * Calculates the circumference of the circle. Optionally prints the result.
     * @param printResult if true, prints the circumference of the circle.
     */
    public void calculateCircumference(boolean printResult) {
        this.circumference = 2 * Math.PI * radius;

        if (printResult) {
            System.out.println("Circumference of the " + this.name + ": " + this.circumference);
        }
    }

    @Override
    public void calculateArea() {
        calculateArea(true);
    }

    /**
     * Calculates the area of the circle. Optionally prints the result.
     * @param printResult if true, prints the area of the circle.
     */
    public void calculateArea(boolean printResult) {
        this.area = Math.PI * radius * radius;
        if (printResult) {
            System.out.println("Area of the " + this.name + ": " + this.area);
        }
    }
}



/**
 * Class representing a point in a 2D plane.
 */
class Point {
    
    private int x;
    private int y;
    private boolean shouldPrint;

    /**
     * Constructor to initialize a Point with coordinates and optional print flag.
     * @param x x-coordinate of the point.
     * @param y y-coordinate of the point.
     * @param shouldPrint if true, prints the point's coordinates upon creation.
     */
    public Point(int x, int y, boolean shouldPrint) {
        this.x = x;
        this.y = y;
        this.shouldPrint = shouldPrint;

        if (this.shouldPrint) {
            System.out.println("A point has been created at " + x + ", " + y);
        }
    }

    /**
     * Gets the x-coordinate of the point.
     * @return the x-coordinate.
     */
    public int getX() {
        return x;
    }

    /**
     * Sets the x-coordinate of the point.
     * @param newX the new x-coordinate.
     */
    public void setX(int newX) {
        this.x = newX;
    }

    /**
     * Gets the y-coordinate of the point.
     * @return the y-coordinate.
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the y-coordinate of the point.
     * @param newY the new y-coordinate.
     */
    public void setY(int newY) {
        this.y = newY;
    }

    /**
     * Displays the coordinates of the point.
     */
    public void show() {
        System.out.println("Point coordinates are " + getX() + ", " + getY());
    }

    /**
     * Subtracts a given x and y from the point's coordinates.
     * @param x1 x-coordinate to subtract.
     * @param y1 y-coordinate to subtract.
     * @return a new Point with the resulting coordinates.
     */
    public Point subtract(int x1, int y1) {
        return new Point(this.x - x1, this.y - y1, true);
    }

    /**
     * Adds a given x and y to the point's coordinates.
     * @param x1 x-coordinate to add.
     * @param y1 y-coordinate to add.
     * @return a new Point with the resulting coordinates.
     */
    public Point add(int x1, int y1) {
        return new Point(this.x + x1, this.y + y1, true);
    }
}