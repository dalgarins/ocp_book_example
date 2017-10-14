package chapter5.example1.primitiveversion;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveFunction {

    public static void main(String[] args) {

        AtomicInteger atom = new AtomicInteger(0);
        
        Stream.generate(atom::incrementAndGet).limit(10).forEach(System.out::println);
        
        IntStream.generate(atom::incrementAndGet).limit(10).forEach(System.out::println);
        
        
        Function<Integer, Integer> funcInt = Math::abs;
        IntFunction intfunc = Math::abs;
    }
    
}
