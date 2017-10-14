package chapter4.example2.arraylist;

import java.util.ArrayList;
import java.util.Iterator;


public class TestIterator {

 
    public static void main(String[] args) {
        
        
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add(i);
        }
        System.out.println("Original: " + array);
        for(Iterator<Integer> iterator = array.iterator(); iterator.hasNext();){
            iterator.next();
            iterator.remove();
        }
        System.out.println("Final :" + array);
    }
    
}
