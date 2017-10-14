package chapter6.example1.stream.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitionStrings {

    public static void main(String[] args) {

        String[] string = "you never know what you have until you clean your room".split(" ");
        Stream<String> stream = Arrays.stream(string).distinct();
        
        Map<Boolean, List<String>> wordBloks = stream.collect(Collectors.partitioningBy(str -> str.length() > 4));
        
        System.out.println("Short Words length <= 4 " + wordBloks.get(false));
        System.out.println("Long Words length > 4 " + wordBloks.get(true));
        
    }
    
}
