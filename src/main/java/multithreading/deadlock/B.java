package multithreading.deadlock;

public class B {
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " insert into method B.bar()");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Class B breaked");
        }

        System.out.println(name + " trying to run method A.last()");
        a.last();
    }

    synchronized void last() {
        System.out.println("In method A.last()");
    }
}
