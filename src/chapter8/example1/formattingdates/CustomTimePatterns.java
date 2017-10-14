package chapter8.example1.formattingdates;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class CustomTimePatterns {

    public static void main(String[] args) {

        String[] dateTimeFormats = {
            "h:mm",
            "hh 'o''clock'",
            "H:mm a",
            "hh:mm:ss:SS",
            "K:mm:ss a"
        };
        
        LocalTime now  = LocalTime.now();
        Arrays.asList(dateTimeFormats).stream()
                .forEach(format -> System.out.printf("Pattern %s is %s %n", format, DateTimeFormatter.ofPattern(format).format(now)));
        
    }
    
}
