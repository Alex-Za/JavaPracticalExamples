package timer_task;

public class LongRunningTask implements Runnable {
    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                System.out.println("Task in progress");
                Thread.sleep(500);
            }
        } catch (InterruptedException ex) {
            System.out.println("Interrupted exception");
        }
    }
}
