package chapter5.example1.functiontest;

import java.util.Arrays;
import java.util.function.Function;

public class CombineFunctions {

    public static void main(String[] args) {

        Function<String, Integer> funcParse = Integer::parseInt;
        Function<Integer, Integer> funcAbs = Math::abs;
        Function<String, Integer> parseAndAbs = funcParse.andThen(funcAbs);
        
        Function<String, Integer> parseAbsCompose = funcAbs.compose(funcParse);
        
        Arrays.stream("4, -5, 16".split(", "))
                .map(parseAndAbs)
                .forEach(System.out::println);
        
        Arrays.stream("4, -5, 16".split(", "))
                .map(Function.identity())
                .forEach(System.out::println);
    }
    
}
