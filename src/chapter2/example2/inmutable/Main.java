package chapter2.example2.inmutable;

public class Main {

    public static void main(String[] args) {

        String str = new String("str");
        String str2 = new String("str");
        
        System.out.println(str == str2);
        System.out.println(str.intern() == str2.intern());
    }
    
}
