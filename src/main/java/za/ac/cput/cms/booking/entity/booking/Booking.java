package za.ac.cput.cms.booking.entity.booking;

/**
 * Author: Justin Jenecke 215163052
 * POJO Booking.Class
 * Created: 13/09/2021
 * */

import java.time.LocalDate;
import java.util.List;

public class Booking {

    private String bookingId;
    private int room;
    private int guest;
    private List<LocalDate> daysBooked;
    private int cost;

    public Booking(Builder b) {
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

    public List<LocalDate> getDaysBooked() {
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
        private List<LocalDate> daysBooked;
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

        public Builder setDaysBooked(List<LocalDate> daysBooked) {
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
