package chapter5.example1.unaryoperator;

import java.util.Arrays;
import java.util.List;

public class UnaryUse {

    public static void main(String[] args) {

        List<Integer> all = Arrays.asList(11, 22, -33, -55);
        System.out.println("Before: " +all);
        all.replaceAll(Math::abs);
        System.out.println("After: " + all);
        
        //IntUnaryOperator
        //LongUnaryOperator
        //DoubleUnaryOperator
    }

}
