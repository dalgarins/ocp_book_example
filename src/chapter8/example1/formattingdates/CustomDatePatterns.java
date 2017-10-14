package chapter8.example1.formattingdates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class CustomDatePatterns {


    public static void main(String[] args) {

        String[] dateTimeFormats = {
            "dd-MM-yyyy",
            "d '('E')' MMM, YYYY",
            "d '('EE')' MMM, YYYY",
            "d '('EEE')' MMM, YYYY",
            "d '('EEEE')' MMM, YYYY",
            "w'th week of the' YYYY",
            "EEEE, dd'th' MMMM, YYYY"
        };
        
        LocalDateTime now  = LocalDateTime.now();
        Arrays.asList(dateTimeFormats).stream()
                .forEach(format -> System.out.printf("Pattern %s is %s %n", format, DateTimeFormatter.ofPattern(format).format(now)));
        
        
    }
    
}
