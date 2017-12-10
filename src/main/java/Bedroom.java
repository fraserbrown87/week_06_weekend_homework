public class Bedroom extends Room {

    private int roomNumber;
    private RoomType roomType;
    private RoomValue roomValue;

    public Bedroom(int capacity, int roomNumber, RoomType roomType, RoomValue roomValue) {
        super(capacity);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomValue = roomValue;
    }

    public int getRoomNumber() {
        return roomNumber;
    }


    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public int getValueFromEnum() {
        return this.roomValue.getValue();
    }
}
