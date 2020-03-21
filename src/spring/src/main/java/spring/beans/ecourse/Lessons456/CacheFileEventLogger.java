package spring.beans.ecourse.Lessons456;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component("cacheFileEventLogger")
public class CacheFileEventLogger extends FileEventLogger {

    int cacheSize = 3;
    List<Event> cache = new ArrayList<>();

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
        ApplicationContext context = new ClassPathXmlApplicationContext("ecourse/lessons456.xml");

        for (Event event : cache) {
            super.logEvent(event);
        }

    }

  //  @PreDestroy
    private void destroy() {
        System.out.println("Destroy method is called");
        if (!cache.isEmpty()) {
            writeEventsFromCache();
        }
    }

}
