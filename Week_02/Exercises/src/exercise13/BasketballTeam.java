package exercise13;

public class BasketballTeam extends SportsTeam{
    private int wins;
    private int losses;
    private int games;
    public BasketballTeam(String name, String location) {
        super(name, location);
        this.setNumberOfPlayers(5);
        this.wins = 0;
        this.losses = 0;
        this.games = 0;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public void addWin() {
        this.wins++;
        this.games++;
    }

    public void addLoss() {
        this.losses++;
        this.games++;
    }

    public void printRecord() {
        System.out.println("We have the best basketball player in the world with 820 points.");
    }
}
