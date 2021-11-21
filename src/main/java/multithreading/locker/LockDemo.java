package multithreading.locker;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    public void run() {
        ReentrantLock lock = new ReentrantLock();

        new Thread(new LockThread("A", lock)).start();
        new Thread(new LockThread("B", lock)).start();
    }
}
