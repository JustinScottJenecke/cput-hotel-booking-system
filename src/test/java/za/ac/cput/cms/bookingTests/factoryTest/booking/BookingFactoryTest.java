package za.ac.cput.cms.bookingTests.factoryTest.booking;

import org.junit.jupiter.api.Test;
import za.ac.cput.cms.booking.entity.booking.Booking;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Author: Justin Jenecke 215163052
 * Test for BookingFactory.Class
 * Booking is an aggregate and cannot be instantiated without a Room and a Guest
 * Created: 14/09/2021
 * */

public class BookingFactoryTest {

    List <LocalDate> testDataList = new ArrayList<>();

    @Test
    void buildBooking() {

        List<LocalDate> stayDuration = new ArrayList<>();

        Booking booking = new Booking.Builder()
                .setBookingId("SHA-2-b")
                .setRoom(2)
                .setGuest(2)
                .setDaysBooked(stayDuration)
                .setCost(2000 * stayDuration.size())
                .build();

        assertEquals("SHA-2-b",booking.getBookingId());
        assertEquals(2,booking.getRoom());
        assertEquals(2,booking.getGuest());
        assertEquals(testDataList,booking.getDaysBooked());
        assertEquals(0,booking.getCost());
    }
}
