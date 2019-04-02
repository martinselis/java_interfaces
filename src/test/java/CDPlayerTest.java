import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    private CDPlayer cdPlayer;

    @Before
    public void setup() {
        cdPlayer = new CDPlayer("Apple", "123", 1);
    }

    @Test
    public void canGetMake() {
        assertEquals("Apple", cdPlayer.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("123", cdPlayer.getModel());
    }

    @Test
    public void canGetNumberOfCDs() {
        assertEquals(1, cdPlayer.getNumberOfCDs());
    }

    @Test
    public void canPlay() {
        assertEquals("Play CD", cdPlayer.play());
    }
}
