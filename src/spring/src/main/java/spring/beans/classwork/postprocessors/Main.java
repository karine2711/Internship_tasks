package spring.beans.classwork.postprocessors;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext con = new ClassPathXmlApplicationContext("student.xml");
        con.start();
        con.refresh();
        con.close();
    }
}
