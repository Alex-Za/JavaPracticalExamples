package multithreading.simple_suspension_threads;

public class SuspendResume {
    public void run() {
        NewThread thread1 = new NewThread("One");
        NewThread thread2 = new NewThread("Two");

        try {
            Thread.sleep(1000);
            thread1.mysuspend();
            System.out.println("Suspense thread One");
            Thread.sleep(1000);
            thread1.myresume();
            System.out.println("Renewal thread One");

            thread2.mysuspend();
            System.out.println("Suspense thread Two");
            Thread.sleep(1000);
            thread2.myresume();
            System.out.println("Renewal thread Two");
        } catch (Exception e) {
            System.out.println("Main thread interrupted");
        }

        try {
            System.out.println("Waiting finishing thread");
            thread1.t.join();
            thread2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread finished");
    }
}
