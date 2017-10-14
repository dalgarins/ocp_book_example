package chapter10.example1.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathCompare1 {

    public static void main(String[] args) {

        Path path1 = Paths.get("Test");
        Path path2 = Paths.get("D:\\datos_pc\\Certificacion\\Book1\\Test");
        // comparing two paths using compareTo() method
        System.out.println("(path1.compareTo(path2) == 0)"
            + (path1.compareTo(path2) == 0));
        
        // comparing two paths using equals() method
        System.out.println("path1.equals(path2) is: " + path1.equals(path2));
        
        // comparing two paths using equals() method with absolute path
        System.out.println("path2.equals(path1.toAbsolutePath())"
            + path2.equals(path1.toAbsolutePath()));
    }
    
}
