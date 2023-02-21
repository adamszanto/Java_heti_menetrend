package exercise14;

import java.util.Objects;

public class Stop {
    private final String stopName;


    public Stop(String stopName) {
        this.stopName = stopName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stop stop = (Stop) o;

        return Objects.equals(stopName, stop.stopName);
    }

    @Override
    public int hashCode() {
        return stopName != null ? stopName.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Stop{" +
                "stopName='" + stopName + '\'' +
                '}';
    }
}
