package spring.beans.ecourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import spring.beans.ecourse.Lessons123.ConsoleEventLogger;
import spring.beans.ecourse.Lessons456.CacheFileEventLogger;
import spring.beans.ecourse.Lessons456.EventLogger;
import spring.beans.ecourse.Lessons789.CombinedEventLogger;
import spring.beans.ecourse.Lessons789.LoggerType;

import java.util.*;

@Configuration
public class AppConfig {

    @Bean("name")
    public String string() {
        return "John Smith";
    }

    @Bean
    @Scope("prototype")
    public Date date() {
        return new Date();
    }

    @Bean
    public List list() {
        List<EventLogger> loggerList = new ArrayList();
        loggerList.add(new ConsoleEventLogger());
        loggerList.add(new CacheFileEventLogger());
        return loggerList;
    }

    @Bean("hashMap")
    public Map hashMap() {
        Map<LoggerType, EventLogger> loggerMap = new HashMap<>();
        loggerMap.put(LoggerType.INFO, new ConsoleEventLogger());
        loggerMap.put(LoggerType.ERROR, new CombinedEventLogger(list()));
        return loggerMap;
    }



}