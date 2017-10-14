package chapter6.example1.stream.flatmap;

import java.util.Arrays;
import java.util.List;

public class UsingFlatMap {

    public static void main(String[] args) {

        List<List<Integer>> intsOfInts = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5));
        
        intsOfInts.stream()
                .flatMap(ints -> ints.stream())
                .map(i -> i * i)
                .forEach(System.out::println);
        
        
    }

}
