package chapter5.example1.primitiveversion;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PrimitivePredicate {

    public static void main(String[] args) {

        IntStream.range(0, 10).filter(i -> i % 2 == 0).forEach(System.out::println);
    
        IntPredicate evenNums = i -> i % 2 == 0;
        
        IntStream.range(0, 10).filter(evenNums).forEach(System.out::println);
        
        
        //IntPredicate
        //LongPredicate
        //DoublePredicate
        
    }
    
}
