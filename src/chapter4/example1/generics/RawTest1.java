package chapter4.example1.generics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RawTest1 {

    public static void main(String[] args) {

        List list = new LinkedList();
        list.add("first");
        list.add("second");
        
        List<String> list2 = list;
        for(Iterator<String> itemStr = list2.iterator(); itemStr.hasNext();)
            System.out.println("Item " + itemStr.next());
        
        List<String> l = new LinkedList<>();
        l.add("first");
        l.add("second");
        List l2 = l;
        l2.add(10);
        for(Iterator<String> itemStr = l2.iterator(); itemStr.hasNext();)
            System.out.println("Item " + itemStr.next());
    }
    
}
