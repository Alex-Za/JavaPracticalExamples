package multithreading.semaphore;

import java.util.concurrent.Semaphore;

public class IncThread implements Runnable {
    String name;
    Semaphore semaphore;
    Thread t;

    public IncThread(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
        t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run() {
        System.out.println("Run thread " + name);

        try {
            System.out.println("Thread " + name + " waiting for permission");
            semaphore.acquire();
            System.out.println("Thread " + name + " gets permission");
            for (int i = 0; i < 5; i++) {
                Shared.count++;
                System.out.println(name + ": " + Shared.count);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Thread" + name + " Releases permission");
        semaphore.release();
    }
}
