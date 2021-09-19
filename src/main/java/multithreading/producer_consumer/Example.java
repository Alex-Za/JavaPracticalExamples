package multithreading.producer_consumer;

public class Example {
    public void run() {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
        System.out.println("For break press Ctrl+C");
    }
}
