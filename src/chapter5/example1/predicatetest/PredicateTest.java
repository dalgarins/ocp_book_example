package chapter5.example1.predicatetest;

import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {

          Predicate<String> nullCheck = arg -> arg != null;
          Predicate<String> emptyCheck = arg -> arg.length() > 0;
          Predicate<String> nullAndEmptyCheck = nullCheck.and(emptyCheck);
          
          String hello = "Hello";
          System.out.println(nullAndEmptyCheck.test(hello));
          
          String nullStr = null;
          System.out.println(nullAndEmptyCheck.test(nullStr));
    }
    
}
