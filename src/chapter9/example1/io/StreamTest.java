package chapter9.example1.io;

import java.io.File;
import java.io.PrintStream;

public class StreamTest {

 
    public static void main(String[] args) {

        try {
            PrintStream e = new PrintStream(new File("print.txt"));
            System.setOut(e);
            System.out.println("Test output");
        } catch (Exception e) {
        }
    }
    
}
