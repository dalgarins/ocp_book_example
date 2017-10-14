package chapter3.example2.interfaces;

abstract class Shape {
    
    abstract double area();
    
    private Shape parentShape;
    
    public void setParentShape(Shape shape){
        this.parentShape = shape;
    }
    
    public Shape getParentShape(){
        return this.parentShape;
    }    
}

interface Rollable {
    void roll(float degree);
}

abstract class CircularShape extends Shape implements Rollable {};

public class Circle extends CircularShape {

    private int xPos, yPos, radius;

    public Circle(int xPos, int yPos, int radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
    }
    
    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void roll(float degree) {
        System.out.printf("Rolling circle by degress %f ", degree);
    }
    
    public static void main(String[] args) {

        Circle c = new Circle(5, 10, 12);
        c.roll(10.0f);
    }
}
