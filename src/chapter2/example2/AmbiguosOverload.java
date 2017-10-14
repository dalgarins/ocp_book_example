package chapter2.example2;

public class AmbiguosOverload {

    public static void aMethod(int var1, long var2){
        System.out.println("int, long");
    }
    
    public static void aMethod(long var1, int var2){
        System.out.println("long, int");
    }
    
    
    public static void main(String[] args) {
       
        //aMethod(9, 10);
        
    }
    
}
