package chapter6.example1.stream.calculation;

import java.util.IntSummaryStatistics;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class WordStatistics {

    public static void main(String[] args) {

        String limerick = "Habia una vez una joven mujer llamada Bridge "
                + "quien viajo mas rapido que la luz "
                + "ella estuvo afuera un dia "
                + "en un camino relativo "
                + "y regreso la noche anterior";
        
        IntSummaryStatistics wordStatics = Pattern.compile(" ").splitAsStream(limerick)
                .mapToInt(i -> i.length())
                .summaryStatistics();
        
        System.out.printf("Number of words: %d \n Sum of the length of the words: %d \n"
                + "Minimun word Size: %d \n "
                + "Maximun word Size: %d \n "
                + "Average word Size: %f ", wordStatics.getCount(), wordStatics.getSum(), wordStatics.getMin(), wordStatics.getMax(), wordStatics.getAverage());
    
        
        System.out.println("");
        System.out.println("---------------");
        
        
        IntStream.of(10, 20, 30, 40).sum();
        IntStream.of(10, 20 ,30, 40).reduce(0, ((sum, val) -> sum + val));
        
        //factorial of 5
        System.out.println(IntStream.rangeClosed(1, 5).reduce((x, y)-> x * y ).getAsInt());
        
    }
    
}
