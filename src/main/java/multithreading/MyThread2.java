package multithreading;

public class MyThread2 implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Test stream: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Test stream breaks");
        }
        System.out.println("Test stream complete");
    }
}
