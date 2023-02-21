package exercise14;

import java.util.Objects;

public class Road {
    private final String roadName;
    private final int roadDistance;

    public Road(String roadName, int roadDistance) {
        this.roadName = roadName;
        this.roadDistance = roadDistance;
    }

    public String getRoadName() {
        return roadName;
    }

    public int getRoadDistance() {
        return roadDistance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Road road = (Road) o;

        if (roadDistance != road.roadDistance) return false;
        return Objects.equals(roadName, road.roadName);
    }

    @Override
    public int hashCode() {
        int result = roadName != null ? roadName.hashCode() : 0;
        result = 31 * result + roadDistance;
        return result;
    }

    @Override
    public String toString() {
        return "Road{" +
                "roadName='" + roadName + '\'' +
                ", roadDistance=" + roadDistance +
                '}';
    }
}
