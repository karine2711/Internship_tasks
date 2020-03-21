package spring.beans.ecourse.Lessons123;

import org.springframework.stereotype.Component;
import spring.beans.ecourse.Lessons456.Event;
import spring.beans.ecourse.Lessons456.EventLogger;

@Component("consoleEventLogger")
public class ConsoleEventLogger implements EventLogger {

    @Override
    public void logEvent(Event event) {
        System.out.println(event);
    }

}
