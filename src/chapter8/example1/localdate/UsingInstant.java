package chapter8.example1.localdate;

import java.time.Instant;
import java.time.LocalDateTime;

public class UsingInstant {

    public static void main(String[] args) {

        Instant instant = Instant.now();
        System.out.println("Instant timestamp: " + instant);
        
        System.out.println("Number of Second: " + instant.getEpochSecond());
        
        System.out.println("Number of nanosecond: " + instant.toEpochMilli());
        
        System.out.println("-----------------");
        System.out.println(LocalDateTime.now());
        System.out.println(Instant.now());
        
        
    }
    
}
