package chapter8.example1.daylightsaving;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DayLightTest {

    public static void main(String[] args) {

        ZoneId kolkatoZone = ZoneId.of("Asia/Kolkata");
        Duration kolkataDST = kolkatoZone.getRules().getDaylightSavings(Instant.now());
        System.out.printf("kolkata zone id is %s hours %n ", kolkataDST.toHours());
        
        ZoneId auklandZone = ZoneId.of("Pacific/Auckland");
        Duration aucklandDST = auklandZone.getRules().getDaylightSavings(Instant.now());
        System.out.printf("auckland zone id is %s hours %n ", aucklandDST.toHours());
        
    }
    
}
