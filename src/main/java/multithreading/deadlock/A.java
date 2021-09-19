package multithreading.deadlock;

public class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();

        System.out.println(name + " insert into method A.foo()");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Class A breaked");
        }
        System.out.println(name + " trying to run method B.last()");
        b.last();
    }

    synchronized void last() {
        System.out.println("In method A.last()");
    }
}
