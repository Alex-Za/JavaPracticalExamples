package functional_interface.constructor_references;

public class MyConsClass<T> {
    private T val;

    public MyConsClass(T val) {
        this.val = val;
    }

    public MyConsClass() {
        val = null;
    }

    public T getVal() {
        return val;
    }
}
