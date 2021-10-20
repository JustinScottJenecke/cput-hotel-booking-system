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
        ContactDetails newContactDetails = new ContactDetails.Builder().copy(contactDetails).build();
        return this.contactDetailsService.create(newContactDetails);
    }

    @GetMapping("/read/{id}")
    public ContactDetails read(@PathVariable String id){
        return this.contactDetailsService.read(id);
    }

    @PostMapping("/update")
    public ContactDetails update(@RequestBody ContactDetails contactDetails){
        return contactDetailsService.update(contactDetails);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id){
        return this.contactDetailsService.delete(id);
    }

    @GetMapping("/getAll")
    public List<ContactDetails> getAll(){
        return contactDetailsService.getAll();
    }

}