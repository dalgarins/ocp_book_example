package chapter11.example1.concurrency.parallelstream;

import java.util.Arrays;

/**
 * This is a wrong use of parallel stream
 * @author dalgarins
 */
class StringConcatenator {
    
    public static String result = "";
    public static void concatStr(String str){
        result = result + " " + str;
    }
}

public class WrongStringSplitAndConcatenate {

    public static void main(String[] args) {

        String[] words = "the quick brown fox jumps over the lazy dogs".split(" ");
        //Arrays.stream(words).forEach(StringConcatenator::concatStr);
        Arrays.stream(words).parallel().forEach(StringConcatenator::concatStr);
        System.out.println(StringConcatenator.result);
    }
    
}
