import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    public RecordDeck recordDeck;

    @Before
    public void setup() {
        recordDeck = new RecordDeck("Apple", "123", 5);
    }

    @Test
    public void hasMake() {
        assertEquals("Apple", recordDeck.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("123", recordDeck.getModel());
    }

    @Test
    public void canGetPlaySpeed() {
        assertEquals(5, recordDeck.getPlaySpeed());
    }

    @Test
    public void canSetPlaySpeed() {
        recordDeck.changePlaySpeed(10);
        assertEquals(10, recordDeck.getPlaySpeed());
    }

    @Test
    public void canPlay() {
        assertEquals("Playing record", recordDeck.play());
    }
}
