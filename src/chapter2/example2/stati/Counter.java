package chapter2.example2.stati;

public class Counter {
    
    private static int counter;
    
    static {
        counter = 1;
    }
    
    {
        counter ++;
    }
    
    public Counter (){
        counter ++;
    }
    
    public static void printCount(){
        System.out.println("Number: " + counter);
    }

    public static void main(String[] args) {

        Counter c = new Counter();
        Counter.printCount();
        Counter c2 = new Counter();
        Counter.printCount();
    }
    
}
