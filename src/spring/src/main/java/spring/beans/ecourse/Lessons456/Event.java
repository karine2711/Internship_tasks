package spring.beans.ecourse.Lessons456;

import java.text.DateFormat;
import java.util.Date;

public class Event {
    Date date;
    DateFormat df;

    public Event(Date date, DateFormat df) {
        this.date=date;
        this.df=df;
    }

    @Override
    public String toString() {
        return "Event{" +
                "date=" + date +
                ", df=" + df +
                '}';
    }
}
