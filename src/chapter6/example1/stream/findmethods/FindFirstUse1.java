package chapter6.example1.stream.findmethods;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class FindFirstUse1 {

    public static void main(String[] args) {

        Method[] methods = Stream.class.getMethods();
        Optional<String> methodName = Arrays.stream(methods)
                .map(method -> method.getName())
                .filter(name -> name.endsWith("Match"))
                .peek(System.out::println)
                .sorted()
                .findFirst();
        
        System.out.println("Result: " + methodName.orElse("Not Found"));
                
    }
    
}
