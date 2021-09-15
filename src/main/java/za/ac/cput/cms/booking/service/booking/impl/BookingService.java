package za.ac.cput.cms.booking.service.booking.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.cms.booking.entity.booking.Booking;
import za.ac.cput.cms.booking.repository.booking.IBookingRepository;
import za.ac.cput.cms.booking.service.booking.IBookingService;

/**
 * Author: Justin Jenecke 215163052
 * Service exposing repository methods for Booking.Class
 * Created: 15/09/2021
 * */
@Service
public class BookingService implements IBookingService {

    @Autowired
    private IBookingRepository bookingRepository;

    @Override
    public Booking create(Booking booking) {
        return this.bookingRepository.save(booking);
    }

    @Override
    public Booking read(String id) {
        return this.bookingRepository.findById(id).orElseGet(null);
    }

    @Override
    public Booking update(Booking booking) {
        return this.bookingRepository.save(booking);
    }

    @Override
    public boolean delete(String id) {
        this.bookingRepository.deleteById(id);
        return !this.bookingRepository.existsById(id);
    }
}
