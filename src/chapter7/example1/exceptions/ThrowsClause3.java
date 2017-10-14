package chapter7.example1.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowsClause3 {
    
    public int readIntFromFile() throws FileNotFoundException {
        Scanner console = new Scanner(new File("integer.txt"));
        return console.nextInt();
    }

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Reading an integer from integer.txt");
        
        System.out.println("You Type an integer " + new ThrowsClause3().readIntFromFile());
    }
    
}
