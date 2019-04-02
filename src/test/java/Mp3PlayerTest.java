import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Mp3PlayerTest {

    private Stereo stereo;
    private MP3Player mp3Player;

    @Before
    public void setup() {
        Radio radio = new Radio("Apple", "123", "Radio 4");
        CDPlayer cdPlayer = new CDPlayer("Apple", "123", 1);
        RecordDeck recordDeck = new RecordDeck("Apple", "123", 5);
        stereo = new Stereo("Stereo 1", radio, cdPlayer, recordDeck);

        mp3Player = new MP3Player();
    }

    @Test
    public void canConnect() {
        assertEquals("Stereo 1", mp3Player.connect(stereo));
    }
}
