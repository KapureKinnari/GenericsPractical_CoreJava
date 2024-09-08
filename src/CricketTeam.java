//import java.util.ArrayList;
//import java.util.List;
//
//public class CricketTeam {
//
//    private String TeamName;
//    private List<CricketPlayer> players; //This is an reference not an object.Because in java
//    // object is made with the "NEW" Keyword.
//
//    public CricketTeam(String teamName) {
//
//        this.TeamName = teamName;
//        this.players = new ArrayList<>();
//        //Above we made is the reference and here we have made the object
//        //and we receive it in Base class and object will be of the Derieved class.
//        //And according to the rule we can't make the obj. of interface as list is an interface
//        // but we can make the object of class therefore we have made the obj. of Arraylist Or LinkedList as it is an class.
//        //References are made at the class level but it's objects are made at Constructor level.
//
//    }
//
//    public void addPlayer(CricketPlayer cplayer){
//        players.add(cplayer);
//    }
//
//    public void printPlayersList(){
//        for( CricketPlayer cplayer : players){
//            System.out.println(cplayer);
//        }
//    }
//}
