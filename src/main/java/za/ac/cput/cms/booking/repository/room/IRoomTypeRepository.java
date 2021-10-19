/**
 * IRoomTypeRepository.java
 * Repository interface for RoomType
 * Author: Kevin Michael Karelse (219000859)
 * Date:13/07/2021
 */

package za.ac.cput.cms.booking.repository.room;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.cms.booking.entity.room.RoomType;

@Repository
public interface IRoomTypeRepository extends JpaRepository <RoomType, Integer> {

}
