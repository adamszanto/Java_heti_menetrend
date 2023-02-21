package exercise14;

public class TrainStop {
    private final int numberOfRailwayTracks;

    public TrainStop(int numberOfRailwayTracks) {
        this.numberOfRailwayTracks = numberOfRailwayTracks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrainStop trainStop = (TrainStop) o;

        return numberOfRailwayTracks == trainStop.numberOfRailwayTracks;
    }

    @Override
    public int hashCode() {
        return numberOfRailwayTracks;
    }

    @Override
    public String toString() {
        return "TrainStop{" +
                "numberOfRailwayTracks=" + numberOfRailwayTracks +
                '}';
    }
}
