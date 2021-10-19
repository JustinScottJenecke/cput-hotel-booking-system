package za.ac.cput.cms.booking.controller.room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.cms.booking.entity.room.Room;
import za.ac.cput.cms.booking.service.room.impl.RoomService;

/**
 * Author: Justin Scott Jenecke 215163052
 * REST Controller for exposing business layer of Room Entity
 * Created: 18/10/2021
 * */

@RestController
@RequestMapping("/za.ac.cput.hotelbookingservice/api/room")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @RequestMapping("")
    public String roomLanding() {
        return "Landing String for Room Service requests";
    }

    @PostMapping("/create")
    public Room createRoom(@RequestBody Room room) {

        Room newRoom = new Room.Builder().copy(room).build();
        return this.roomService.create(newRoom);
    }

    @GetMapping("/read/{id}")
    public Room readRoom(@PathVariable int id) {
        return this.roomService.read(id);
    }

    @PutMapping("/update")
    public Room updateRoom(@RequestBody Room room) {

        Room updatedRoom = new Room.Builder().copy(room).build();
        return this.roomService.update(updatedRoom);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteRoom(@PathVariable int id) {
        return this.roomService.delete(id);
    }

}