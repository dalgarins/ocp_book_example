package chapter5.example1.suppliertest;

import java.time.LocalTime;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class GenerateBooleans {

    public static void main(String[] args) {

        
        Random rdn = new Random();
    
        Stream.generate(rdn::nextBoolean)
                .limit(2)
                .forEach(System.out::println);
        
        Supplier<String> localTime = () -> LocalTime.now().toString();
        System.out.println(localTime.get());
    }
    
}
