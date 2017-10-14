package chapter8.example1.localdate;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class UsingPeriod {

    public static void main(String[] args) {

        LocalDate manufacturingDate = LocalDate.of(2016, Month.JANUARY, 1);
        LocalDate expireDay = LocalDate.of(2018, Month.JULY, 18);
        
        Period expire = Period.between(manufacturingDate, expireDay);
        System.out.printf("Medicine will expire in %d years, %d months, %d days, \n %s", expire.getYears(), expire.getMonths(), expire.getDays(), expire);
        
        System.out.println("");
        System.out.println(Period.of(5, 4, 10));
    }
    
}
