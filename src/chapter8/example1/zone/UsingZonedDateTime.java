package chapter8.example1.zone;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class UsingZonedDateTime {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();
        ZoneId zone = ZoneId.systemDefault();
        ZonedDateTime zoned = ZonedDateTime.of(localDate, localTime, zone);
        System.out.println(zoned);
        
        
        LocalDateTime ldt = LocalDateTime.now();
        ZoneId zone2 = ZoneId.systemDefault();
        ZonedDateTime zonedt = ldt.atZone(zone2);
        System.out.println(zonedt);
        
        ZoneId zoned3 = ZoneId.of("America/Bogota");
        LocalDateTime ldt3 = LocalDateTime.now();
        ZonedDateTime zdt3 = ldt3.atZone(zoned3);
        ZoneOffset zoneOffset = zdt3.getOffset();
        System.out.println(zoneOffset);
    
    }
    
}
