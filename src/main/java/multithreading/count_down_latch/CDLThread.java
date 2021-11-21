package multithreading.count_down_latch;

import java.util.concurrent.CountDownLatch;

public class CDLThread implements Runnable {
    CountDownLatch latch;

    public CDLThread(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            latch.countDown();
        }
    }
}
