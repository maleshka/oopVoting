package Team;

public class Liverpool extends FootballTeam{
    private int numberOfVoters;

    public Liverpool(){
        super.setCountry("England");
        super.setName("Liverpool");
        super.generateRandomNumberOfCharitableMatches();
    }
}
