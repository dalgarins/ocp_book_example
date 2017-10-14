package chapter4.example2.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class SplQueveTest {

    private Deque<String> splQ = new ArrayDeque<>();
    
    void addInQueve(String str){
        splQ.addLast(str);
    }
    
    void removeFront(){
        splQ.removeFirst();
    }
    
    void removeBack(){
        splQ.removeLast();
    }
    
    void printQueve(){
        System.out.println("Especial queue: " + splQ);
    }
    
    public static void main(String[] args) {

        SplQueveTest spQ = new SplQueveTest();
        
        spQ.addInQueve("Harrison");
        spQ.addInQueve("Lennon");
        spQ.addInQueve("McCartney");
        spQ.addInQueve("Starr");
        
        spQ.printQueve();
        spQ.removeFront();
        spQ.removeBack();
        spQ.printQueve();
        
    }
    
}
