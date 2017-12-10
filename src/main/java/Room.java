import java.util.ArrayList;

public class Room {

    private int capacity;
    private ArrayList<Patron> guests;

    public Room(int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPatronCount(){
        return this.guests.size();
    }

    public void addPatron(Patron patron) {
        this.guests.add(patron);
    }

    public void removePatron(Patron patron) {
        this.guests.remove(patron);
    }
}
