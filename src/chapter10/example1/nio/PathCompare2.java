package chapter10.example1.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathCompare2 {

    public static void main(String[] args) throws IOException {

        Path path1 = Paths.get("Test");
        Path path2 = Paths.get("D:\\datos_pc\\Certificacion\\Book1\\Test");
        
        System.out.println("Files.isSameFile(path1, path2) is: " + Files.isSameFile(path1, path2));
        
    }
    
}
