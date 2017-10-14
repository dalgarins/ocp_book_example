package chapter9.example1.io;

import java.io.Console;

public class Echo {

    public static void main(String[] args) {

        Console console = System.console();
        if (console == null) {
            System.err.println("Cant retreive an object, are execute from IDE?");
            System.exit(-1);
        }
        console.printf(console.readLine());
    }
    
}
