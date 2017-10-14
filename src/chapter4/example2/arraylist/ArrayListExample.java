package chapter4.example2.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author NoaD
 */
public class ArrayListExample {

    public static void main(String[] args) {
        
        ArrayList<String> languajes = new ArrayList<>();
        languajes.add("C");
        languajes.add("C++");
        languajes.add("Java");
        for (String languaje : languajes) {
            System.out.println(languaje);
        }
        
        
        for(Iterator<String> iter = languajes.iterator(); iter.hasNext();){
            String value = iter.next();
            System.out.println(value);
        }
        
    }
    
}
