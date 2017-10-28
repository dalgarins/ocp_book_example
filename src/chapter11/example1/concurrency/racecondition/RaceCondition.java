package chapter11.example1.concurrency.racecondition;

/**
 *
 * @author dalgarins
 */
class Counter {

    public static long count = 0;
}

class UseCounter implements Runnable {

    public void increment() {
        synchronized (this) {//correccion de race condition
            Counter.count++;
            System.out.println(Counter.count + " ");
        }
    }

    @Override
    public void run() {
        increment();
        increment();
        increment();
    }

}

public class RaceCondition {

    public static void main(String[] args) {

        UseCounter c = new UseCounter();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);
        t1.start();
        t2.start();
        t3.start();
    }

}
