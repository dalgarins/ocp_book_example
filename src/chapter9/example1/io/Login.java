package chapter9.example1.io;

import java.io.Console;
import java.util.Arrays;

public class Login {

    public static void main(String[] args) {

        Console console = System.console();
        if (console != null) {
            
            String userName = null;
            char[] password = null;
            userName = console.readLine("Ingresa el nombre de usuario: ");
            password = console.readPassword("Ingresa el password: ");
            if ("scrat".equals(userName) && "nuts".equals(new String(password))) {
                console.printf("Login SuccessFul!");
            } else {
                console.printf("wrong username or password");
            }
            Arrays.fill(password, ' ');
        }
    }
    
}
