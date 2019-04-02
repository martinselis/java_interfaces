public class Stereo {

    private String name;
    private Radio radio;
    private CDPlayer cdPlayer;
    private RecordDeck recordDeck;
    private int volume;

    public Stereo(String name, Radio radio, CDPlayer cdPlayer, RecordDeck recordDeck) {
        this.name = name;
        this.radio = radio;
        this.cdPlayer = cdPlayer;
        this.recordDeck = recordDeck;
        this.volume = 0;
    }

    public String getName() {
        return this.name;
    }

    public String playRecordDeck() {
        return recordDeck.play();
    }

    public String playCD() {
        return cdPlayer.play();
    }

    public void tuneRadio(String newStation) {
        this.radio.tune(newStation);
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int newVolume) {
        this.volume = newVolume;
    }

}
