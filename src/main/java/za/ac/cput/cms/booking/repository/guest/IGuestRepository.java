package za.ac.cput.cms.booking.repository.guest;
/**
 * Author: Shameel Kiyang 217050743
 * Repository interface for persisting Guest.Class
 * Created: 13/10/2021
 * */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.cms.booking.entity.guest.Guest;

@Repository
public interface IGuestRepository extends JpaRepository<Guest,Integer> {
}
