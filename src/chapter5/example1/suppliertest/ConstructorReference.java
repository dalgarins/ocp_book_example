package chapter5.example1.suppliertest;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReference {

 
    public static void main(String[] args) {

        Supplier<String> cons = String::new;
        System.out.println(cons.get());
    
    
        Supplier<String> newString = () -> new String();
        System.out.println(newString.get());
        
        
        //constructor with arguments
        Function<String, Integer> newInt = Integer::new;
        System.out.println(newInt.apply("9"));
    }
    
}
