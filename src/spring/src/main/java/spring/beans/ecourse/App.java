package spring.beans.ecourse;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import spring.beans.ecourse.Lessons123.Client;
import spring.beans.ecourse.Lessons456.Event;
import spring.beans.ecourse.Lessons456.EventLogger;
import spring.beans.ecourse.Lessons789.LoggerType;

import java.util.Map;
import java.util.function.Supplier;

@Component("app")
public class App {
    Client client;
    EventLogger eventLogger;
    Map<LoggerType, EventLogger> loggerMap;

    public static void main(String[] args) {
        //    ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("ecourse/ecourse.xml");
        ConfigurableApplicationContext con = new AnnotationConfigApplicationContext("spring.beans.ecourse");
        // App app = context.getBean("app", App.class);
        App app = con.getBean("app", App.class);
        Client client = con.getBean("client", Client.class);
        Client client1 = con.getBean("client", Client.class);
        Client client2 = con.getBean("client", Client.class);

        Event event = con.getBean("event", Event.class);
        Event event1 = con.getBean("event", Event.class);
        app.eventLogger.logEvent(event);
        app.eventLogger.logEvent(event1);
        System.out.println(client);
        System.out.println(client1);
        System.out.println(client2);
        Supplier<Event> eventSupplier = () -> con.getBean("event", Event.class);
        app.logEvent(eventSupplier.get(), LoggerType.INFO);
        app.logEvent(eventSupplier.get(), LoggerType.ERROR);
        app.logEvent(eventSupplier.get(), LoggerType.ERROR);
        app.logEvent(eventSupplier.get(), LoggerType.INFO);
        con.close();
    }

    private void logEvent(Event event, LoggerType type) {
        EventLogger logger = loggerMap.get(type);
        logger.logEvent(event);
    }

    public App(Client client, @Qualifier("cacheFileEventLogger") EventLogger logger, @Qualifier("hashMap") Map<LoggerType, EventLogger> loggerMap) {
        this.client = client;
        this.eventLogger = logger;
        this.loggerMap = loggerMap;
    }
}
