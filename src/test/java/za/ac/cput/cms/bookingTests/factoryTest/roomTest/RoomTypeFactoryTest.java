/**
 * RoomTypeFactoryTest.java
 * Factory Test for RoomType
 * Author: Kevin Michael Karelse (219000859)
 * Date:13/07/2021
 */

package za.ac.cput.cms.bookingTests.factoryTest.roomTest;

import org.junit.jupiter.api.Test;
import za.ac.cput.cms.booking.entity.room.RoomType;
import za.ac.cput.cms.booking.factory.room.RoomTypeFactory;

import static org.junit.jupiter.api.Assertions.*;

class RoomTypeFactoryTest {

    @Test
    public void createRoomType() {
        RoomType roomType = RoomTypeFactory.createRoomType(
                1925489,
                "Single-Bedroom",
                500);

        assertEquals(1925489, roomType.getRoomTypeId());
        assertEquals("Single-Bedroom", roomType.getType());
        assertEquals(500, roomType.getCost());

        System.out.println(roomType);
    }


}