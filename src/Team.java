import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> //this extends is not defining the inheritance else it telling that the 'T' Type
    //should be the type of class player or its Derieved(Child) class.And now which one will be of type player will be allowed
        // other method such as type<string><integer> will not allowed.
{

    private String TeamName;
    private List<T> players;

    public Team(String teamName) {
        this.TeamName = teamName;
        this.players = new ArrayList<>();
    }

    public void addPlayer(T player){
        players.add(player);
    }

    public void printPlayersList(){
        for(T player : players){
            System.out.println(player);
        }
    }

}
