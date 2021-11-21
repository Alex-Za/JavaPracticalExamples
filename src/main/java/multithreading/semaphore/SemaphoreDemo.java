package multithreading.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    public void run() {
        Semaphore semaphore = new Semaphore(1);

        new IncThread("A", semaphore);
        new DecThread("B", semaphore);
    }
}
