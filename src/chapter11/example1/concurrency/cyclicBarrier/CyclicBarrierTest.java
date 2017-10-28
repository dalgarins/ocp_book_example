package chapter11.example1.concurrency.cyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author dalgarins
 */
class MixedDoubleTennisGame extends Thread {

    public void run() {
        System.out.println("All four players ready, game starts...");
    }
}

class Player extends Thread {
    CyclicBarrier waitPoint;
    public Player(CyclicBarrier barrier, String name) {
        this.setName(name);
        waitPoint = barrier;
        this.start();
    }
    public void run() {
        System.out.println("Player " + getName());
        try {
            waitPoint.await();
        } catch (BrokenBarrierException | InterruptedException e) {
            System.out.println("An exception occured while waiting..." + e);
        }
    }
}

public class CyclicBarrierTest {

    public static void main(String[] args) {
        System.out.println("Reserving tennis count, As soon as four player arrived"
                + " game will start");
        CyclicBarrier barrier = new CyclicBarrier(4, new MixedDoubleTennisGame());
        new Player(barrier, "G I Joe");
        new Player(barrier, "Dora");
        new Player(barrier, "Tintin");
        new Player(barrier, "Barbie");
    }

}
