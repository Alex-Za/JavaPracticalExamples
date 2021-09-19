package multithreading;

public class MyThread implements Runnable {
    public Thread t;
    String name;

    public MyThread(String name) {
        this.name = name;
        t = new Thread(this, name);
        System.out.println("Test thread created");
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(name + ": " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " break");
        }
        System.out.println(name + " complete");

    }
}
