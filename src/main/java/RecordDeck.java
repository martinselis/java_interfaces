public class RecordDeck extends Component implements IPlay {

    private int playSpeeds;

    public RecordDeck(String make, String model, int playSpeed) {
        super(make, model);
        this.playSpeeds = playSpeed;
    }

    public int getPlaySpeed() {
        return this.playSpeeds;
    }

    public void changePlaySpeed(int speed) {
        this.playSpeeds = speed;
    }

    public String play() {
        return "Playing record";
    }
}
