package chapter2.example2;

class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @java.lang.Override
    //@Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Point) {
            Point point2 = (Point)obj;
            if (this.x == point2.x && this.y == point2.y) {
                return true;
            }
        }
        return false;
    }

}

public class Override {

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
