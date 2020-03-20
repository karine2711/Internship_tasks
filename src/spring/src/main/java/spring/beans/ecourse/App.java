package spring.beans.ecourse;

import jdk.jfr.EventType;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.format.datetime.joda.DateTimeFormatterFactoryBean;
import spring.beans.ecourse.Lessons123.Client;
import spring.beans.ecourse.Lessons123.ConsoleEventLogger;
import spring.beans.ecourse.Lessons456.Event;
import spring.beans.ecourse.Lessons456.EventLogger;
import spring.beans.ecourse.Lessons789.LoggerType;

import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.function.Supplier;

public class App {
    Client client;
    EventLogger eventLogger;
    Map<LoggerType, EventLogger> loggerMap;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("ecourse/ecourse.xml");
        App app = context.getBean("app", App.class);
        Supplier<Event> event=()->context.getBean("event", Event.class);
        app.logEvent(event.get(),LoggerType.INFO);
        app.logEvent(event.get(),LoggerType.ERROR);
        app.logEvent(event.get(),LoggerType.ERROR);
        app.logEvent(event.get(),LoggerType.INFO);


        context.close();
    }

    private void logEvent(Event event, LoggerType type) {
        EventLogger logger=loggerMap.get(type);
        logger.logEvent(event);
    }

    public App(Client client,  EventLogger logger,Map<LoggerType, EventLogger> loggerMap) {
        this.client = client;
        this.eventLogger = logger;
        this.loggerMap = loggerMap;
    }
}
