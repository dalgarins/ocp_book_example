package chapter11.example1.concurrency.copyonwritearraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author dalgarins
 */
public class ModifyingList {

    public static void main(String[] args) {

        List<String> aList = new ArrayList<>();
        aList.add("one");
        aList.add("two");
        aList.add("three");
        
        Iterator listIterator = aList.iterator();
        while (listIterator.hasNext()) {            
            System.out.println(listIterator.next());
            aList.add("four");
        }
    

    }
    
}
