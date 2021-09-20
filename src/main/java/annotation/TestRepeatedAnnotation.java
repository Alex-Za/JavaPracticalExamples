package annotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnotation.class)
public @interface TestRepeatedAnnotation {
    String str() default "Testing";
    int val() default 9000;
}
