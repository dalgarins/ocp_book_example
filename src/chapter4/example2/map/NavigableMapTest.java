package chapter4.example2.map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest {

    public static void main(String[] args) {

        NavigableMap<Integer, String> nav = new TreeMap<>();
        
        nav.put(90, "Sofia");
        nav.put(20, "Isabella");
        nav.put(10, "Emma");
        nav.put(50, "Olivia");
        
        System.out.println("Data in the map: " + nav);
        System.out.println("Data descending order: " + nav.descendingMap());
        System.out.println("Whos passed the exam: " + nav.tailMap(40));
        System.out.println("Fail exam: " + nav.headMap(40));
        System.out.println(nav.lowerEntry(40));
        System.out.println(nav.higherEntry(40));
        System.out.println(nav.lastEntry());
        System.out.println("Lowest Score: " + nav.firstEntry());
    }
    
}
