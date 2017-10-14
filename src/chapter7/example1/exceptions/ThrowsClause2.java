package chapter7.example1.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowsClause2 {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Reading an integer from integer.txt");
        Scanner console = new Scanner(new File("integer_.txt"));
        System.out.println("You Type an integer " + console.nextInt());
    }
    
}
