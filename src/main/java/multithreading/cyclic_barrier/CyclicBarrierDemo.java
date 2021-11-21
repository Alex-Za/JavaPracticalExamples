package multithreading.cyclic_barrier;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
    public void run() {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new BarAction());
        System.out.println("Start threads");

        new Thread(new CBThread(cyclicBarrier, "A")).start();
        new Thread(new CBThread(cyclicBarrier, "B")).start();
        new Thread(new CBThread(cyclicBarrier, "C")).start();
    }

}
