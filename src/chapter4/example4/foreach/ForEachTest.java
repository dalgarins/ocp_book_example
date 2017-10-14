package chapter4.example4.foreach;

import java.util.Arrays;
import java.util.List;

public class ForEachTest {

    public static void printUpperCaseString(String str){
        System.out.println(str.toUpperCase());
    }

    public static void main(String[] args) {

        List<String> list = Arrays.asList("mimo", "mim", "mi", "m");
        list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println);
        list.forEach(ForEachTest::printUpperCaseString);
    }
    
}
