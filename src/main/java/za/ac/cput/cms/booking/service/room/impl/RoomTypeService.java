/**
 * RoomTypeService.java
 * Service for RoomType
 * Author: Kevin Michael Karelse (219000859)
 * Date:13/07/2021
 */


package za.ac.cput.cms.booking.service.room.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.cms.booking.entity.room.RoomType;
import za.ac.cput.cms.booking.repository.room.IRoomTypeRepository;
import za.ac.cput.cms.booking.service.room.IRoomTypeService;

@Service
public class RoomTypeService implements IRoomTypeService {

    @Autowired
    private IRoomTypeRepository roomTypeRepository;

    @Override
    public RoomType create (RoomType roomType) {return this.roomTypeRepository.save(roomType);}

    @Override
    public RoomType read (Integer integer) {return this.roomTypeRepository.findById(integer).orElseGet(null);}

    @Override
    public RoomType update (RoomType roomType) {
        if (this.roomTypeRepository.existsById(roomType.getRoomTypeId()))
            return this.roomTypeRepository.save(roomType);
        return null;
    }

    @Override
    public boolean delete (Integer integer) {
        this.roomTypeRepository.deleteById(integer);
        return !this.roomTypeRepository.existsById(integer);

    }

}
