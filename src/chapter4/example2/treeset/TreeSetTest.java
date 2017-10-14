package chapter4.example2.treeset;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {

        String pangram = "the quick dog";
        Set<Character> tree = new TreeSet<Character>();
        for (char gram: pangram.toCharArray()){
            tree.add(gram);
        }
        System.out.println("Sorted id: " + tree);
    }
    
}
