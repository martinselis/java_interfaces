public class Radio extends Component {

    private String radioStation;

    public Radio(String make, String model, String station) {
        super(make, model);
        this.radioStation = station;
    }

    public String getStation() {
        return this.radioStation;
    }

    public void tune(String newStation){
        this.radioStation = newStation;
    }


}
