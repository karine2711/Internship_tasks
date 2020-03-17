package spring.beans.homeworkAnnotation;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationAnnotationConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("spring.beans.homeworkAnnotation");
        context.refresh();

       Company epam = context.getBean("company",Company.class);
        Employee john=context.getBean(Employee.class,epam);
        System.out.println(john);

    }
}

