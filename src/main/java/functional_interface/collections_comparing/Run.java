package functional_interface.collections_comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Run {
    public void run() {
        List<MyClass> al = new ArrayList<>();
        al.add(new MyClass(8));
        al.add(new MyClass(2));
        al.add(new MyClass(3));
        al.add(new MyClass(6));
        al.add(new MyClass(3));
        al.add(new MyClass(4));
        al.add(new MyClass(1));

        MyClass maxValueObj = Collections.max(al, UseMethodRef::compareMC);

        System.out.println("Max value = " + maxValueObj.getVal());
    }
}
