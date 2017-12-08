import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;


    @Before
    public void before(){
        room = new Room("Wedding Suit", 2);

    }

    @Test
    public void canGetName(){
        assertEquals("Wedding Suit", room.getName());
    }

    @Test
    public void setName(){
        room.setName("Baller Suit");
        assertEquals("Baller Suit", room.getName());

    }

}
