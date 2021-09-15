package za.ac.cput.cms.booking.repository.room;

/**
 * Author: Justin Jenecke 215163052
 * Repository interface for persisting CalendarMonth.Class
 * Created: 15/09/2021
 * */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.cms.booking.entity.room.CalendarMonth;

@Repository
public interface ICalendarMonthRepository extends JpaRepository <CalendarMonth, String> {
}
