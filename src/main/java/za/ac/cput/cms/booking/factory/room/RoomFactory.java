package za.ac.cput.cms.booking.factory.room;

import za.ac.cput.cms.booking.entity.room.Room;
import za.ac.cput.cms.booking.entity.room.roomObjects.RoomDetails;

import java.time.LocalDate;
import java.util.Set;

/**
 * Author: Justin Jenecke 215163052
 * Factory class for creating instances of Room.Class
 * Created: 14/09/2021
 * */

public class RoomFactory {

    public static Room buildRoom(int id,
                                 int bedType,
                                 int roomType,
                                 RoomDetails roomDetails,
                                 Set<LocalDate> bookingCalendar,
                                 int cost) {

        Room room = new Room.Builder()
                .setRoomNo(101)
                .setBedType(null)
                .setRoomType(5)
                .setRoomDetails(roomDetails)
                .setBookingCalendar(bookingCalendar)
                .setCost(cost)
                .build();

        return room;
    }

}

