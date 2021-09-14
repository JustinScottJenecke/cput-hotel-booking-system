package za.ac.cput.cms.booking.repository.room;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.cms.booking.entity.room.CalendarMonth;

public interface ICalendarMonthRepository extends JpaRepository <CalendarMonth, String> {
}
