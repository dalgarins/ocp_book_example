package chapter10.example1.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class Type {

    private static void processFile(String file) {
        try (Stream<String> lines = Files.lines(Paths.get("."))) {
            lines.forEach(System.out::println);
        } catch (IOException ex) {
            System.err.println("IOException ocurring reading the file");
            System.exit(-1);
        }
    }
    
    public static void main(String[] args) {

        if (args.length == 0) {
            System.err.println("pass the name of the file argument");
            System.exit(-1);
        }
        Arrays.stream(args).forEach(Type::processFile);     

    }
    
}
