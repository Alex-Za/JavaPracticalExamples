package multithreading.phaser;

import java.util.concurrent.Phaser;

public class PhaserDemo {
    public void run() {
        Phaser phaser = new Phaser(1);
        int currentPhase;

        System.out.println("Start threads");

        new Thread(new MyThread(phaser, "A")).start();
        new Thread(new MyThread(phaser, "B")).start();
        new Thread(new MyThread(phaser, "C")).start();

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase "+currentPhase+" finished");

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase "+currentPhase+" finished");

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase "+currentPhase+" finished");

        phaser.arriveAndDeregister();

        if (phaser.isTerminated()) {
            System.out.println("Phase synchronizer finished");
        }
    }
}
