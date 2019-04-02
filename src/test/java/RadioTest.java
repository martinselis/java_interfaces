import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    private Radio radio;

    @Before
    public void setup() {
        radio = new Radio("Apple", "123", "Radio 4");
    }

    @Test
    public void canGetMake() {
        assertEquals("Apple", radio.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("123", radio.getModel());
    }

    @Test
    public void canGetStation() {
        assertEquals("Radio 4", radio.getStation());
    }

    @Test
    public void canTuneToStation() {
        radio.tune("Radio 5");
        assertEquals("Radio 5", radio.getStation());
    }

}
