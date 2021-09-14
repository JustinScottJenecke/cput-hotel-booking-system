package za.ac.cput.cms.booking.factory.room;

import za.ac.cput.cms.booking.entity.room.CalendarMonth;

import java.time.LocalDate;
import java.util.HashSet;

/**
 * Author: Justin Jenecke 215163052
 * Factory class for creating instances of CalendarMonth.Class
 * Created: 14/09/2021
 * */

public class CalendarMonthFactory {

    public static CalendarMonth buildCalendarMonth(String id, String name, HashSet<LocalDate> calendarDates) {

        CalendarMonth calendarMonth = new CalendarMonth.Builder()
                .setId(id)
                .setName(name)
                .setCalenderDates(calendarDates)
                .build();

        return calendarMonth;
    }

}
