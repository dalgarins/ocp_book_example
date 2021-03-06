package chapter11.example1.concurrency.atomicvaribles;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author dalgarins
 */

class Counter {
    public static Integer integer = new Integer(0);
    public static AtomicInteger atomicInteger = new AtomicInteger(0);
}

public class AtomicVariableTest {

    static class Incrementer extends Thread {
        public void run(){
            Counter.integer++;
            Counter.atomicInteger.incrementAndGet();
        }
    }
    
    static class Decrementer extends Thread {
        public void run(){
            Counter.integer--;
            Counter.atomicInteger.decrementAndGet();
        }
    }
    
    public static void main(String[] args) throws InterruptedException {

        Thread incrementerThread[] = new Incrementer[1000];
        Thread decrementerThread[] = new Decrementer[1000];
        for (int i = 0; i < 1000; i++) {
            incrementerThread[i] = new Incrementer();
            decrementerThread[i] = new Decrementer();
            incrementerThread[i].start();
            decrementerThread[i].start();            
        }
        for (int i = 0; i < 1000; i++) {
           incrementerThread[i].join();
           decrementerThread[i].join();             
        }
        System.out.printf("Integer value = %d , Atomic value = %d", Counter.integer, Counter.atomicInteger.get());
    }
    
}
