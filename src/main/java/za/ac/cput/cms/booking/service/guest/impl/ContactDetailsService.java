package za.ac.cput.cms.booking.service.guest.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.cms.booking.entity.guest.ContactDetails;
import za.ac.cput.cms.booking.repository.guest.IContactDetailsRepository;
import za.ac.cput.cms.booking.service.guest.IContactDetailsService;

import java.util.List;

@Service
public class ContactDetailsService implements IContactDetailsService {
//    private static ContactDetailsService contactDetailsService = null;

    @Autowired
    private IContactDetailsRepository contactDetailsRepository;

    @Override
    public ContactDetails create(ContactDetails contactDetails){
        return this.contactDetailsRepository.save(contactDetails);
    }

    @Override
    public ContactDetails read(String contactId){
        return this.contactDetailsRepository.findById(contactId).orElse(null);
    }

    @Override
    public ContactDetails update(ContactDetails contactDetails){
        return this.contactDetailsRepository.save(contactDetails);
    }

    @Override
    public boolean delete(String contactId){
        this.contactDetailsRepository.deleteById(contactId);
        if(this.contactDetailsRepository.existsById(contactId))
            return false;
        else
            return true;
    }

    @Override
    public List<ContactDetails> getAll() {
        return this.contactDetailsRepository.findAll();
    }
}