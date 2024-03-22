package Team;

import java.util.ArrayList;
import java.util.Random;

public class FootballTeam {
    private String name;
    private String country;
    private ArrayList<Player> players;
    private int numberOfCharitableMatchesPlayed;
    private int europeanLeagueWins;
    private int worldCupWins;


    public void generateRandomNumberOfCharitableMatches(){
        int count;

        Random random = new Random();

        count = random.nextInt(100);
        this.numberOfCharitableMatchesPlayed = count;

        count = random.nextInt(15);
        this.worldCupWins = count;

        count = random.nextInt(35);
        this.setEuropeanLeagueWins(count);
    }

    public int getWorldCupWins() {
        return worldCupWins;
    }

    public void setWorldCupWins(int worldCupWins) {
        this.worldCupWins = worldCupWins;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfCharitableMatchesPlayed() {
        return numberOfCharitableMatchesPlayed;
    }

    public void setNumberOfCharitableMatchesPlayed(int numberOfCharitableMatchesPlayed) {
        this.numberOfCharitableMatchesPlayed = numberOfCharitableMatchesPlayed;
    }

    public int getEuropeanLeagueWins() {
        return europeanLeagueWins;
    }

    public void setEuropeanLeagueWins(int europeanLeagueWins) {
        this.europeanLeagueWins = europeanLeagueWins;
    }
}


