package chapter10.example1.nio;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathInfo2 {

    public static void main(String[] args) throws IOException {

        Path testFile = Paths.get(".\\Test");
        System.out.println("the file name is: " + testFile.getFileName());
        System.out.println("Its Uri is: " + testFile.toUri());
        System.out.println("Its absolute path is: " + testFile.toAbsolutePath());
        System.out.println("Its Before normalized: " + testFile);
        System.out.println("Its normalized path is: " + testFile.normalize());
        
        Path testPathNormalized = Paths.get(testFile.normalize().toString());
        System.out.println("Its normalized absolute: " + testPathNormalized.toAbsolutePath());
        System.out.println("Its normalized real path: " + testFile.toRealPath(LinkOption.NOFOLLOW_LINKS));
        
        
        Path dirName = Paths.get("D:\\OCPJP\\");
        Path resolvedPath = dirName.resolve("Test");
        System.out.println(resolvedPath);
    }
    
}
