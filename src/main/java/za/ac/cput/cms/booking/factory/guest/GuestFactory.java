package za.ac.cput.cms.booking.factory.guest;
/**
 * Author: Shameel Kiyang 217050743
 * Factory class for creating instances of Guest.Class
 * Created: 13/10/2021
 * */
import za.ac.cput.cms.booking.entity.guest.Guest;
import za.ac.cput.cms.booking.entity.guest.ContactDetails;


public class GuestFactory {

    public static Guest buildGuest(int guestId,
                                   int logistics,
                                   ContactDetails contactDetails

    ){
        Guest guest = new Guest.Builder().setGuestId(10).setContactDetails(contactDetails).setLogistics(10).build();
        return guest;
    }
}
