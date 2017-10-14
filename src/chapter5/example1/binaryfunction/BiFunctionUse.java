package chapter5.example1.binaryfunction;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BiFunctionUse {

    public static void main(String[] args) {

        //BinaryOperator
        
        BiFunction<String, String, String> bif = (x, y) -> x + y;
        System.out.println(bif.apply("hola", "mundo"));
        
        BiFunction<Double, Double, Integer> biint = Double::compare;
        System.out.println(biint.apply(10.0, 10.0));
    }
    
}
