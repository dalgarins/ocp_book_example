package chapter5.example1.binaryfunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateUse {

    public static void main(String[] args) {

        BiPredicate<List<Integer>, Integer> bipre = List::contains;
        List alist = Arrays.asList(10, 20 , 30);
        System.out.println(bipre.test(alist, 20));
    }
    
}
