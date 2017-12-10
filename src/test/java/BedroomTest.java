import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import org.junit.*;


public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(2,23, RoomType.DOUBLE, RoomValue.MEDIUM);
    }

    @Test
    public void getRoomNumber(){
        assertEquals(23, bedroom.getRoomNumber());
    }

    @Test
    public void getRoomType(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void setRoomType(){
        bedroom.setRoomType(RoomType.SINGLE);
        assertEquals(RoomType.SINGLE, bedroom.getRoomType());
    }

    @Test
    public void doubleHasValue200(){
        assertEquals(200, bedroom.getValueFromEnum());
    }
}
