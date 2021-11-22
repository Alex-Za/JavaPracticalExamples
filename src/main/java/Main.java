import multithreading.callable.CallableDemo;
import multithreading.count_down_latch.CDLDemo;
import multithreading.cyclic_barrier.CyclicBarrierDemo;
import multithreading.fork_join.ForkJoinDemo;
import multithreading.locker.LockDemo;
import multithreading.phaser.PhaserDemo;

public class Main {
    public static void main(String[] args) {

        ForkJoinDemo forkJoinDemo = new ForkJoinDemo();
        forkJoinDemo.run();

    }
}
