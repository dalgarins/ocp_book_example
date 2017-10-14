package chapter2.example2.inmutable;

class Point {
    private int xPos, yPos;

    public Point(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    @Override
    public String toString() {
        return "Point{" + "xPos=" + xPos + ", yPos=" + yPos + '}';
    }
    
    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }
}


public final class Circle {

    private final Point center;
    private final int radius;

    public Circle(int x, int y, int radius) {
        this.center = new Point(x, y);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "center=" + center + ", radius=" + radius + '}';
    }

    public Point getCenter() {
        return new Point(center.getxPos(), center.getyPos());
    }

    public int getRadius() {
        return radius;
    }
    
    public static void main(String[] args) {

        System.out.println(new Circle(5, 10, 2));
    }
    
}
