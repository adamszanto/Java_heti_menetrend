package exercise13;

public class Main {
    public static void main(String[] args) {
        BasketballTeam team1 = new BasketballTeam("Lakers", "Los Angeles");
        team1.getNumberOfPlayers();
        team1.printRecord();
        team1.addWin();
        team1.addLoss();
        team1.addWin();

        FootballTeam team2 = new FootballTeam("West Ham United", "London");
        team2.getNumberOfPlayers();
        team2.printRecord();
    }
}
