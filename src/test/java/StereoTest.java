import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    private Stereo stereo;
    private Radio radio;
    private CDPlayer cdPlayer;
    private RecordDeck recordDeck;

    @Before
    public void setup() {
        radio = new Radio("Apple", "123", "Radio 4");
        cdPlayer = new CDPlayer("Apple", "123", 1);
        recordDeck = new RecordDeck("Apple", "123", 5);
        stereo = new Stereo("Stereo 1", radio, cdPlayer, recordDeck);
    }

    @Test
    public void canGetName() {
        assertEquals("Stereo 1", stereo.getName());
    }

    @Test
    public void canPlayRecord() {
        assertEquals("Playing record", stereo.playRecordDeck());
    }

    @Test
    public void canPlayCD() {
        assertEquals("Play CD", stereo.playCD());
    }

    @Test
    public void canTuneRadio() {
        stereo.tuneRadio("Radio 5");
        assertEquals("Radio 5", radio.getStation());
    }

    @Test
    public void canGetVolume() {
        assertEquals(0, stereo.getVolume());
    }

    @Test
    public void canSetVolume() {
        stereo.setVolume(10);
        assertEquals(10, stereo.getVolume());
    }

}
