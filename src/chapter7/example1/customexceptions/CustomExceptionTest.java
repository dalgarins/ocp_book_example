package chapter7.example1.customexceptions;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class CustomExceptionTest {


    public static int readIntFromConsole() {
        Scanner console = new  Scanner(System.in);
        int typedInt = 0;
        try {
            typedInt = console.nextInt();
        } catch (NoSuchElementException nsee) {
            System.out.println("Wrapping the exception");
            throw new InvalidInputException(nsee);
        } catch (Exception e){
            System.out.println("Could not read the integer");
        } 
        return typedInt;
    }
    
    
    public static void main(String[] args) {

        System.out.println("Type an Integer to the console");
        try {
            System.out.println("Type an integer value: " + readIntFromConsole());
        } catch (Exception iee) {
            System.out.println("Invalid input from console");
            System.out.println("caught exception: " + iee);
            System.out.println("original cause: " + iee.getCause());
        }
    }
    
}
