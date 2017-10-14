package chapter10.example1.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDelete {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("usage: FileDelete <source-path>");
            System.exit(1);            
        }
        Path pathSource = Paths.get(args[0]);
        try {
            Files.delete(pathSource);
            Files.deleteIfExists(pathSource);
            System.out.println("File deleted");
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
    
}
