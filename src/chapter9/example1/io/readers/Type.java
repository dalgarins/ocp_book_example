package chapter9.example1.io.readers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Type {


    public static void main(String[] args) {

        if (args.length == 0) {
            System.err.println("pass the name of the files");
            System.exit(-1);
        }
        
        Arrays.asList(args)
                .stream().forEach(file -> {
                
                    try (FileReader inputFile = new FileReader(file)){
                        
                        int ch = 0;
                        while ((ch = inputFile.read()) > 0) {                            
                            System.out.print((char) ch);
                        }
                        
                    } catch (FileNotFoundException ex){
                        System.err.printf("Can not open the given file %s", file);
                    } catch (IOException ex){
                        System.err.printf("Error when processing the given file %s", file);
                    }
        
                });
    }
    
}
