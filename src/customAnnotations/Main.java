package customAnnotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Car car=new Car();
       Annotation[] an= car.getClass().getAnnotations();
       for(Method method: Car.class.getDeclaredMethods()){
           if(method.isAnnotationPresent(Timed.class)){
               System.out.println(LocalDateTime.now());
           }
       }
    }
}
