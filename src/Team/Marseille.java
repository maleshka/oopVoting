package Team;

public class Marseille extends FootballTeam{
    private int numberOfVoters;

    public Marseille(){
        super.setCountry("France");
        super.setName("Marseille");
        super.generateRandomNumberOfCharitableMatches();

    }
}
