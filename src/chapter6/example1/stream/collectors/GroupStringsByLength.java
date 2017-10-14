package chapter6.example1.stream.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupStringsByLength {


    public static void main(String[] args) {

        String[] string = "you never know what you have until you clean your room".split(" ");
        Stream<String> stream = Arrays.stream(string).distinct();
        
        Map<Integer, List<String>> wordGroups = stream.collect(Collectors.groupingBy(String::length));
        
        wordGroups.forEach((count, words) -> {
            System.out.printf("words of length %d %n ", count);
            words.forEach(System.out::println);
        });
              
    }
    
}
