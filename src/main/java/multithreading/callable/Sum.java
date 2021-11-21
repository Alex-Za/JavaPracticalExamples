package multithreading.callable;

import java.util.concurrent.Callable;

public class Sum implements Callable<Integer> {
    int stop;

    public Sum(int stop) {
        this.stop = stop;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= stop ; i++) {
            sum += i;
        }
        return sum;
    }
}
