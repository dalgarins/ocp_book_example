package chapter10.example1.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathInfo1 {

    public static void main(String[] args) {

        Path testFilePath = Paths.get("D:\\test\\testfile.txt");
        
        System.out.println("Printing file");
        System.out.println("\t file name: " + testFilePath.getFileName());
        System.out.println("\t root of the path: " + testFilePath.getRoot());
        System.out.println("\t parent of the target: " + testFilePath.getParent());
        
        System.out.println("Printing elements");
        for (Path element : testFilePath) {
            System.out.println("\t paht elements: " + element);
        }
    }    
}
