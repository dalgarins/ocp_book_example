package chapter7.example1.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScanInt2 {

    public static void main(String[] args) {

        System.out.println("Type an integer to the console: ");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("You typed the integer value: " + sc.nextInt());
        } catch (InputMismatchException ex) {
            System.out.println("Error: you type some text is not an integer value");
        }
        
    }
    
}
