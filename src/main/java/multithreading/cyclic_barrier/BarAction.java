package multithreading.cyclic_barrier;

public class BarAction implements Runnable {
    @Override
    public void run() {
        System.out.println("Barrier is reached");
    }
}
