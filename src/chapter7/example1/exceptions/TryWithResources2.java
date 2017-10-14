package chapter7.example1.exceptions;

import java.util.Scanner;

public class TryWithResources2 {

    public static void main(String[] args) {

        System.out.println("Type an integer in the console");
        try (Scanner console = new Scanner(System.in)) {
            System.out.println("You tiped value: " + console.nextInt());
        } 
    }
    
}
