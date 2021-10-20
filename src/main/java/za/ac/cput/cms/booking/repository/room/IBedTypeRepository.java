package za.ac.cput.cms.booking.repository.room;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.cms.booking.entity.room.BedType;

@Repository
public interface IBedTypeRepository extends JpaRepository <BedType, String> {
}
