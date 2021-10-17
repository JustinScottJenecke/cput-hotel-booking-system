package za.ac.cput.cms.bookingTests.factoryTest.roomTest.deprecated;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Author: Justin Jenecke 215163052
 * Test for CalendarMonthFactory.Class
 * Created: 14/09/2021
 * */

@Deprecated
public class CalendarMonthFactoryTest {}
/*
    //Setting name to name of month might be redundant if id contains
    //month and year, but formats of both are not finalized yet.

    Set <LocalDate> testSet = new HashSet<>();

    @Test
    void buildCalendarMonth() {
        CalendarMonth calendarMonth = new CalendarMonth.Builder()
                .setId("JAN-21")
                .setName("January")
                .setCalenderDates(new HashSet<LocalDate>())
                .build();

        assertEquals("JAN-21", calendarMonth.getId());
        assertEquals("January", calendarMonth.getName());
        assertEquals(testSet, calendarMonth.getCalenderDates());

    }
}
*/