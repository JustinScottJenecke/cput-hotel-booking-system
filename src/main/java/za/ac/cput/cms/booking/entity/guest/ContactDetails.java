/*
Name: Sihle Jijana
Student no: 216273919
Due date: 20 October 2021
ContactDetails.java
 */
package za.ac.cput.cms.booking.entity.guest;

public class ContactDetails {
    private int contactId;
    private int cellNo;
    private String email;
    private String address;

    private ContactDetails(){

    }

    private ContactDetails(Builder b){
        this.contactId = b.contactId;
        this.cellNo = b.cellNo;
        this.email = b.email;
        this.address = b.address;
    }

    public int getContactId() {
        return contactId;
    }
    public int getCellNo(){
        return cellNo;
    }
    public String getEmail(){
        return email;
    }
    public String getAddress(){
        return address;
    }

    @Override
    public String toString() {
        return "ContactDetails{" +
                "contactId=" + contactId +
                ", cellNo=" + cellNo +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder{
        private int contactId;
        private int cellNo;
        private String email;
        private String address;

        public Builder setContactId(int contactId){
            this.contactId = contactId;
            return this;
        }

        public Builder setCellNo(int cellNo){
            this.cellNo = cellNo;
            return this;
        }

        public Builder setEmail(String email){
            this.email = email;
            return this;
        }

        public Builder setAddress(String address){
            this.address = address;
            return this;
        }

        public ContactDetails build(){
            return new ContactDetails(this);
        }

        public Builder copy (ContactDetails c){
            this.contactId = c.contactId;
            this.cellNo = c.cellNo;
            this.email = c.email;
            this.address = c.address;
            return this;
        }
    }
}
