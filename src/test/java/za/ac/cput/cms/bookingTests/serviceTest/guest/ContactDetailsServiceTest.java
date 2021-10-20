package za.ac.cput.cms.bookingTests.serviceTest.guest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.cms.booking.entity.guest.ContactDetails;
import za.ac.cput.cms.booking.factory.guest.ContactDetailsFactory;
import za.ac.cput.cms.booking.service.guest.impl.ContactDetailsService;

import static org.junit.jupiter.api.Assertions.*;

//@SpringBootTest
public class ContactDetailsServiceTest {
    @Autowired
    private ContactDetailsService contactDetailsService;

    private static ContactDetails contactDetails = ContactDetailsFactory.createContactDetails(
            "GH2BB",
            798104474,
            "testing@gmail.co.za",
            "Rondebosch");

    @Test
    void create(){
        ContactDetails newContactDetails = contactDetailsService.create(contactDetails);
        assertEquals(newContactDetails.getContactId(), contactDetails.getContactId());
        System.out.println("Create: " + newContactDetails);
    }

    @Test
    void read(){
        ContactDetails readContactDetails = contactDetailsService.read("GH2BB");
        assertEquals(contactDetails.getContactId(), readContactDetails.getContactId());
        System.out.println("Read: " + readContactDetails.toString());
    }

    @Test
    void update(){
        ContactDetails oldContactDetails = contactDetailsService.read("GH2BB");
        ContactDetails newContactDetails = new ContactDetails.Builder().copy(oldContactDetails).setContactId("A43C").build();
        assertNotNull(contactDetailsService.update(newContactDetails));
        System.out.println("Update: " + newContactDetails);
    }

    @Test
    void delete(){
        boolean deleted = contactDetailsService.delete("GH2BB");
        assertTrue(deleted);
        System.out.println("Delete: " + deleted);
    }

    @Test
    void getAll(){
        System.out.println("Show all: ");
        System.out.println(contactDetailsService.getAll());
    }
}
