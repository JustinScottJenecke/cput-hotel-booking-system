package za.ac.cput.cms.booking.entity.room;

/**
 * Author: Justin Scott Jenecke
 * Description: Room Context class for holding all Room related entities in single RequestBody object
 * Date: 18/10/2021
 * */

public class RoomContext {

    private Room room;
    int roomDetails;
    int bedType;
    int roomType;

    public RoomContext(Room room, int roomDetails, int bedType, int roomType) {
        this.room = room;
        this.roomDetails = roomDetails;
        this.bedType = bedType;
        this.roomType = roomType;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getRoomDetails() {
        return roomDetails;
    }

    public void setRoomDetails(int roomDetails) {
        this.roomDetails = roomDetails;
    }

    public int getBedType() {
        return bedType;
    }

    public void setBedType(int bedType) {
        this.bedType = bedType;
    }

    public int getRoomType() {
        return roomType;
    }

    public void setRoomType(int roomType) {
        this.roomType = roomType;
    }

    @Override
    public String toString() {
        return "RoomContext{" +
                "room=" + room +
                ", roomDetails=" + roomDetails +
                ", bedType=" + bedType +
                ", roomType=" + roomType +
                '}';
    }
}
