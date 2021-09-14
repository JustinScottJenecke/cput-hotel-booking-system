package za.ac.cput.cms.bookingTests.factoryTest.room;

import org.junit.jupiter.api.Test;
import za.ac.cput.cms.booking.entity.room.BookingCalendar;
import za.ac.cput.cms.booking.entity.room.CalendarMonth;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Author: Justin Jenecke 215163052
 * Test for BookingCalendarFactory.Class
 * Created: 14/09/2021
 * */

public class BookingCalendarFactoryTest {

    List<CalendarMonth> testData = new ArrayList<>();

    @Test
    void buildBookingCalendar() {

        BookingCalendar bookingCalendar = new BookingCalendar.Builder()
                .setId("SHA-2")
                .setCalendarMonths(new ArrayList<CalendarMonth>())
                .build();

        assertEquals("SHA-2",bookingCalendar.getId());
        assertEquals(testData,bookingCalendar.getCalendarMonths());

    }
}
