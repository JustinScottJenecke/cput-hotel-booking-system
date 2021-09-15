package za.ac.cput.cms.booking.service.room.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.cms.booking.entity.room.BookingCalendar;
import za.ac.cput.cms.booking.repository.booking.IBookingRepository;
import za.ac.cput.cms.booking.repository.room.IBookingCalendarRepository;
import za.ac.cput.cms.booking.service.room.IBookingCalendarService;

import javax.xml.ws.Action;

/**
 * Author: Justin Jenecke 215163052
 * Service class exposing repository methods for BookingCalendar.Class
 * Created: 15/09/2021
 * */

@Service
public class BookingCalendarService implements IBookingCalendarService {

    @Autowired
    private IBookingCalendarRepository bookingCalendarRepository;

    @Override
    public BookingCalendar create(BookingCalendar bookingCalendar) {
        return this.bookingCalendarRepository.save(bookingCalendar);
    }

    @Override
    public BookingCalendar read(String s) {
        return this.bookingCalendarRepository.findById(s).orElseGet(null);
    }

    @Override
    public BookingCalendar update(BookingCalendar bookingCalendar) {
        return this.bookingCalendarRepository.save(bookingCalendar);
    }

    @Override
    public boolean delete(String s) {
        this.bookingCalendarRepository.deleteById(s);
        return !this.bookingCalendarRepository.existsById(s);
    }
}
