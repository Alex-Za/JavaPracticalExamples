package multithreading.fork_join.recursive_task;

import java.util.concurrent.ForkJoinPool;

public class RecurTaskDemo {
    public void run() {
        ForkJoinPool forkJoinPool = new ForkJoinPool();

        double[] nums = new double[5000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) (((i%2) == 0) ? i : -i);
        }

        Sum task = new Sum(nums, 0, nums.length);

        double summation = forkJoinPool.invoke(task);

        System.out.println("Summ "+summation);
    }
}
