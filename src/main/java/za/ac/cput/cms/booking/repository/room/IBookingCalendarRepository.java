package za.ac.cput.cms.booking.repository.room;

/**
 * Author: Justin Jenecke 215163052
 * Repository interface for persisting BookingCalendar.Class
 * Created: 15/09/2021
 * */

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.cms.booking.entity.room.BookingCalendar;

public interface IBookingCalendarRepository extends JpaRepository <BookingCalendar, String> {
}
