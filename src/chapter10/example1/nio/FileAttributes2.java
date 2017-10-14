package chapter10.example1.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class FileAttributes2 {

    public static void main(String[] args) {

        Path path = Paths.get(args[0]);
        try {
            BasicFileAttributes fileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
            System.out.println("file size: " + fileAttributes.size());
            System.out.println("isDirecotry: " + fileAttributes.isDirectory());
            System.out.println("isRegular: " + fileAttributes.isRegularFile());
            System.out.println("isSymbolicLinks: " + fileAttributes.isSymbolicLink());
            System.out.println("File last accessed time: " + fileAttributes.lastAccessTime());
            System.out.println("File last modified time: " + fileAttributes.lastModifiedTime());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
