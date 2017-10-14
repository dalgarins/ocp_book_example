package chapter7.example1.exceptions;

import java.util.Scanner;

public class ScanInt1 {

    public static void main(String[] args) {

        System.out.println("Type an integer to the console: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("You typed the integer value: " + sc.nextInt());
    }
    
}
