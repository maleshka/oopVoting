package Team;

public class Paok extends FootballTeam{
    private int numberOfVoters;

    public Paok(){
        super.setCountry("Greek");
        super.setName("Paok");
        super.generateRandomNumberOfCharitableMatches();

    }
}
