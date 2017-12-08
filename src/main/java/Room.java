import java.util.ArrayList;

public class Room {

    private String name;
    private int capacity;
    private ArrayList<Guest> guests;

    public Room(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
}
