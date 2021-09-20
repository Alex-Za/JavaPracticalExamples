package annotation;

import java.lang.reflect.Method;

public class Meta {
    @MyAnnotation(str = "Example", val = 100)
    public static void myMeth() {
        Meta meta = new Meta();

        try {
            Class<?> c = meta.getClass();
            Method m = c.getMethod("myMeth");
            MyAnnotation annotation = m.getAnnotation(MyAnnotation.class);

            System.out.println(annotation.str() + " " + annotation.val());

        } catch (NoSuchMethodException exc) {
            System.out.println("Method not found");
        }
    }

    @MyAnnotation(str = "Example", val = 100)
    public static void myMeth2(String str, int i) {
        Meta meta = new Meta();

        try {
            Class<?> c = meta.getClass();
            Method m = c.getMethod("myMeth2", String.class, int.class);
            MyAnnotation annotation = m.getAnnotation(MyAnnotation.class);

            System.out.println(annotation.str() + " " + annotation.val());

        } catch (NoSuchMethodException exc) {
            System.out.println("Method not found");
        }
    }
}
