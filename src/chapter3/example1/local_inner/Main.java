package chapter3.example1.local_inner;

abstract class Shape {
    
    Color c = new Color();
    
    public static class Color {
        int m_red, m_blue, m_green;

        public Color() {
            this(0, 0, 0);
        }
        
        public Color(int m_red, int m_blue, int m_green) {
            this.m_red = m_red;
            this.m_blue = m_blue;
            this.m_green = m_green;
        }

        @Override
        public String toString() {
            return "Color{" + "m_red=" + m_red + ", m_blue=" + m_blue + ", m_green=" + m_green + '}';
        }
        
    }    
}

class StatusReporter {
    
    static Shape.Color getDescriptiveColor(final Shape.Color color) {
        
        class DescriptiveColor extends Shape.Color {

            @Override
            public String toString() {
                return "DescriptiveColor: " + color;
            }            
        }     
        return new DescriptiveColor();
    }    
}


public class Main {

    public static void main(String[] args) {

        Shape.Color desciptive = StatusReporter.getDescriptiveColor(new Shape.Color(255, 255, 255));
        System.out.println(desciptive);
    }
    
}
