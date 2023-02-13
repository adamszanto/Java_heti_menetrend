package exercise13;

public class SportsTeam {
    private String teamName;
    private String location;
    private int numberOfPlayers;

    public SportsTeam(String name, String location) {
        this.teamName = name;
        this.location = location;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
}
