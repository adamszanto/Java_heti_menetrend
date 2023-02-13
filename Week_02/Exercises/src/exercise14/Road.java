package exercise14;

public class Road {
    private String roadName;
    private int roadDistance;

    public Road(String roadName, int roadDistance) {
        this.roadName = roadName;
        this.roadDistance = roadDistance;
    }

    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName;
    }

    public int getRoadDistance() {
        return roadDistance;
    }

    public void setRoadDistance(int roadDistance) {
        this.roadDistance = roadDistance;
    }
}
