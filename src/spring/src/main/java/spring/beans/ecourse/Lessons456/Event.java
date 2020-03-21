package spring.beans.ecourse.Lessons456;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.sql.Time;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

@Component
@Scope("prototype")
public class Event {
    Date date;
    DateFormat df = DateFormat.getDateTimeInstance();

    @Autowired
    public Event(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Event{" +
                "date=" + date +
                ", df=" + df +
                '}' + this.hashCode();
    }

    public static boolean isDay() {
        LocalDateTime date = LocalDateTime.now();
        int hour = date.getHour();
        return hour > 8 && hour < 17;
    }
}
