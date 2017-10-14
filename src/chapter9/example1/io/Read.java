package chapter9.example1.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Read {


    public static void main(String[] args) throws IOException {

        System.out.println("Type a character: ");
        int val = 0;
        try {
            val = System.in.read();
        } catch (IOException e) {
            System.err.println("Cant read the input: " + e);
            System.exit(-1);
        }
        System.out.println("You typed: " + val);
        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        Scanner scanner = new Scanner(System.in);
        String str2 = scanner.next();
    }
    
}
