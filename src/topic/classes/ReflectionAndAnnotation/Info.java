package topic.classes.ReflectionAndAnnotation;
import java.lang.annotation.*;
//There is 3 type of policy  SOURCE {the annotation will be seen at only at time of the source code}
//Second one is CLASS {at the time of of byte code not at runtime}
//third RUNTIME {at time of runtime }
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Info {
    String author() default "Unknown";
    String date();
    int version() default 1;
}