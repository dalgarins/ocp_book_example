package chapter10.example1.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileMove {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("usage: FileMove <source-path> <destination-path>");
            System.exit(1);
        }
        Path pahtSource = Paths.get(args[0]);
        Path pathDestination = Paths.get(args[1]);
        try {
            Files.move(pahtSource, pathDestination, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Source file moved successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
    
}
