public class Bedroom extends Room {

    private int roomNumber;
    private String roomType;

    public Bedroom(int capacity, int roomNumber, String roomType) {
        super(capacity);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
}
