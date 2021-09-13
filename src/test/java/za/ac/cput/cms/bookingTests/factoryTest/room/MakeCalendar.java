package za.ac.cput.cms.bookingTests.factoryTest.room;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class MakeCalendar {

    @Test
    void initBookCalender() {

        LocalDate today = LocalDate.now();
        int availDates = today.lengthOfMonth();

        int [] bookCalender = new int [availDates];

    }

    /**
     *
     *  BookingCalender
     *      int : id
     *      ArrayList : Months
     *
     *  Month
     *      int : id
     *      Set<LocalDate> : dates
     *
     * */

}
