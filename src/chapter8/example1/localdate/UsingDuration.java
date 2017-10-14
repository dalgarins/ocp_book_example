package chapter8.example1.localdate;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class UsingDuration {


    public static void main(String[] args) {

        LocalDateTime commigMidNight = LocalDateTime.of(LocalDate.now().plusDays(1), LocalTime.MIDNIGHT);
        LocalDateTime currTime = LocalDateTime.now();
        
        Duration duration = Duration.between(currTime, commigMidNight);
        System.out.println(duration);
        
    }
    
}
