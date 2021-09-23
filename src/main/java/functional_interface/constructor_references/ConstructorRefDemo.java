package functional_interface.constructor_references;

public class ConstructorRefDemo {
    private <R, T> R myClassFactory(MyConsInterface<R, T> cons, T v) {
        return cons.func(v);
    }

    public void run() {
        MyConsInterface<MyConsClass<Double>, Double> myClassCons = MyConsClass<Double>::new;

        MyConsClass<Double> mc = myClassFactory(myClassCons, 100.1);

        MyConsInterface<MyConsSimpleClass, String> myClassCons2 = MyConsSimpleClass::new;

        MyConsSimpleClass mc2 = myClassFactory(myClassCons2, "lambda");
    }
}
