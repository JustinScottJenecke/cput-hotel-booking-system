package za.ac.cput.cms.bookingTests.factoryTest.guestTest;

import org.junit.jupiter.api.Test;
import za.ac.cput.cms.booking.entity.guest.Guest;
import za.ac.cput.cms.booking.factory.guest.GuestFactory;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Author: Shameel Kiyang 217050743
 * Test for GuestFactory.Class
 * */

class GuestFactoryTest {
@Test
    void creatGuest(){
    Guest guest = GuestFactory.buildGuest(52,64);

    assertEquals(52,guest.getGuestId());
    assertEquals(64,guest.getLogistics());

}

}