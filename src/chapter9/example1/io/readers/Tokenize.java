package chapter9.example1.io.readers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tokenize {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.err.println("pass the name of the file to be read as an argument");
            System.exit(-1);
        }
        
        String fileName = args[0];
        
        Set<String> words = new TreeSet<>();
        
        try (Scanner scanner = new Scanner(new FileReader(fileName));){
            
            scanner.useDelimiter("\\W");
            while (scanner.hasNext()) {                
                String word = scanner.next();
                
                if (!"".equals(word)) {
                    words.add(word.toLowerCase());
                }
            }
            
            words.stream().forEach(str -> {
                System.out.print(str + "\t");
            });
        } catch (FileNotFoundException ex) {
            System.err.println("Can not read the input file");
        }
        
    }
    
}
