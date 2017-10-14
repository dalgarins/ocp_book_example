package chapter6.example1.stream.findmethods;

import java.util.stream.IntStream;

public class MatchUse {

    public static void main(String[] args) {

        boolean anyMatch = IntStream.of(-56, -57, -55, -52, -48, -51, -49)
                .anyMatch(temp -> temp > 0);
        System.out.println("Anymatch temp > 0 " + anyMatch);
                
        boolean allMatch = IntStream.of(-56, -57, -55, -52, -48, -51, -49)
                .allMatch(temp -> temp > 0);
        System.out.println("AllMatch temp > 0 " + allMatch);
        
        boolean noneMatch = IntStream.of(-56, -57, -55, -52, -48, -51, -49)
                .noneMatch(temp -> temp > 0);
        System.out.println("NoneMatch temp > 0 " + noneMatch);
                
    }
    
}
