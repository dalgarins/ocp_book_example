package chapter7.example1.exceptions;

public class Echo1 {

    public static void main(String[] args) {

        if (args.length == 0) {
            
            throw new IllegalArgumentException("Error: no input passed to echo command");
        } else {
            
            for (String str : args) {
                System.out.print(str + " ");
            }
        }
    }
    
}
