import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(2,23);
    }

    @Test
    public void getRoomNumber(){
        assertEquals(23, bedroom.getRoomNumber());
    }
}
