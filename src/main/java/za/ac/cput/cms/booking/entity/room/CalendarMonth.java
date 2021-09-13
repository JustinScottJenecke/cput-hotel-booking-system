package za.ac.cput.cms.booking.entity.room;

/**
 * Author: Justin Jenecke 215163052
 * POJO CalendarMonth.Class
 * Created: 13/09/2021
 * */


import java.time.LocalDate;
import java.util.Set;

public class CalendarMonth {

    private String id;
    private String name;
    private Set <LocalDate> calenderDates;

    protected CalendarMonth(){}

    private CalendarMonth(Builder b) {
        this.id = b.id;
        this.name = b.name;
        this.calenderDates = b.calenderDates;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<LocalDate> getCalenderDates() {
        return calenderDates;
    }

    public static class Builder {

        private String id;
        private String name;
        private Set <LocalDate> calenderDates;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setCalenderDates(Set<LocalDate> calenderDates) {
            this.calenderDates = calenderDates;
            return this;
        }

        public Builder copy(CalendarMonth c) {
            this.id = c.id;
            this.name = c.name;
            this.calenderDates = c.calenderDates;
            return this;
        }

        public CalendarMonth build() {
            return new CalendarMonth(this);
        }
    }
}
