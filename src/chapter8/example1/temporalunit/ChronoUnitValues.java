package chapter8.example1.temporalunit;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class ChronoUnitValues {

    public static void main(String[] args) {

        System.out.println("ChronoUnit DateBased TimeBased Duration");
        System.out.println("---------------------------------------");
        
        for (ChronoUnit unit : ChronoUnit.values()){
            System.out.printf("%10s \t %b \t\t %b \t\t %s %n", unit, unit.isDateBased(), unit.isTimeBased(), unit.getDuration());
        }
        
        
        System.out.println(Duration.of(1, ChronoUnit.MINUTES).getSeconds());
        System.out.println(Duration.of(2, ChronoUnit.HOURS).getSeconds());
        System.out.println(Duration.of(5, ChronoUnit.DAYS).getSeconds());
        
    }
    
}
