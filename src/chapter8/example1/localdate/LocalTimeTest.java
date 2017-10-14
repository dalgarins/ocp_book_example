package chapter8.example1.localdate;

import java.time.LocalTime;

public class LocalTimeTest {

    public static void main(String[] args) {

        LocalTime currTiem = LocalTime.now();
        System.out.println(currTiem);
        
        
        System.out.println(LocalTime.of(18, 30));
        
        
        //meeting
        System.out.println("----------------");
        long hours = 6;
        long minutes = 30;
        LocalTime currTime = LocalTime.now();
        System.out.println(currTime);
        System.out.println(currTime.plusHours(hours).plusMinutes(minutes));
        System.out.println(LocalTime.parse("06"));
    }
    
}
