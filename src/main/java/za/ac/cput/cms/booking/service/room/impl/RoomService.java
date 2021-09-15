package za.ac.cput.cms.booking.service.room.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.cms.booking.entity.room.Room;
import za.ac.cput.cms.booking.repository.room.IRoomRepository;
import za.ac.cput.cms.booking.service.room.IRoomService;

/**
 * Author: Justin Jenecke 215163052
 * Service class exposing repository methods for Room.Class
 * Created: 15/09/2021
 * */

@Service
public class RoomService implements IRoomService {

    @Autowired
    private IRoomRepository roomRepository;

    @Override
    public Room create(Room room) {
        return this.roomRepository.save(room);
    }

    @Override
    public Room read(Integer integer) {
        return this.roomRepository.findById(integer).orElseGet(null);
    }

    @Override
    public Room update(Room room) {
        return this.roomRepository.save(room);
    }

    @Override
    public boolean delete(Integer integer) {
        this.roomRepository.deleteById(integer);
        return !this.roomRepository.existsById(integer);
    }
}
