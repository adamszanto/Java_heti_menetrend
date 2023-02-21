package exercise13;

import java.util.Objects;

public class SportsTeam {
    private final String teamName;
    private final String location;
    private int numberOfPlayers;

    public SportsTeam(String name, String location) {
        this.teamName = name;
        this.location = location;
    }

    public String getTeamName() {
        return teamName;
    }


    public String getLocation() {
        return location;
    }


    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    private void printRecord() {
        System.out.println("Print something interesting that we are proud of.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SportsTeam that = (SportsTeam) o;

        if (numberOfPlayers != that.numberOfPlayers) return false;
        if (!Objects.equals(teamName, that.teamName)) return false;
        return Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        int result = teamName != null ? teamName.hashCode() : 0;
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + numberOfPlayers;
        return result;
    }

    @Override
    public String toString() {
        return "SportsTeam{" +
                "teamName='" + teamName + '\'' +
                ", location='" + location + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                '}';
    }
}
