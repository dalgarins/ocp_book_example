package chapter2.example2;

class Shape{
    public double area(){
        return 0;
    }
}

class Circle extends Shape {
    
    private int radius;
    
    public Circle(int radius){
        this.radius = radius;
    }
    
    @java.lang.Override
    public double area(){
        return Math.PI * radius * radius;
    }    
}

class Square extends Shape {
    
    private int side;
    public Square(int side){
        this.side = side;
    }
    
    public double area(){
        return side * side;
    }
}

public class Example2 {

    public static void main(String[] args) {
        Shape shape1 = new Circle(5);
        System.out.println(shape1.area());
        
        Shape shape2 = new Square(5);
        System.out.println(shape2.area());
    }
    
}
