package chapter6.example1.stream.collectors;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CollectorsToList {

    public static void main(String[] args) {

        String french = "un:deux:trois:quatre";
        
        List mailList = Pattern.compile(":")
                .splitAsStream(french)
                .collect(Collectors.toList());
        
        mailList.forEach(System.out::println);
        
    }
    
}
