package topic.classes.ReflectionAndAnnotation;

@Info(author = "Vikram", date = "2025-07-09", version = 2)//annotation provided custom
public class MyService {

    @Info(date = "2025-07-01")
    public void serve() {
        System.out.println("Service method");
    }

    public void noAnnotationMethod() {
        System.out.println("Nothing here");
    }
}