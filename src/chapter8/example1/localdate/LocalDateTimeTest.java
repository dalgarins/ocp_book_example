package chapter8.example1.localdate;

import java.time.LocalDateTime;

public class LocalDateTimeTest {

    public static void main(String[] args) {

        LocalDateTime currDate = LocalDateTime.now();
        System.out.println(currDate);
        
        
        LocalDateTime christmass = LocalDateTime.of(2015, 12, 25, 0, 0);
        LocalDateTime newYear = LocalDateTime.of(2016, 1, 1, 0, 0);
    
        System.out.println("2016 After 2015? " + newYear.isAfter(christmass));
        
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date and time: " + dateTime);
        System.out.println("Date: " + dateTime.toLocalDate());
        System.out.println("Time: " + dateTime.toLocalTime());
    }
    
}
