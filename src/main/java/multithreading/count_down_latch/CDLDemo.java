package multithreading.count_down_latch;

import java.util.concurrent.CountDownLatch;

public class CDLDemo {
    public void run() {
        CountDownLatch cdl = new CountDownLatch(5);

        System.out.println("Run thread task");

        new Thread(new CDLThread(cdl)).start();

        try {
            cdl.await();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Finished thread task");
    }
}
