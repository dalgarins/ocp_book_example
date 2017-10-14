package chapter6.example1.stream.findmethods;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class FindFirstUse2 {

    public static void main(String[] args) {

        OptionalDouble temperature = DoubleStream.of(-10.0, -5.4, 6.0, -9.1,-2.0, 2.0)
                .filter(temp -> temp > 0)
                .findFirst();
        
        System.out.println("Find Matching temperature: " + temperature.getAsDouble());
    
    }
    
}
