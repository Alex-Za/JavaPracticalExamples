package multithreading.producer_consumer;

public class Q {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Exception of type InterruptedEXception catched");
            }
        }

        System.out.println("Getting: " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Exception of type InterruptedException catched");
            }
        }

        this.n = n;
        valueSet = true;
        System.out.println("Sended: " + n);
        notify();
    }
}
