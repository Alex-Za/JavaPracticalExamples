package multithreading.fork_join.recursive_action;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinDemo {
    public void run() {
        ForkJoinPool forkJoinPool = new ForkJoinPool();

        double[] nums = new double[100000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) i;
        }

        System.out.println("Part of original sequence");

        for (int i = 0; i < 10; i++) {
            System.out.println(nums[i] + " ");
        }
        System.out.println("\n");

        SqrtTransform task = new SqrtTransform(nums, 0, nums.length);

        forkJoinPool.invoke(task);

        for (int i = 0; i < 10; i++) {
            System.out.format("%.4f ", nums[i]);
        }
        System.out.println();

    }
}
