package za.ac.cput.cms.booking.entity.guest;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import za.ac.cput.cms.booking.entity.guest.ContactDetails;
/**
 * Author: Shameel Kiyang 217050743
 * POJO Guest.Class
 * Created: 13/10/2021
 * */
@Entity
public class Guest {
    @Id
    private int guestId;

    private int logistics;
    //@OneToOne
    private ContactDetails contactDetails;

    protected Guest(){}

    private Guest(Builder b){
        this.guestId= b.guestId;
        this.logistics=b.logistics;
        this.contactDetails=b.contactDetails;
    }

    public int getGuestId() {
        return guestId;
    }

    public int getLogistics() {
        return logistics;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "guestId=" + guestId +
                ", logistics=" + logistics +
                ", contactDetails=" + contactDetails +
                '}';
    }

    public static class Builder{
        private int guestId;

        private int logistics;
        private ContactDetails contactDetails;

        public Builder setGuestId(int guestId) {
            this.guestId = guestId;
            return this;
        }

        public Builder setLogistics(int logistics) {
            this.logistics = logistics;
            return this;
        }

        public Builder setContactDetails(ContactDetails contactDetails) {
            this.contactDetails = contactDetails;
            return this;
        }
        public Builder copy(Guest g){
            this.guestId= g.guestId;
            this.logistics=g.logistics;
            this.contactDetails=g.contactDetails;
            return this;
        }
        public Guest build(){return new Guest(this);}
    }
}
