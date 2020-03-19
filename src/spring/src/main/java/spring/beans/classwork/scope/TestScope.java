package spring.beans.classwork.scope;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext("spring.beans.classwork");
        

        // for singleton destroy method works
        // for prototype not
        PrototypeClass bean = context.getBean(PrototypeClass.class);
        PrototypeClass bean2 = context.getBean(PrototypeClass.class);

        context.close();

    }
}
