package za.ac.cput.cms.booking.entity.room;

import za.ac.cput.cms.booking.entity.room.roomObjects.RoomDetails;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

/**
 * Author: Justin Jenecke 215163052
 * POJO Room.Class
 * Created: 13/09/2021
 * */

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roomNo;

    @ManyToOne
    @JoinColumn
    private BedType bedType;

    private int roomType;

    @Enumerated
    private RoomDetails roomDetails;

    private double cost;

    @ElementCollection
    private Set<LocalDate> bookingCalendar;

    protected Room(){}

    private Room(Builder b) {
        this.roomNo = b.roomNo;
        this.bedType = b.bedType;
        this.roomType = b.roomType;
        this.roomDetails = b.roomDetails;
        this.bookingCalendar = b.bookingCalendar;
        this.cost = b.cost;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public BedType getBedType() {
        return bedType;
    }

    public int getRoomType() {
        return roomType;
    }

    public RoomDetails getRoomDetails() {
        return roomDetails;
    }

    public Set<LocalDate> getBookingCalendar() {
        return bookingCalendar;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNo=" + roomNo +
                ", bedType=" + bedType +
                ", roomType=" + roomType +
                ", roomDetails=" + roomDetails +
                ", bookingCalendar=" + bookingCalendar +
                ", cost=" + cost +
                '}';
    }

    public static class Builder{

        private int roomNo;
        private BedType bedType;
        private int roomType;
        private RoomDetails roomDetails;
        private Set<LocalDate> bookingCalendar;
        private double cost;

        public Builder setRoomNo(int roomNo) {
            this.roomNo = roomNo;
            return this;
        }

        public Builder setBedType(BedType bedType) {
            this.bedType = bedType;
            return this;
        }

        public Builder setRoomType(int roomType) {
            this.roomType = roomType;
            return this;
        }

        public Builder setRoomDetails(RoomDetails roomDetails) {
            this.roomDetails = roomDetails;
            return this;
        }

        public Builder setBookingCalendar(Set<LocalDate> bookingCalendar) {
            this.bookingCalendar = bookingCalendar;
            return this;
        }

        public Builder setCost(double cost) {
            this.cost = cost;
            return this;
        }

        public Builder copy(Room r){
            this.roomNo = r.roomNo;
            this.bedType = r.bedType;
            this.roomType = r.roomType;
            this.roomDetails = r.roomDetails;
            this.bookingCalendar = r.bookingCalendar;
            this.cost = r.cost;
            return this;

        }

        public Room build(){
            return new Room(this);
        }

    }
}
