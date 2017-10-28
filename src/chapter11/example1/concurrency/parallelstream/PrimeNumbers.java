package chapter11.example1.concurrency.parallelstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 *
 * @author dalgarins
 */
public class PrimeNumbers {

    private static boolean isPrime(long val) {
        for (long i = 2 ; i<= val /2; i++){
            if ((val % i) == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {

        long numOfPrimes = LongStream.rangeClosed(2, 100_000)
                .parallel()
                .filter(PrimeNumbers::isPrime)
                .count();
        System.out.println(numOfPrimes);
    
        //check is parallel
        System.out.println(IntStream.range(1, 10)
                .filter(i -> i % 2 ==0).isParallel());
        
        List<Integer> ints = Arrays.asList(1,2,3,4,5);
        System.out.println(ints.parallelStream()
                .filter(i -> i % 2 == 0).isParallel());
        
        //convert sequencial to parallel
        System.out.println(ints.parallelStream()
                .filter(i -> i % 2 == 0).sequential()
                .isParallel());
    }
    
}
