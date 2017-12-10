import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PatronTest {

    Patron patrons;

    @Before
    public void before(){
        patrons = new Patron("Basil Fawlty", 300);
    }

    @Test canGetName(){
        assertEquals("Basil Fawlty", patrons.getName())
    }
    

    @Test canGetWallet(){
        assertEquals(300, patrons.getWallet())
    }
}
