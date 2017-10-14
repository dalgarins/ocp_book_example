package chapter7.example1.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

interface IntReader {
    
    int readIntFromFile() throws IOException, NoSuchElementException;
}

public class ThrowsClause4 implements IntReader {
    
       
    @Override
    public int readIntFromFile() throws FileNotFoundException {
        Scanner console = new Scanner(new File("integer.txt"));
        return console.nextInt();
    }

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Reading an integer from integer.txt");
        
        System.out.println("You Type an integer " + new ThrowsClause4().readIntFromFile());
    }
    
}
