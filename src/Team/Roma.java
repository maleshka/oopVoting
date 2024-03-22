package Team;

public class Roma extends FootballTeam{
    private int numberOfVoters;

    public Roma(){
        super.setCountry("Italian");
        super.setName("Roma");
        super.generateRandomNumberOfCharitableMatches();

    }
}
