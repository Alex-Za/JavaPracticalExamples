package functional_interface;

public class Test2 {
    public void run() {
        int num = 10;

        MyFunc lambda = (n) -> {
            int v = num + n;

//            num++; FIXME: variable change not available
//            num = 9;

            return v;
        };

        MyFunc test = this::someMethod;

    }

    private int someMethod(int value) {
        return 2;
    }
}
