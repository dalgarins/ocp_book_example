package chapter11.example1.concurrency.parallelstream;

import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.ForkJoinPool;

/**
 *
 * @author dalgarins
 */
public class CorrectStringSplitAndConcatenate {

    public static void main(String[] args) {

        String[] words = "the quick brown fox jumps over the lazy dogs".split(" ");
        Optional<String> originalString = 
                (Arrays.stream(words).parallel().reduce((a, b) -> a + " " + b));
        System.out.println(originalString.get());
        
        Optional<String> opt = Optional.of("hola");
        System.out.println(opt);
        
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(ForkJoinPool.commonPool().getParallelism());

    }
    
}
