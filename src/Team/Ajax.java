package Team;

public class Ajax extends FootballTeam{
    private int numberOfVoters;
    public Ajax(){
        super.setCountry("Netherlands");
        super.setName("Ajax");
        super.generateRandomNumberOfCharitableMatches();
    }
}
