package za.ac.cput.cms.booking.service.room.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.cms.booking.entity.room.CalendarMonth;
import za.ac.cput.cms.booking.repository.room.ICalendarMonthRepository;
import za.ac.cput.cms.booking.service.room.ICalendarMonthService;

/**
 * Author: Justin Jenecke 215163052
 * Service class exposing repository methods for CalendarMonth.Class
 * Created: 15/09/2021
 * */

@Service
public class CalendarMonthService implements ICalendarMonthService {

    @Autowired
    private ICalendarMonthRepository calendarMonthRepository;

    @Override
    public CalendarMonth create(CalendarMonth calendarMonth) {
        return this.calendarMonthRepository.save(calendarMonth);
    }

    @Override
    public CalendarMonth read(String s) {
        return this.calendarMonthRepository.findById(s).orElseGet(null);
    }

    @Override
    public CalendarMonth update(CalendarMonth calendarMonth) {
        return this.calendarMonthRepository.save(calendarMonth);
    }

    @Override
    public boolean delete(String s) {
        this.calendarMonthRepository.deleteById(s);
        return !this.calendarMonthRepository.existsById(s);
    }
}
