package chapter11.example1.concurrency;

/**
 *
 * @author darwin.algarin
 */
public class RunnableImpl implements Runnable {

    public static void main(String[] args) {
        
        Thread runnable = new Thread(new RunnableImpl());
        runnable.start();
        System.out.println("In main; the thread name is: " + Thread.currentThread().getName());
    }

    @Override
    public void run() {

        System.out.println("In run(); thread name is: " + Thread.currentThread().getName());
    }
    
}
