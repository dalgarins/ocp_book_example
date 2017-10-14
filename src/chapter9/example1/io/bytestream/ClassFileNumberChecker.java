package chapter9.example1.io.bytestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class ClassFileNumberChecker {

    public static void main(String[] args) {

        if (args.length != 1) {
            
            System.err.println("Pass a valid filename as argument");
            System.exit(-1);
        }
        
        String filename = args[0];
        
        byte[] magicNumber = {(byte)0xCA, (byte)0xFE, (byte)0xBA, (byte)0xBE};
        
        try (FileInputStream fis = new FileInputStream(new File(filename));) {
            
            byte[] u4buffer = new byte[4];
            if (fis.read(u4buffer) != -1) {
                if (Arrays.equals(magicNumber, u4buffer)) {
                    System.out.printf("Magic number passed for file %s ", filename);
                }
            }
            
        } catch (FileNotFoundException ex) {

            System.out.println("file does not exist");
        } catch (IOException ex) {
            
            System.out.println("error ocurred while processing a file");
        }
    }
    
}
