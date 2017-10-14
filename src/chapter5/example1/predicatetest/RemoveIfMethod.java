package chapter5.example1.predicatetest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfMethod {


    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
    
        //list.removeIf(p -> !p.startsWith("h"));
        list.removeIf(((Predicate<String>) p -> p.startsWith("h")).negate());
        list.forEach(System.out::println);
    }
    
}
