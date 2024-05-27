public class Shape {
    
    private int area;
    private int circumference;
    private String name;

    public Shape() {
        this.name = "Shape";
        this.circumference = 0;
        this.area = 0;

        System.out.println("A new shape has been made.");
    }

    public int getArea() {
        return area;
    }

    public int getCircumference() {
        return circumference;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if (newName == null) {
            System.out.println("The new name value is null");
        } else {
            this.name = newName;
        }
    }

    public void calculateArea() {
        System.out.println("This method calculates the area of a shape.");
    }

    public void calculateCircumference() {
        System.out.println("This method calculates the circumference/perimeter of a shape.");
    }

    public void boundingBox() {
        System.out.println("This method returns the bounding box of a shape.");
    }

    public void display() {
        System.out.println("Information for this shape:");
        System.out.println("Name: " + getName());
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
        System.out.println("Bounding Box: N/A");
    }

}

class Point {
    
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;

        System.out.println("A point has been created at " + x + ", " + y);
    }

    public int getX() {
        return x;
    }

    public void setX(int newX) {
        this.x = newX;
    }

    public int getY() {
        return y;
    }

    public void setY(int newY) {
        this.y = newY;
    }

    public void show() {
        System.out.println("Point coordinates are " + getX() + ", " + getY());
    }

    public void subtract(int x1, int y1) {
        this.x = this.x - x1;
        this.y = this.y - y1;
    }

    public void add(int x1, int y1) {
        this.x = this.x + x1;
        this.y = this.y + y1;
    }

    public static void main(String[] args) {
        Point p = new Point(5, 4);

        p.show();

        p.add(5, 4);

        p.show();

        p.subtract(5, 4);

        p.show();
    }

}