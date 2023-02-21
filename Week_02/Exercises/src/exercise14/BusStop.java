package exercise14;

public class BusStop extends Stop {
    private final boolean isRainProof;

    public BusStop(String stopName, boolean isRainProof) {
        super(stopName);
        this.isRainProof = isRainProof;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        BusStop busStop = (BusStop) o;

        return isRainProof == busStop.isRainProof;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (isRainProof ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BusStop{" +
                "isRainProof=" + isRainProof +
                '}';
    }
}
