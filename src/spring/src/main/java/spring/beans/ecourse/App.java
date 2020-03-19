package spring.beans.ecourse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    Client client;
    ConsoleEventLogger eventLogger;

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("ecourse.xml");
        App app=context.getBean("app", App.class);
        app.logEvent("Some event for 1");
        app.logEvent("Some event for 2");

    }

    private void logEvent(String msg){
        String message=msg.replaceAll(Integer.toString(client.getId()), client.getFullName());
        eventLogger.logEvent(message);
    }

    public App(Client client, ConsoleEventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }
}
