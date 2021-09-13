package za.ac.cput.cms.booking.entity.room;

public enum RoomDetails {

    FIRST_FLOOR(1, 300.00),
    SECOND_FLOOR(2, 200.00),
    THIRD_FLOOR(3, 200.00),
    TOP_FLOOR(0,450.00);

    private int floor;
    private double cost;

    RoomDetails(int floor, double cost) {
    }

    public int getFloor() {
        return floor;
    }

    public double getCost() {
        return cost;
    }

}
