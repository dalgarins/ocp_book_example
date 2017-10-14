package chapter2.example2.hashcode;

import java.util.HashSet;
import java.util.Set;

public class Circle {

    private int xpos, ypos, radius;

    public Circle(int xpos, int ypos, int radius) {
        this.xpos = xpos;
        this.ypos = ypos;
        this.radius = radius;
    }
    
    @Override
    public boolean equals(Object ob){
        if (ob == null) {
            return false;
        }
        if (this == ob) {
            return true;
        }
        if (ob instanceof Circle) {
            Circle that = (Circle) ob;
            if (this.xpos == that.xpos && this.ypos == that.ypos && this.radius == that.radius) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.xpos;
        hash = 89 * hash + this.ypos;
        hash = 89 * hash + this.radius;
        return hash;
    }
    
    public static void main(String[] args) {

        Set<Circle> circleList = new HashSet<>();
        
        circleList.add(new Circle(10, 20, 5));
        System.out.println(circleList.contains(new Circle(10, 20, 5)));
    }
    
}
