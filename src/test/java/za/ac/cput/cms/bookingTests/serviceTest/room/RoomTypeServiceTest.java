package za.ac.cput.cms.bookingTests.serviceTest.room;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.cms.booking.entity.room.RoomType;
import za.ac.cput.cms.booking.factory.room.RoomTypeFactory;
import za.ac.cput.cms.booking.service.room.impl.RoomTypeService;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class RoomTypeServiceTest {
    @Autowired
    private RoomTypeService service;

    private static RoomType roomType = RoomTypeFactory.createRoomType(
            251,
            "Single",
            100.00);

    @Test
    void create() {
        RoomType created = service.create(roomType);
        assertEquals(created.getRoomTypeId(), roomType.getRoomTypeId());
        System.out.println(created);

    }




}