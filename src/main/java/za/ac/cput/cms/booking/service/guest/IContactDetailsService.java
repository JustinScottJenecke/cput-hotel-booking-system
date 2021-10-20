/*
Name: Sihle Jijana
Student no: 216273919
Due date: 20 October 2021
IContactDetailsService.java
 */
package za.ac.cput.cms.booking.service.guest;

import za.ac.cput.cms.booking.entity.guest.ContactDetails;
import za.ac.cput.cms.booking.service.IService;


import java.util.List;


public interface IContactDetailsService extends IService <ContactDetails, String> {
    public List<ContactDetails> getAll();
}
