package chapter3.example1.inner;

public class Circle {

    
    class Point {
        
        private int xPos;
        private int yPos;
        
        public Point(int xPos, int yPos) {
            this.xPos = xPos;
            this.yPos = yPos;
        }

        @Override
        public String toString() {
            return "Point{" + "xPos=" + xPos + ", yPos=" + yPos + '}';
        }
    }
    
    private Point center;
    private int radius;

    public Circle(int x, int y, int radius) {
        center = this.new Point(x, y);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "center=" + center + ", radius=" + radius + '}';
    }
    
    public static void main(String[] args) {
        
        System.out.println(new Circle(10, 10, 20));   
    }    
}
