package chapter11.example1.concurrency.executor;

import java.util.concurrent.Executor;

/**
 *
 * @author dalgarins
 */

class Task implements Runnable {
    public void run(){
        System.out.println("Calling Task.run() ");
    }
}

class RepeatedExecutor implements Executor {
    public void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
    public void execute(Runnable runnable, int times) {
        System.out.printf("Calling Task.run() %d times thro' Executor.execute() %n", times);
        for (int i = 0; i < times; i++) {            
            execute(runnable);
        }        
    }
}


public class ExecutorTest {

    public static void main(String[] args) {
        Runnable runnable = new Task();
        System.out.println("Calling Task.run() by directly creating Thread");
        Thread thread = new Thread(runnable);
        thread.start();
        RepeatedExecutor executor = new RepeatedExecutor();
        executor.execute(runnable, 3);
    }    
}
