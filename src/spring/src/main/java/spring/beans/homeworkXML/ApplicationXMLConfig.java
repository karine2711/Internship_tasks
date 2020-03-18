package spring.beans.homeworkXML;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;





public class ApplicationXMLConfig {

    public static void main(String[] args) {
       ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
       Building hospital= context.getBean("hospital", Building.class);
        System.out.println(hospital.getAddress());



    }


}
