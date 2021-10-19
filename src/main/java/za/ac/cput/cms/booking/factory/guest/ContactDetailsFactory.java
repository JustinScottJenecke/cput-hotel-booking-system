/*
Name: Sihle Jijana
Student no: 216273919
Due date: 20 October 2021
ContactDetailsFactory.java
 */
package za.ac.cput.cms.booking.factory.guest;

import za.ac.cput.cms.booking.entity.guest.ContactDetails;

public class ContactDetailsFactory {
    public static ContactDetails createContactDetails(
            String contactId,
            int cellNo,
            String email,
            String address){

        ContactDetails contactDetails = new ContactDetails.Builder()
                .setContactId(contactId)
                .setCellNo(cellNo)
                .setEmail(email)
                .setAddress(address)
                .build();

        return contactDetails;
    }
}
