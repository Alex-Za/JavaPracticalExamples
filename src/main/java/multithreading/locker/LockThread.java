package multithreading.locker;

import java.util.concurrent.locks.ReentrantLock;

public class LockThread implements Runnable {
    String name;
    ReentrantLock lock;

    public LockThread(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        System.out.println("Run thread "+name);

        try {
            System.out.println("Thread "+name+" waiting counter lock");
            lock.lock();
            System.out.println("Thread "+name+" blocks counter");
            Shared.count++;
            System.out.println("Thread "+name+" : "+Shared.count);
            System.out.println("Thread "+name+" waiting");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Thread"+name+" unlocks counter");
            lock.unlock();
        }
    }
}
