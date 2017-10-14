package chapter5.example1.functiontest;

import java.util.Arrays;
import java.util.function.Function;

public class FunctionUse {

    public static void main(String[] args) {

        Arrays.stream("4, -5, 16".split(", "))
                .map(Integer::parseInt)
                .map(i -> (i < 0) ? -i : i)
                .forEach(System.out::println);
    
        
        Function<String, Integer> func = str -> str.length();
        System.out.println(func.apply("hello"));
    }
    
}
