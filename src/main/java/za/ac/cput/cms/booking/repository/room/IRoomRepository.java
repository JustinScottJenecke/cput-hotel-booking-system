package za.ac.cput.cms.booking.repository.room;

/**
 * Author: Justin Jenecke 215163052
 * Repository interface for persisting Room.Class
 * Created: 15/09/2021
 * */

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.cms.booking.entity.room.Room;

public interface IRoomRepository extends JpaRepository <Room, Integer> {
}
