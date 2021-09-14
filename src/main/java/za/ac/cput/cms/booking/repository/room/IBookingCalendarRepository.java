package za.ac.cput.cms.booking.repository.room;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.cms.booking.entity.room.BookingCalendar;

public interface IBookingCalendarRepository extends JpaRepository <BookingCalendar, String> {
}
