package exercise13;

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
}
