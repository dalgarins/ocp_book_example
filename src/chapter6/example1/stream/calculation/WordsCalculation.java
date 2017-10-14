package chapter6.example1.stream.calculation;

import java.util.Arrays;
import java.util.Comparator;

public class WordsCalculation {

    public static void main(String[] args) {

        String[] string = "tu nunca sabes lo que tienes hasta que limpies tu cuarto".split(" ");
        System.out.println(Arrays.stream(string).min(String::compareTo).get());//lexicograficamente
        
        
        Comparator<String> comparatorLength = (str1, str2) -> str1.length() - str2.length();
        Arrays.stream(string).min(comparatorLength).ifPresent(System.out::println);
        
    }
    
}
