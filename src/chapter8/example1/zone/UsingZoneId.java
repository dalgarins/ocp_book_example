package chapter8.example1.zone;

import java.time.ZoneId;

public class UsingZoneId {

    public static void main(String[] args) {

        System.out.println(ZoneId.systemDefault());
        
        System.out.println("----------");
        System.out.println("Zones Ids: " + ZoneId.getAvailableZoneIds().size());
        ZoneId.getAvailableZoneIds().forEach(System.out::println);
        
        ZoneId zone = ZoneId.of("America/Bogota");
        System.out.println(zone);
    }
    
}
