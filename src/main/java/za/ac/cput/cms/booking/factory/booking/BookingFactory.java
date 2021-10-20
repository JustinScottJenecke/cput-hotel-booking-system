package za.ac.cput.cms.booking.factory.booking;

import za.ac.cput.cms.booking.entity.booking.Booking;
import za.ac.cput.cms.booking.entity.guest.Guest;
import za.ac.cput.cms.booking.entity.room.Room;

import java.time.LocalDate;
import java.util.Set;

/**
 * Author: Justin Jenecke 215163052
 * Factory class for creating instances of Booking.Class
 * Created: 14/09/2021
 * */

public class BookingFactory {

    public static Booking buildBooking(String bookingId, Room room, Guest guest, Set<LocalDate>daysBooked, int baseCost) {

        Booking booking = new Booking.Builder()
                .setBookingId(bookingId)
                .setRoom(room)
                .setGuest(guest)
                .setDaysBooked(daysBooked)
                .setCost(baseCost)
                .build();

        return booking;
    }

}
