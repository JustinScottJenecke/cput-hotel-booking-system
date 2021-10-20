package za.ac.cput.cms.booking.entity.booking;

/**
 * Author: Justin Jenecke 215163052
 * POJO Booking.Class
 * Created: 13/09/2021
 * */

import org.apache.tomcat.jni.Local;
import za.ac.cput.cms.booking.entity.guest.Guest;
import za.ac.cput.cms.booking.entity.room.Room;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Booking {

    @Id
    private String bookingId;

    @ManyToOne
    private Room room;

    @ManyToOne
    private Guest guest;

    @ElementCollection
    private Set <LocalDate> daysBooked;

    private int cost;

    protected Booking(){}

    private Booking(Builder b) {
        this.bookingId = b.bookingId;
        this.room = b.room;
        this.guest = b.guest;
        this.daysBooked = b.daysBooked;
        this.cost = b.cost;
    }

    public String getBookingId() {
        return bookingId;
    }

    public Room getRoom() {
        return room;
    }

    public Guest getGuest() {
        return guest;
    }

    public Set<LocalDate> getDaysBooked() {
        return daysBooked;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", room=" + room +
                ", guest=" + guest +
                ", daysBooked=" + daysBooked +
                ", cost=" + cost +
                '}';
    }

    public static class Builder {

        private String bookingId;
        private Room room;
        private Guest guest;
        private Set <LocalDate> daysBooked;
        private int cost;

        public Builder setBookingId(String bookingId) {
            this.bookingId = bookingId;
            return this;
        }

        public Builder setRoom(Room room) {
            this.room = room;
            return this;
        }

        public Builder setGuest(Guest guest) {
            this.guest = guest;
            return this;
        }

        public Builder setDaysBooked(Set<LocalDate> daysBooked) {
            this.daysBooked = daysBooked;
            return this;
        }

        public Builder setCost(int cost) {
            this.cost = cost;
            return this;
        }

        public Builder copy(Booking bk) {
            this.bookingId = bk.bookingId;
            this.room = bk.room;
            this.guest = bk.guest;
            this.daysBooked = bk.daysBooked;
            this.cost = bk.cost;
            return this;
        }

        public Booking build() {
            return new Booking(this);
        }
    }
}
