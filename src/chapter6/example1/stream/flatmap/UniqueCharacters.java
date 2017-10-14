package chapter6.example1.stream.flatmap;

import java.util.Arrays;

public class UniqueCharacters {

    public static void main(String[] args) {

        String[] string = "you never know what have until you clean the room".split(" ");
        Arrays.stream(string)
                .flatMap(word -> Arrays.stream(word.split("")))
                .distinct()
                .forEach(System.out::print);
    }
    
}
