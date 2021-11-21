package multithreading.callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
    public void run() {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<Integer> f;
        Future<Double> f2;
        Future<Integer> f3;

        System.out.println("Start");

        f = executorService.submit(new Sum(10));
        f2 = executorService.submit(new Hypot(3, 4));
        f3 = executorService.submit(new Factorial(5));

        try {
            System.out.println(f.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
