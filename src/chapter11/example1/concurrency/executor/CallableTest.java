package chapter11.example1.concurrency.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author dalgarins
 */

class Factorial implements Callable<Long> {

    long n;
    public Factorial(long n){
        this.n = n;
    }
    
    @Override
    public Long call() throws Exception {
        if (n <= 0) {
            throw new Exception("for finding factorial, n should be > 0");
        }
        long fact = 1;
        for (long longVal = 1; longVal <= n; longVal++) {
            fact *= longVal;
        }
        return fact;
    }
    
}

public class CallableTest {

    
    public static void main(String[] args) throws Exception {

        long N = 20;
        
        Callable<Long> task = new Factorial(N);
        ExecutorService es  = Executors.newSingleThreadExecutor();
        
        Future<Long> future = es.submit(task);
        System.out.printf("factorial of %d id %d", N, future.get());
        
        es.shutdown();
    }
    
}
