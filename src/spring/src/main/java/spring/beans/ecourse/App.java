package spring.beans.ecourse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.format.datetime.joda.DateTimeFormatterFactoryBean;
import spring.beans.ecourse.Lessons123.Client;
import spring.beans.ecourse.Lessons123.ConsoleEventLogger;
import spring.beans.ecourse.Lessons456.Event;
import spring.beans.ecourse.Lessons456.EventLogger;

import java.time.format.DateTimeFormatter;

public class App {
    Client client;
    ConsoleEventLogger eventLogger;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("ecourse/ecourse.xml");
        App app = context.getBean("app", App.class);
        app.logEvent("Some event for 1");
        app.logEvent("Some event for 2");
        EventLogger cacheFileLogger = context.getBean("cacheFileLogger", EventLogger.class);
        Event event = context.getBean("event", Event.class);
        cacheFileLogger.logEvent(event);
        cacheFileLogger.logEvent(context.getBean("event", Event.class));
        cacheFileLogger.logEvent(context.getBean("event", Event.class));
        cacheFileLogger.logEvent(context.getBean("event", Event.class));
        context.close();
    }

    private void logEvent(String msg) {
        String message = msg.replaceAll(Integer.toString(client.getId()), client.getFullName());
        eventLogger.logEvent(message);
    }

    public App(Client client, ConsoleEventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }
}
