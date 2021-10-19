/*
Name: Sihle Jijana
Student no: 216273919
Due date: 20 October 2021
ContactDetailsController.java
 */
package za.ac.cput.cms.booking.controller.guest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.cms.booking.entity.guest.ContactDetails;
import za.ac.cput.cms.booking.factory.guest.ContactDetailsFactory;
import za.ac.cput.cms.booking.service.guest.impl.ContactDetailsService;

import java.util.List;

@RestController
@RequestMapping("/za.ac.cput.hotelbookingservice/api/contactdetails")
public class ContactDetailsController {
    @Autowired
    private ContactDetailsService contactDetailsService;

    @PostMapping("/create")
    public ContactDetails create(@RequestBody ContactDetails contactDetails){
        ContactDetails newContactDetails = ContactDetailsFactory.createContactDetails(
                contactDetails.getContactId(),
                contactDetails.getCellNo(),
                contactDetails.getEmail(),
                contactDetails.getAddress());
        return contactDetailsService.create(newContactDetails);
    }

    @GetMapping("/read")
    public ContactDetails read(@RequestBody ContactDetails contactDetails){
        return contactDetailsService.read(contactDetails.getContactId());
    }

    @PostMapping
    public ContactDetails update(@RequestBody ContactDetails contactDetails){
        return contactDetailsService.update(contactDetails);
    }

    @DeleteMapping("/delete")
    public boolean delete(@PathVariable String contactId){
        return contactDetailsService.delete(contactId);
    }

    @GetMapping("/getAll")
    public List<ContactDetails> getAll(){
        return contactDetailsService.getAll();
    }

}