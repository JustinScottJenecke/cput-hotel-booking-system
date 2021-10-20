/*
Name: Sihle Jijana
Student no: 216273919
Due date: 20 October 2021
IContactDetailsRepository.java
 */
package za.ac.cput.cms.booking.repository.guest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.cms.booking.entity.guest.ContactDetails;

import java.util.List;

@Repository
public interface IContactDetailsRepository extends JpaRepository<ContactDetails, String> {
}
