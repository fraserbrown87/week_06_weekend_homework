import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;


    @Before
    public void before(){
        room = new Room(2);

    }

    @Test
    public void canGetCapacity(){
        assertEquals(2, room.getCapacity());
    }

    @Test
    public void setCapacity(){
        room.setCapacity(4);
        assertEquals(4, room.getCapacity());
    }

}
