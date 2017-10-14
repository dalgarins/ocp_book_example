package chapter10.example1.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ListFiles {

    public static void main(String[] args) throws IOException {

        try (Stream<Path> entries = Files.list(Paths.get("."))) {
            entries.forEach(System.out::println);
        }
        
        Files.list(Paths.get("."))
                .map(path -> path.toAbsolutePath())
                .forEach(System.out::println);
        
        Files.walk(Paths.get(".")).forEach(System.out::println);
                
    }
    
}
