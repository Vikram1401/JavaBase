package topic.classes.ReflectionAndAnnotation;
import java.lang.reflect.Method;


//reflection is used to examine the classes,method,fields,interface at runtime and also possible to change the behiviour of class and we can even access private fields and change them
public class AnnotationProcessor {
    public static void main(String[] args) {
        //to get reflection we need to get metadata of  class we can do by 3 method//Class.forName("abc");
        //2) abc.class;
        //3) ABC a=new ABC(); Class abc=a.getClass();
        Class<MyService> cls = MyService.class;


        if (cls.isAnnotationPresent(Info.class)) {
            Info info = cls.getAnnotation(Info.class);
            System.out.println("Class Annotation:");
            System.out.println("Author: " + info.author());
            System.out.println("Date: " + info.date());
            System.out.println("Version: " + info.version());
        }

        for (Method method : cls.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Info.class)) {
                Info info = method.getAnnotation(Info.class);
                System.out.println("Method: " + method.getName());
                System.out.println("Author: " + info.author());
                System.out.println("Date: " + info.date());
                System.out.println("Version: " + info.version());
            }
        }
    }
}