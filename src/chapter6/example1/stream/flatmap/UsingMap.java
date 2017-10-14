package chapter6.example1.stream.flatmap;

import java.util.Arrays;
import java.util.List;

public class UsingMap {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream()
                .map(i -> i * i)
                .forEach(System.out::println);
        
    }

}
