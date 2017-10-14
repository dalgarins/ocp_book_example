package chapter6.example1.stream.collectors;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.text.Document;

public class CollectorsToMap {

    public static void main(String[] args) {

        Map<String, Integer> nameLength = Stream.of("Arnold", "Darwin", "Zwatzeneger")
                .collect(Collectors.toMap(name -> name, name -> name.length()));
        
        nameLength.forEach((name, len) -> System.out.printf("%s - %d \n", name, len));
    }
    
}
