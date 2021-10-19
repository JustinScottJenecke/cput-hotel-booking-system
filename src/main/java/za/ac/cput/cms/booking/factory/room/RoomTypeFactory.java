/**
 * RoomTypeFactory.java
 * Entity for RoomTypeFactory
 * Author: Kevin Michael Karelse (219000859)
 * Date:13/07/2021
 */


package za.ac.cput.cms.booking.factory.room;

import za.ac.cput.cms.booking.entity.room.RoomType;

public class RoomTypeFactory {

    public static RoomType createRoomType(
            int roomTypeId,
            String type,
            double cost)

    {
        RoomType roomType = new RoomType.Builder()
                .setRoomTypeId(roomTypeId)
                .setType(type)
                .setCost(cost)
                .build();

        return roomType;
    }


}
