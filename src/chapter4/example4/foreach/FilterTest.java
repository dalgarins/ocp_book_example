package chapter4.example4.foreach;

import java.util.stream.IntStream;

public class FilterTest {


    public static boolean isEven(int i){
        return i % 2 == 0;
    }
    
    public static void main(String[] args) {
        
        IntStream.rangeClosed(1, 10)
                .filter(FilterTest::isEven)
                .forEach(System.out::println);

        IntStream.rangeClosed(1, 10)
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);
        
        IntStream.rangeClosed(0, 10)
                .map(i -> i * i)
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);
        
        IntStream.rangeClosed(0, 10)                
                .filter(i -> i % 2 == 0)
                .map(i -> i * i)
                .forEach(System.out::println);
    
    }
    
}
