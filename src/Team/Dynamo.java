package Team;

public class Dynamo extends FootballTeam{
    private int numberOfVoters;

    public Dynamo(){
        super.setCountry("Ukraine");
        super.setName("Dynamo");
        super.generateRandomNumberOfCharitableMatches();
    }
}