package multithreading.cyclic_barrier;

import java.util.concurrent.CyclicBarrier;

public class CBThread implements Runnable {

    CyclicBarrier cyclicBarrier;
    String name;

    public CBThread(CyclicBarrier cyclicBarrier, String name) {
        this.cyclicBarrier = cyclicBarrier;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name);

        try {
            cyclicBarrier.await();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
