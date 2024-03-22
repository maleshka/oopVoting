package Team;

public class ManchesterCity extends FootballTeam{
    private int numberOfVoters;

    public ManchesterCity(){
        super.setCountry("England");
        super.setName("ManchesterCity");
        super.generateRandomNumberOfCharitableMatches();

    }
}
