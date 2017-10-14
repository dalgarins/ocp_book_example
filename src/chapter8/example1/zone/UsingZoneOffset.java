package chapter8.example1.zone;

import java.time.ZoneOffset;

public class UsingZoneOffset {


    public static void main(String[] args) {

        ZoneOffset zone = ZoneOffset.ofHours(-5);
        System.out.println(zone);
        
        ZoneOffset zone2 = ZoneOffset.of("-5");
        System.out.println(zone2);
        
    }
    
}
