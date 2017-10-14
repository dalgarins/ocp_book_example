package chapter8.example1.formattingdates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class UsingFormatting {

    public static void main(String[] args) {

        LocalTime wakeUpTime = LocalTime.of(6, 0);
        System.out.println("Wake up: " + DateTimeFormatter.ISO_TIME.format(wakeUpTime));
        
        DateTimeFormatter customFormat = DateTimeFormatter.ofPattern("dd MMM yyyy");
        System.out.println(customFormat.format(LocalDate.of(2018, Month.MARCH, 15)));
        
    }
    
}
