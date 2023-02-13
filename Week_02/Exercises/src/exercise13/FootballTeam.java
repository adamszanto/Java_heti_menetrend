package exercise13;

public class FootballTeam extends SportsTeam {
    public FootballTeam(String name, String location) {
        super(name, location);
        this.setNumberOfPlayers(11);
    }

    public void printRecord() {
        System.out.println("We hold the goal record of all time.");
    }
}
