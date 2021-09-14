package za.ac.cput.cms.bookingTests.factoryTest.enumTest;

/**
 * Author: Justin Jenecke 215163052
 * Test for RoomDetails.ENUM and other enums used in project
 * Created: 14/09/2021
 * */


import org.junit.jupiter.api.Test;
import za.ac.cput.cms.booking.entity.room.RoomDetails;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RoomDetailsTest {

    RoomDetails roomDetails = RoomDetails.FIRST_FLOOR;

    @Test
    void functionality() {

        assertEquals(1,roomDetails.getFloor());
        assertEquals(300.00,roomDetails.getCost());
    }

    @Test
    void exist() {

        boolean valid = false;

        if (RoomDetails.findByFloor(1) == roomDetails) {
            valid = true;
        }

        assertTrue(valid);
    }

}
