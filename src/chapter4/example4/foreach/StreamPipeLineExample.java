package chapter4.example4.foreach;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamPipeLineExample {


    public static void main(String[] args) {
        
        Arrays.stream(Object.class.getMethods())
                .map(m -> m.getName())
                .distinct()
                .forEach(System.out::println);
        
        System.out.println("--------------");
        Method[] methods = Object.class.getMethods();
        
        Stream<Method> streamM = Arrays.stream(methods);
        Stream<String> streamN = streamM.map(m -> m.getName());
        Stream<String> unique = streamN.distinct();
        unique.forEach(System.out::println);
    
    }
    
}
