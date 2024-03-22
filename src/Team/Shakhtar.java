package Team;

public class Shakhtar extends FootballTeam{
    private int numberOfVoters;

    public Shakhtar(){
        super.setCountry("Ukraine");
        super.setName("Shakhtar");
        super.generateRandomNumberOfCharitableMatches();
    }
}
