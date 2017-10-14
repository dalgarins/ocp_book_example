package chapter5.example1.consumertest;

import java.util.function.Consumer;
import java.util.stream.Stream;


public class ConsumerUse {


    public static void main(String[] args) {

        Consumer<String> printUpper = str -> System.out.println(str.toUpperCase());
        //printUpper.accept("hola");
    
        
        Stream<String> stream = Stream.of("hola", "mundo");
        stream.forEach(printUpper.andThen(System.out::println));
    }
    
}
