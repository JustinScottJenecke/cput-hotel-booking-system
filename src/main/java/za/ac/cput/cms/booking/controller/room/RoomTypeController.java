/**
 * RoomTypeController.java
 * Controller for RoomType
 * Author: Kevin Michael Karelse (219000859)
 * Date:13/07/2021
 */

package za.ac.cput.cms.booking.controller.room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.cms.booking.entity.room.RoomType;
import za.ac.cput.cms.booking.factory.room.RoomTypeFactory;
import za.ac.cput.cms.booking.service.room.impl.RoomTypeService;

@RestController
@RequestMapping("/za.ac.cput.hotelbookingservice/api/roomType")
public class RoomTypeController {

    @Autowired
    private RoomTypeService roomTypeService;

    @RequestMapping("")
    public String roomTypeLanding() {return "Landing String for RoomType Service requests";}

    @PostMapping("create")
    public RoomType createRoomType(@RequestBody RoomType roomType) {
        RoomType newRoomType = new RoomType.Builder().copy(roomType).build();
        return this.roomTypeService.create(newRoomType);
    }

    @GetMapping("read/{id}")
    public RoomType readRoomType(@PathVariable int id) {return this.roomTypeService.read(id);}

    @PostMapping("/update")
    public RoomType updateRoomType(@RequestBody RoomType roomType) {

        RoomType updatedRoomType = new RoomType.Builder().copy(roomType).build();
        return this.roomTypeService.update(updatedRoomType);}

    @DeleteMapping("/delete/{id}")
    public boolean deleteRoomType(@PathVariable int id) {return this.roomTypeService.delete(id);}



}
