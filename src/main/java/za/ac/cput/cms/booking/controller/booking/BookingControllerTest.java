package za.ac.cput.cms.booking.controller.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.cms.booking.entity.booking.Booking;
import za.ac.cput.cms.booking.service.booking.impl.BookingService;

/**
 * Author: Justin Scott Jenecke 215163052
 * REST Controller for exposing business layer of Booking Entity
 * Created: 18/10/2021
 * */

@RestController
@RequestMapping("/za.ac.cput.hotelbookingservice/api/booking")
public class BookingControllerTest {

    @Autowired
    private BookingService bookingService;

    @RequestMapping("")
    public String bookingLanding() {
        return "Landing String for Booking Service requests";
    }

    @PostMapping("/create")
    public Booking createBooking(@RequestBody Booking booking) {

        Booking newBooking = new Booking.Builder().copy(booking).build();
        return this.bookingService.create(newBooking);
    }

    @GetMapping("/read/{id}")
    public Booking readBooking(@PathVariable String id) {
        return this.bookingService.read(id);
    }

    @PutMapping("/update")
    public Booking updateBooking(@RequestBody Booking booking) {

        Booking updatedBooking = new Booking.Builder().copy(booking).build();
        return this.bookingService.update(updatedBooking);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean deleteBooking(@PathVariable String id) {
        return this.bookingService.delete(id);
    }

}

