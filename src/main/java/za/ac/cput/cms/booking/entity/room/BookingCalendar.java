package za.ac.cput.cms.booking.entity.room;

import java.util.List;

public class BookingCalendar {

    private String id;
    private List<CalendarMonth> calendarMonths;

    protected BookingCalendar() {
    }

    private BookingCalendar(Builder b) {
        this.id = b.id;
        this.calendarMonths = b.calendarMonths;
    }

    public String getId() {
        return id;
    }

    public List<CalendarMonth> getCalendarMonths() {
        return calendarMonths;
    }

    @Override
    public String toString() {
        return "BookingCalendar{" +
                "id='" + id + '\'' +
                ", calendarMonths=" + calendarMonths +
                '}';
    }

    public static class Builder {

        private String id;
        private List<CalendarMonth> calendarMonths;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setCalendarMonths(List<CalendarMonth> calendarMonths) {
            this.calendarMonths = calendarMonths;
            return this;
        }

        public Builder copy(BookingCalendar c) {
            this.id = c.id;
            this.calendarMonths = c.calendarMonths;
            return this;
        }

        public BookingCalendar build() {
            return new BookingCalendar(this);
        }
    }
}
