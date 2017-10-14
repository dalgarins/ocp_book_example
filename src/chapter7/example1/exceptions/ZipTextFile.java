package chapter7.example1.exceptions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipTextFile {
    
    public static final int CHUNK = 1024;

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Pass the name of the file in the current directory");
            System.exit(-1);
        }
        
        String fileName = args[0];
        //String fileName = "integer.txt";
        String zipFileName = fileName + ".zip";
        
        byte[] buffer = new byte[CHUNK];
        
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(zipFileName));
                FileInputStream fileIn = new FileInputStream(fileName)) {
            
            zipOutputStream.putNextEntry(new ZipEntry(fileName));
            
            int lenRead = 0;
            
            while ((lenRead = fileIn.read(buffer)) > 0) {                
                zipOutputStream.write(buffer, 0, lenRead);
            }
            
        } catch (Exception ex){
            
            for (Throwable e : ex.getSuppressed()){
                System.out.println(e);
            }
            
        }
        
    }
    
}
