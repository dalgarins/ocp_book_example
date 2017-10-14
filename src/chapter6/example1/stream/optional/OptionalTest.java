package chapter6.example1.stream.optional;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalTest {

    public static void selectHigestTemperature(Stream<Double> temperatures){
        
        Optional<Double> opt = temperatures.max(Double::compareTo);
        if (opt.isPresent()) {
            System.out.println(opt.get());
        }
    }
    
    public static void main(String[] args) {

        selectHigestTemperature(Stream.of(24.5, 4.0, 75.0, 56.2));
        selectHigestTemperature(Stream.of());
        
        
        Stream.of(24.5, 4.0, 75.0, 56.2)
                .max(Double::compareTo)
                .ifPresent(System.out::println);
        
        //create optional
        Optional<String> opt = Optional.empty();
        
        Optional<String> nonEmpty = Optional.of("abadakadabra");
        System.out.println(nonEmpty.map(String::toUpperCase));
        nonEmpty.map(String::toUpperCase).ifPresent(System.out::println);
        
        //Optional<String> nullStr = Optional.of(null);
        //System.out.println(nullStr);
        
        Optional<String> nullableString = Optional.ofNullable(null);
        System.out.println(nullableString);
    }
    
}
