package chapter11.example1.concurrency;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author darwin.algarin
 */
public class MyThread extends Thread {

    @Override
    public void run() {

        try {
            sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("In run(); the thread name is " + getName());
    }

    

    public static void main(String[] args) {

        Thread thread = new MyThread();
        thread.start();
        
        System.out.println("In main; thread name: " + Thread.currentThread().getName());
    }
    
}
