package spring.beans.ecourse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.beans.ecourse.Lessons123.Client;
import spring.beans.ecourse.Lessons123.ConsoleEventLogger;
import spring.beans.ecourse.Lessons456.Event;
import spring.beans.ecourse.Lessons456.EventLogger;

public class App {
    Client client;
    ConsoleEventLogger eventLogger;

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("ecourse/lessons2and3.xml","ecourse/lessons45.xml");
        App app=context.getBean("app", App.class);
        app.logEvent("Some event for 1");
        app.logEvent("Some event for 2");
        EventLogger fileLogger=context.getBean("fileLogger",EventLogger.class);
        Event event=context.getBean("event",Event.class);
        fileLogger.logEvent(event);

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
