package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class RepeatedAnnotation {

    @TestRepeatedAnnotation(str = "First annotation", val = -1)
    @TestRepeatedAnnotation(str = "Second annotation", val = -2)
    public static void myMeth(String str, int i) {
        RepeatedAnnotation repeatedAnnotation = new RepeatedAnnotation();

        try {
            Class<?> c = repeatedAnnotation.getClass();
            Method m = c.getMethod("myMeth", String.class, int.class);

            Annotation annotation = m.getAnnotation(MyRepeatedAnnotation.class);
            System.out.println(annotation);
        } catch (NoSuchMethodException exc) {
            System.out.println("Method not found");
        }
    }
}
