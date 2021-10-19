package za.ac.cput.cms.booking.service.guest;

import za.ac.cput.cms.booking.entity.guest.ContactDetails;
import za.ac.cput.cms.booking.service.IService;


import java.util.List;


public interface IContactDetailsService extends IService <ContactDetails, String> {
    public List<ContactDetails> getAll();
}
