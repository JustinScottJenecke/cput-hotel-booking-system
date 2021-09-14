package za.ac.cput.cms.booking.factory.room;

import za.ac.cput.cms.booking.entity.room.BookingCalendar;
import za.ac.cput.cms.booking.entity.room.CalendarMonth;

import java.util.ArrayList;

/**
 * Author: Justin Jenecke 215163052
 * Factory class for creating instances of BookingCalendar.Class
 * Created: 14/09/2021
 * */

public class BookingCalendarFactory {

    public static BookingCalendar buildBookingCalendar(String id, ArrayList<CalendarMonth> calendarMonths) {

        BookingCalendar bookingCalendar = new BookingCalendar.Builder()
                .setId(id)
                .setCalendarMonths(calendarMonths)
                .build();

        return bookingCalendar;
    }

}
