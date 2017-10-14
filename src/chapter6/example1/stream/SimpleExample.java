package chapter6.example1.stream;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class SimpleExample {
    
    

    public static void main(String[] args) {

        long count = Stream.of(1,2,3,4,5)
                .peek(i -> System.out.printf("%d ", i))
                .map(i -> i * i)
                .peek(i -> System.out.printf("%d ", i))
                .count();
        
        System.out.printf("%n the stream has %d elements ",count);
        
        System.out.println("--------------");
        
        DoubleStream.of(4.0, 9.5, 5.0)
                .map(Math::sqrt)
                .peek(System.out::println)
                .sum();
    
    }
    
}
