package chapter6.example1.stream.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortByLength {

    public static void main(String[] args) {

        List words = Arrays.asList("follow your heart but take your brain with you".split(" "));
        Comparator<String> compareLength = (str1, str2) -> str1.length() - str2.length();
        words.stream().distinct().sorted(compareLength).forEach(System.out::println);
    }
    
}
