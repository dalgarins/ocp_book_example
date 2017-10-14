package chapter4.example4.foreach;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSourcesTest {

    public static void main(String[] args) throws IOException {

        IntStream.range(1, 6);

        IntStream.iterate(1, i -> i + 1).limit(5);

        Arrays.stream(new int[]{1, 2, 3, 4});
        Arrays.stream(new Integer[]{1, 2, 3, 4});

        Stream.of(1, 2, 3, 4, 5);
        Stream.of(new Integer[]{1, 2, 3, 4});
        
        Stream.builder().add(1).add(2).add(3).build();
        
        "hola".chars().forEach(System.out::println);
        
        "hello".chars().sorted().forEach(ch -> System.out.printf("%c", ch));
        
        System.out.println("");
        Pattern.compile(" ").splitAsStream("java 8 streams").forEach(System.out::println);
        
        new Random().ints().limit(5).forEach(System.out::println);
        //Files.lines(Paths.get("./hola.java")).forEach(System.out::println);
        
        Stream.of(1,2,3,4,5).count();
        Stream.of(1,2,3,4,5).map(i -> i * i).count();
        Stream.of(1,2,3,4,5).map(i -> i * i).peek(System.out::println).count();
        Stream.of(1,2,3,4,5).peek(System.out::println).map(i -> i * i).peek(System.out::println).count();
    }

}
