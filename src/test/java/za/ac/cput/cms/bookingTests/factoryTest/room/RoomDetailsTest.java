package za.ac.cput.cms.bookingTests.factoryTest.room;

import org.junit.jupiter.api.Test;
import za.ac.cput.cms.booking.entity.room.RoomDetails;

public class RoomDetailsTest {

    RoomDetails roomDetails = RoomDetails.FIRST_FLOOR;

    @Test
    void function() {
        System.out.println(roomDetails.getFloor());
        System.out.println(roomDetails.getCost());
    }

}
