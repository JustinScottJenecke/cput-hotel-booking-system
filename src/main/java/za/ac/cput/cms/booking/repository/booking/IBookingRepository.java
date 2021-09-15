package za.ac.cput.cms.booking.repository.booking;

/**
 * Author: Justin Jenecke 215163052
 * Repository interface for persisting Booking.Class
 * Created: 15/09/2021
 * */

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.cms.booking.entity.booking.Booking;

public interface IBookingRepository extends JpaRepository <Booking, String> {
}
