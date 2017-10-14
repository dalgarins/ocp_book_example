package chapter8.example1.zone;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeDifference {

    public static void main(String[] args) {

        ZoneId singapureZone = ZoneId.of("Asia/Singapore");
        ZonedDateTime dateTimeInZingapore = ZonedDateTime
                .of(LocalDateTime.of(2016, Month.FEBRUARY, 1, 6, 0), singapureZone);
        
        ZoneId auklandZone = ZoneId.of("Pacific/Auckland"); 
        ZonedDateTime sameDateTimeInAuckland = dateTimeInZingapore.withZoneSameInstant(auklandZone);
        
        Duration timeDifference = Duration.between(dateTimeInZingapore.toLocalTime(), sameDateTimeInAuckland.toLocalTime());
        
        System.out.printf("Time differnces between %s and %s in %d hours ", singapureZone, auklandZone, timeDifference.toHours());
        
    }
    
}
