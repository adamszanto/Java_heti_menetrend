package exercise14;

public class BusStop extends Stop {
    private boolean isRainProof;

    public BusStop(String stopName, boolean isRainProof) {
        super(stopName);
        this.isRainProof = isRainProof;
    }
}
