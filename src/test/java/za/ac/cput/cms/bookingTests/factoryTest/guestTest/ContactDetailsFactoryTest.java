package za.ac.cput.cms.bookingTests.factoryTest.guestTest;

import org.junit.jupiter.api.Test;
import za.ac.cput.cms.booking.entity.guest.ContactDetails;
import za.ac.cput.cms.booking.factory.guest.ContactDetailsFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactDetailsFactoryTest {
    @Test
    public void createContactDetails(){
        ContactDetails contactDetails = ContactDetailsFactory.createContactDetails(
                "A223",
                623669990,
                "administrator@business.com",
                "Camps Bay");

        assertEquals("A223", contactDetails.getContactId());
        assertEquals(623669990, contactDetails.getCellNo());
        assertEquals("administrator@business.com", contactDetails.getEmail());
        assertEquals("Camps Bay", contactDetails.getAddress());
    }
}
