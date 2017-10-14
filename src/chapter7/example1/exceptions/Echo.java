package chapter7.example1.exceptions;

public class Echo {

    public static void main(String[] args) {

        if (args.length == 0) {
            
            System.out.println("Error: no input passed to echo command");
            System.exit(-1);
        } else {
            
            for (String str : args) {
                System.out.print(str + " ");
            }
        }
    }
    
}
