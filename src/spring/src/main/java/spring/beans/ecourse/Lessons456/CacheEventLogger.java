package spring.beans.ecourse.Lessons456;

import java.io.File;
import java.util.List;

public class CacheEventLogger implements EventLogger {
    int cacheSize;
    List<Event> cache;

    @Override
    public void logEvent(Event event) {
        cache.add(event);
        if (cache.size() == cacheSize) {
            writeEventsFromCache();
            cache.clear();
        }

    }

    private void writeEventsFromCache() {
        File file = new File("cache.txt");

    }

}
