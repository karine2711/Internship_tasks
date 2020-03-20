package spring.beans.ecourse.Lessons456;

import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CacheFileEventLogger extends FileEventLogger {
    int cacheSize=3;

    List<Event> cache=new ArrayList<>();

    @Override
    public void logEvent(Event event) {
        System.out.println("Event cached");
        cache.add(event);
        if (cache.size() == cacheSize) {
            System.out.println("Cache Full");
            writeEventsFromCache();
            cache.clear();
        }

    }

    private void writeEventsFromCache() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ecourse/lessons45.xml");
        FileEventLogger logger = context.getBean("fileLogger", FileEventLogger.class);
        for (Event event : cache) {
            logger.logEvent(event);
        }

    }

    private void destroy(){
        System.out.println("Destroy method is called");
        if(!cache.isEmpty()){
            writeEventsFromCache();
        }
    }
}
