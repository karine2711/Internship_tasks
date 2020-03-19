package spring.beans.classwork.customannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPostProcessorTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
        Animal dog = context.getBean(Animal.class);
        System.out.println(dog);
        dog.isMammal();
    }
}
