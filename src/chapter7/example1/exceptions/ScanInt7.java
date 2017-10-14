package chapter7.example1.exceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScanInt7 {
    
    static boolean returnFalse() {
        try {
            return true;
        } finally {
            return false;
        }
    }

    public static void main(String[] args) {

        String integerStr = "";
        System.out.println("Type an integer to the console: ");
        
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("You typed the integer value: " + sc.nextInt());
            
        } catch (Exception ex) {
            System.out.println("Error: you type some text is not an integer value");
        } finally {
            System.out.println("Done... Closing the scanner");
            sc.close();
        }
        System.out.println(returnFalse());
    }

}
