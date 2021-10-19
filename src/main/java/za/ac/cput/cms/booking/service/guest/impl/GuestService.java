package za.ac.cput.cms.booking.service.guest.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.cms.booking.entity.guest.Guest;
import za.ac.cput.cms.booking.repository.guest.IGuestRepository;
import za.ac.cput.cms.booking.service.guest.IGuestService;
/**
 * Author: Shameel Kiyang 217050743
 * Service class for exposing repository methods, and business logic for Guest.Class
 * Created: 15/09/2021
 * */
@Service
public class GuestService implements IGuestService {

    @Autowired
    private IGuestRepository guestRepository;

    @Override
    public Guest create(Guest guest)  {return this.guestRepository.save(guest);}

    @Override
    public Guest read(Integer integer) { return this.guestRepository.findById(integer).orElseGet(null); }

    @Override public Guest update(Guest guest) { return this.guestRepository.save(guest);}

    @Override
    public boolean delete(Integer integer) { this.guestRepository.deleteById(integer);return !this.guestRepository.existsById(integer); }


}
