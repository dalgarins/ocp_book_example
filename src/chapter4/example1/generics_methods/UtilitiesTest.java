package chapter4.example1.generics_methods;


import java.util.ArrayList;
import java.util.List;

class Utilities {
    
    public static <T> void fill(List<T> list, T val) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, val);
        }
    }
    
}

public class UtilitiesTest {

    public static void main(String[] args) {

        List<Integer> listInt = new ArrayList<>();
        listInt.add(10);
        listInt.add(13);
        
        System.out.println("Original list: " + listInt);
        
        Utilities.fill(listInt, 100);
        
        System.out.println("List After fill(): " + listInt);
        
        
        List<Number> lnum = new ArrayList<>();
        lnum.add(10);
        lnum.add(10f);
        System.out.println(lnum);
        
        //List<Object> lobj = new ArrayList<Integer>();
        List<?> lobj = new ArrayList<Integer>();
        
    }
    
}
