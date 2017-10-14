package chapter3.example2.lambdas;

interface SuffixFunction {
    void call();
}

public class PigLatin {


    public static void main(String[] args) {

        String world = "Hello";
        SuffixFunction suffix = () -> System.out.println(world + "ay");
        //world = "e";
        suffix.call();
    }
    
}
