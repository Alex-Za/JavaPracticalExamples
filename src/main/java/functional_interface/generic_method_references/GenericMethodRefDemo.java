package functional_interface.generic_method_references;


public class GenericMethodRefDemo {
    private <T> int myOp(SomeInterface<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }

    public void run() {
        Integer[] vals = {1,2,3,4,1,2,3};
        String[] strs = {"One", "Two", "Three", "Four"};
        int count;

        count = myOp(MyArrayOps::<Integer>countMatching, vals, 4);
        System.out.println("Array vals contains " + count + " number four");

        count = myOp(MyArrayOps::<String>countMatching, strs, "Two");
        System.out.println("Array strs contains " + count + " number two");
    }
}
