package chapter8.example1.flytravel.example;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FlightTravelExample {

    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MM yyyy hh.mm a");
        
        ZonedDateTime departure = ZonedDateTime.of(LocalDateTime.of(2016, Month.JANUARY, 1, 6, 0)
                , ZoneId.of("Asia/Singapore"));
        
        System.out.println("Departure: " + dateTimeFormatter.format(departure));
        
        //arrival ten hours in auckland
        ZonedDateTime arrival = departure.withZoneSameInstant(ZoneId.of("Pacific/Auckland")).plusHours(10);
        System.out.println("Arrival: " + dateTimeFormatter.format(arrival));
    }
    
}
