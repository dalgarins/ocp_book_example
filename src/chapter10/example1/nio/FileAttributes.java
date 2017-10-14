package chapter10.example1.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAttributes {

    public static void main(String[] args) {

        Path path = Paths.get(args[0]);
        try {
            Object object = Files.getAttribute(path, "creationTime",
                    LinkOption.NOFOLLOW_LINKS);
            System.out.println("Creation Time: " + object);
            
            object = Files.getAttribute(path, "lastModifiedTime", 
                    LinkOption.NOFOLLOW_LINKS);
            System.out.println("Last modified time: " + object);
            
            object = Files.getAttribute(path, "size", 
                    LinkOption.NOFOLLOW_LINKS);
            System.out.println("Size: " + object);
            
            object = Files.getAttribute(path, "dos:hidden", LinkOption.NOFOLLOW_LINKS);
            System.out.println("isHidden: " + object);
            
            object = Files.getAttribute(path, "isDirectory", LinkOption.NOFOLLOW_LINKS);
            System.out.println("isDirectory: " + object);
            
        } catch (IOException io){
            io.printStackTrace();
        }
    }
    
}
