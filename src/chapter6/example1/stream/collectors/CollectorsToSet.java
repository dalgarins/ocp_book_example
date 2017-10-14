package chapter6.example1.stream.collectors;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsToSet {

    public static void main(String[] args) {

        String[] rose = "rose is a rose is a rose is a rose".split(" ");
        Set rosSet = Arrays.stream(rose).collect(Collectors.toSet());
        
        rosSet.forEach(System.out::println);
    }
    
}
