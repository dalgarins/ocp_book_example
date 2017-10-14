package chapter6.example1.stream.optional;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class OptionalPrimitive {

    public static void selectHigestTemperature(DoubleStream temperatures){
        
        OptionalDouble opt = temperatures.max();
        /*if (opt.isPresent()) {
            System.out.println(opt.getAsDouble());
        }*/
        opt.ifPresent(System.out::println);
        
    }
    
    public static void main(String[] args) {

        selectHigestTemperature(DoubleStream.of(24.5, 4.0, 75.0, 56.2));
    }
    
}
