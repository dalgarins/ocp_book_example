package chapter9.example1.io.readers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.err.println("Incorrect Syntax, Correct Syntax: Copy SrcFile DstFile");
            System.exit(-1);
        }
        
        String srcFile = args[0];
        String dstFile = args[1];
        
        try  (BufferedReader inputFile = new BufferedReader(new FileReader(srcFile));
                BufferedWriter outputFile = new BufferedWriter(new FileWriter(dstFile));) {
            
            int ch = 0;
            while ((ch = inputFile.read()) > 0) {                
                outputFile.write((char) ch);
            }
            
        } catch (FileNotFoundException ex) {
            
            System.err.println("Can not open file " + ex.getMessage());
        } catch (IOException ex) {
            
            System.err.println("Can not process the file " + ex.getMessage());
        }
        
    }
    
}
