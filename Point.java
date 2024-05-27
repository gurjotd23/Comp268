public class Point {
    
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