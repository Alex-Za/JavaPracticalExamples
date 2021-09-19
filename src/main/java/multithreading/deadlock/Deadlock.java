package multithreading.deadlock;

public class Deadlock implements Runnable {
    A a = new A();
    B b = new B();

    public Deadlock() {
        Thread.currentThread().setName("Main thread");
        Thread t = new Thread(this, "Concurrent thread");
        t.start();
        a.foo(b);
        System.out.println("Back to main thread");
    }

    @Override
    public void run() {
        b.bar(a);
        System.out.println("Back to other thread");
    }

}
