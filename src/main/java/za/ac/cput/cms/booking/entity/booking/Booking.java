package za.ac.cput.cms.booking.entity.booking;

/**
 * Author: Justin Jenecke 215163052
 * POJO Booking.Class
 * Created: 13/09/2021
 * */

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Booking {

    @Id
    private String bookingId;

    private int room;
    private int guest;
    private int daysBooked;
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

    public int getRoom() {
        return room;
    }

    public int getGuest() {
        return guest;
    }

    public int getDaysBooked() {
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
        private int room;
        private int guest;
        private int daysBooked;
        private int cost;

        public Builder setBookingId(String bookingId) {
            this.bookingId = bookingId;
            return this;
        }

        public Builder setRoom(int room) {
            this.room = room;
            return this;
        }

        public Builder setGuest(int guest) {
            this.guest = guest;
            return this;
        }

        public Builder setDaysBooked(int daysBooked) {
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
