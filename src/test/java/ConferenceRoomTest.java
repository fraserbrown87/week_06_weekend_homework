import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceroom;

    @Before
    public void before(){
        conferenceroom = new ConferenceRoom(100, "Ballers Room");
    }

    @Test
    public void getRoomName(){
        assertEquals("Ballers Room", conferenceroom.getRoomName());
    }

    @Test
    public void setRoomName(){
        conferenceroom.setRoomName("Scientology Room");
        assertEquals("Scientology Room", conferenceroom.getRoomName());
    }

}
