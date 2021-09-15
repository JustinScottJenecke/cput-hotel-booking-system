package za.ac.cput.cms.booking.entity.room.roomObjects;

/**
 * Author: Justin Jenecke 215163052
 * POJO RoomDetails.ENUM
 * Created: 13/09/2021
 * */

public enum RoomDetails {

    FIRST_FLOOR(1, 300.00),
    SECOND_FLOOR(2, 200.00),
    THIRD_FLOOR(3, 200.00),
    TOP_FLOOR(0,450.00);

    private int floor;
    private double cost;

    RoomDetails(int floor, double cost) {
        this.cost = cost;
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    public double getCost() {
        return cost;
    }

    public static RoomDetails findByFloor(int floorInput) {
        for (RoomDetails detail: RoomDetails.values()) {
            if (detail.floor == floorInput)
                return detail;
        }
        return null;
    }

}
