package Team;

public class RealMadrid extends FootballTeam{
    private int numberOfVoters;

    public RealMadrid(){
        super.setCountry("Spain");
        super.setName("RealMadrid");
        super.generateRandomNumberOfCharitableMatches();

    }
}