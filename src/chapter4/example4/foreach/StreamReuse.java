package chapter4.example4.foreach;

import java.util.stream.IntStream;

public class StreamReuse {


    public static void main(String[] args) {

        IntStream chars = "bookeepers".chars();
        System.out.println(chars.count());
        chars.distinct().sorted().forEach(System.out::println);
    
    }
    
}
