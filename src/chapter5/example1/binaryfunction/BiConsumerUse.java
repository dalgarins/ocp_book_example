package chapter5.example1.binaryfunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerUse {

    public static void main(String[] args) {

        BiConsumer<List<Integer>, Integer> biconsumer = List::add;
        List lst = new ArrayList();
        biconsumer.accept(lst, 10);
        System.out.println(lst);
    }
    
}
