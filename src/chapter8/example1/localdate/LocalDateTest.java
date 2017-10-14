package chapter8.example1.localdate;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {


    public static void main(String[] args) {

    
        LocalDate date = LocalDate.now();
        System.out.println(date);
        
        LocalDate date1 = LocalDate.of(2016, 1, 1);
        System.out.println(date1);
        
        LocalDate valentien2 = LocalDate.of(2016, Month.FEBRUARY, 14);
        System.out.println(valentien2);
        
        long visaValidityDays = 180L;
        LocalDate visa = LocalDate.now();
        System.out.println(visa.plusDays(visaValidityDays));
        
        /*LocalDate valentien = LocalDate.of(2016, 14, 2);
        System.out.println(valentien);
        
        ERROR
        */
    }
    
}
