package za.ac.cput.cms.bookingTests.factoryTest.roomTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.cms.booking.entity.room.Room;
import za.ac.cput.cms.booking.entity.room.roomObjects.RoomDetails;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Author: Justin Jenecke 215163052
 * Test for RoomFactory.Class
 * Created: 14/09/2021
 * */

public class RoomFactoryTest {

    Set<LocalDate> bookingCalendar;

    @BeforeEach
    void setup() {

         bookingCalendar = new HashSet<>();
    }

    @Test
    void buildRoom() {

        //Must be initialized if using this method
        // Alternative code in case of RunTimeError: Null Pointer Exception
        RoomDetails details = RoomDetails.findByFloor(2);

        Room room = new Room.Builder()
                .setRoomNo(101)
                .setBedType(null)
                .setRoomType(5)
                .setRoomDetails(details) // OR setRoomDetails(RoomDetails.findByFloor(2))
                .setBookingCalendar(bookingCalendar)
                .setCost(1000 + details.getCost()) // OR setRoomDetails(RoomDetails.findByFloor(2).getCost())
                .build();

        //Make sure details exist at floor of integer value(2)
        //Can throw null pointer exception

        assertNotNull(details);
        assertEquals(101, room.getRoomNo());
        assertEquals(null, room.getBedType());
        assertEquals(5, room.getRoomType());
        assertEquals(RoomDetails.SECOND_FLOOR,room.getRoomDetails());
        assertEquals(bookingCalendar, room.getBookingCalendar());
        assertEquals(1200, room.getCost());

    }

}
