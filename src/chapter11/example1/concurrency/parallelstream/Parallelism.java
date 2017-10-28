package chapter11.example1.concurrency.parallelstream;

import java.util.concurrent.ForkJoinPool;

/**
 *
 * @author dalgarins
 */
public class Parallelism {

    public static void main(String[] args) {

        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "8");
        System.out.println(ForkJoinPool.commonPool().getParallelism());
    }
    
}
