package za.ac.cput.cms.booking.controller.guest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.cms.booking.entity.guest.Guest;
import za.ac.cput.cms.booking.service.guest.impl.GuestService;
/**
 * Author: Shameel Kiyang 217050743
 * REST Controller for exposing business layer of Guest Entity
 * Created: 18/10/2021
 * */

@RestController
@RequestMapping("/za.ac.cput.hotelbookingservice/api/guest")
public class GuestController {

    @Autowired
    private GuestService guestService;

    @RequestMapping("")
    public String guestLanding() {
        return "Landing String for Guest Service requests";
    }

    @PostMapping("/create")
    public Guest createGuest(@RequestBody Guest guest){

        Guest newGuest = new Guest.Builder().copy(guest).build();
        return this.guestService.create(newGuest);
    }

    @GetMapping("/read/{id}")
    public Guest readGuest(@PathVariable int id) {
        return this.guestService.read(id);
    }

    @PutMapping("/update")
    public Guest updateGuest(@RequestBody Guest guest) {

        Guest updatedGuest = new Guest.Builder().copy(guest).build();
        return this.guestService.update(updatedGuest);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean deleteGuest(@PathVariable int id) {
        return this.guestService.delete(id);
    }
}
