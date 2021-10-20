package za.ac.cput.cms.bookingTests.serviceTest.guest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.cms.booking.entity.guest.Guest;
import za.ac.cput.cms.booking.factory.guest.GuestFactory;
import za.ac.cput.cms.booking.service.guest.impl.GuestService;

import static org.junit.jupiter.api.Assertions.*;

public class GuestServiceTest {
 @Autowired
 private  GuestService guestService;

 private static Guest guest = GuestFactory.buildGuest(25,35);

 @Test
    void create(){
     Guest newGuest = guestService.create(guest);
     assertEquals(newGuest.getGuestId(),guest.getGuestId());
     //System.out.println(newGuest);
 }


}