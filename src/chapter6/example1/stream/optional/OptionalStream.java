package chapter6.example1.stream.optional;

import java.util.Optional;

public class OptionalStream {

    public static void main(String[] args) {

        Optional<String> string = Optional.of("   optional   ");
        string.map(String::trim).ifPresent(System.out::println);
    
        
        Optional<String> strNull = Optional.ofNullable(null);
        System.out.println(strNull.map(String::length).orElse(-1));
        
        
        Optional<String> strThrow = Optional.ofNullable(null);
        System.out.println(strThrow.map(String::length).orElseThrow(IllegalArgumentException::new));
        
    }
    
}
