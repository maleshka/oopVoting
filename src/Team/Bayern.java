package Team;

public class Bayern extends FootballTeam{
    private int numberOfVoters;

    public Bayern(){
        super.setCountry("Germany");
        super.setName("Bayern");
        super.generateRandomNumberOfCharitableMatches();
    }
}
