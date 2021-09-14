package za.ac.cput.cms.booking.factory.booking;

import za.ac.cput.cms.booking.entity.booking.Booking;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: Justin Jenecke 215163052
 * Factory class for creating instances of Booking.Class
 * Created: 14/09/2021
 * */

public class BookingFactory {

    public Booking buildBooking(String bookingId, int room, int guest, int baseCost) {

        Booking booking = new Booking.Builder()
                .setBookingId(bookingId)
                .setRoom(room)
                .setGuest(guest)
                .setDaysBooked(new ArrayList<LocalDate>())
                .setCost(baseCost)
                .build();

        return booking;
    }

}
