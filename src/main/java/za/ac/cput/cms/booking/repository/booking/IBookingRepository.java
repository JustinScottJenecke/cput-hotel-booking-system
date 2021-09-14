package za.ac.cput.cms.booking.repository.booking;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.cms.booking.entity.booking.Booking;

public interface IBookingRepository extends JpaRepository <Booking, String> {
}
