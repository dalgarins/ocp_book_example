package chapter7.example1.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScanInt3 {

    public static void main(String[] args) {

        String integerStr = "";
        System.out.println("Type an integer to the console: ");
        Scanner sc = new Scanner(integerStr);
        try {
            System.out.println("You typed the integer value: " + sc.nextInt());
        } catch (InputMismatchException ex) {
            System.out.println("Error: you type some text is not an integer value");
        }
        
    }
    
}
