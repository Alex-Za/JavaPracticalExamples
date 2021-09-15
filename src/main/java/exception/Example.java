package exception;

public class Example {
    private void test() {
        NullPointerException e = new NullPointerException("upper level");
        e.initCause(new ArithmeticException("reason"));
        throw e;
    }

    public void run() {
        try {
            test();
        } catch (NullPointerException e) {
            System.out.println("Catched exception: " + e);
            System.out.println("Reason: " + e.getCause());
        }
    }

}
