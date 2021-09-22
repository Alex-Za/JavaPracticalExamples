package generic;

public class GenMethDemo {
    public <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) return true;
        }
        return false;
    }

    public void run() {
        Integer nums[] = {1, 2, 3, 4, 5};
        boolean isContains2 = isIn(2, nums);
        boolean isContains7 = isIn(7, nums);

        String[] strings = {"one", "two", "three", "four"};
        boolean isContains2Str = isIn("two", strings);
        boolean isContains7Str = isIn("seven", strings);
    }
}
