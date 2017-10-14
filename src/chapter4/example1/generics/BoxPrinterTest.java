package chapter4.example1.generics;

class BoxPrinter<T> {
    
    private T val;
    public BoxPrinter(T val){
        this.val = val;
    }
    
    public String toString(){
        return "[" + val + "]";
    }
    
}

public class BoxPrinterTest {

    public static void main(String[] args) {

        BoxPrinter<Integer> b1 = new BoxPrinter<>(10);
        System.out.println(b1);
        BoxPrinter<String> b2 = new BoxPrinter<>("Hola Mundo!");
        System.out.println(b2);
    }
    
}
