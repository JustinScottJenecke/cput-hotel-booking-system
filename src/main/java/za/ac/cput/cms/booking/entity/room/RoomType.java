/**
 * RoomType.java
 * Entity for RoomType
 * Author: Kevin Michael Karelse (219000859)
 * Date:13/07/2021
 */

package za.ac.cput.cms.booking.entity.room;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RoomType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roomTypeId;

    private String type;
    private double cost;


    protected RoomType() {}

    private RoomType(Builder builder) {
        this.roomTypeId = builder.roomTypeId;
        this.type = builder.type;
        this.cost = builder.cost;

    }

    public int getRoomTypeId() {
        return roomTypeId;
    }

    public String getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "RoomType{" +
                "roomTypeId=" + roomTypeId +
                ", type='" + type + '\'' +
                ", cost=" + cost +
                '}';
    }

    public static class Builder {

        private int roomTypeId;
        private String type;
        private double cost;

        public Builder setRoomTypeId(int roomTypeId) {
            this.roomTypeId = roomTypeId;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setCost(double cost) {
            this.cost = cost;
            return this;
        }

        public RoomType build() {
            return new RoomType(this);
        }

        public Builder copy (RoomType roomType) {
            this.roomTypeId = roomType.roomTypeId;
            this.type = roomType.type;
            this.cost = roomType.cost;

            return this;

        }

    }
}
