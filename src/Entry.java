import java.util.ArrayList;
import java.util.List;

public class Entry {
    public static void main(String[] args) {
        CricketPlayer cricketPlayer1 = new CricketPlayer("Kohli", 17, 230.00);
        CricketPlayer cricketPlayer2 = new CricketPlayer("Rohit", 18, 250.00);
        CricketPlayer cricketPlayer3 = new CricketPlayer("Pandya", 22, 180.00);
        CricketPlayer cricketPlayer4 = new CricketPlayer("Rajat", 25, 115.00);
        CricketPlayer cricketPlayer5 = new CricketPlayer("Dhoni", 30, 193.00);

        Team<CricketPlayer> cricketTeam = new Team<>("ABC");
        cricketTeam.addPlayer(cricketPlayer1);
        cricketTeam.addPlayer(cricketPlayer2);
        cricketTeam.addPlayer(cricketPlayer3);
        cricketTeam.addPlayer(cricketPlayer4);
        cricketTeam.addPlayer(cricketPlayer5);

        FootballPlayer footballPlayer1 = new FootballPlayer("Gurpreet", 13, 20);
        FootballPlayer footballPlayer2 = new FootballPlayer("David", 15, 30);
        FootballPlayer footballPlayer3 = new FootballPlayer("Sandesh", 20, 40);
        FootballPlayer footballPlayer4 = new FootballPlayer("Rolando", 8, 50);
        FootballPlayer footballPlayer5 = new FootballPlayer("Sunil", 5, 60);

        Team<FootballPlayer> footballTeam = new Team<>("XYZ");
        footballTeam.addPlayer(footballPlayer1);
        footballTeam.addPlayer(footballPlayer2);
        footballTeam.addPlayer(footballPlayer3);
        footballTeam.addPlayer(footballPlayer4);
        footballTeam.addPlayer(footballPlayer5);

        cricketTeam.printPlayersList();
        footballTeam.printPlayersList();

         //Team<String> fruits = new Team<String>("PQR");//it is throwing error bcoz only player type such as which class is
//MMIMP        // inheriting the player class or it's child class then only it is allowed to become a part of team.
//        fruits.addPlayer("apple");
//        fruits.addPlayer("mango");


        List<CricketPlayer> players1 = List.of(cricketPlayer1, cricketPlayer2, cricketPlayer3, cricketPlayer4, cricketPlayer5);
        List<Player> players2 = List.of(footballPlayer1, footballPlayer2, footballPlayer3, footballPlayer4, footballPlayer5);
        List<String> fruits = List.of("Apple","Mango","Grapes");
//        printPlayers(players1);
//        printPlayers(players2);
   //                        printPlayers(fruits);// in these case the code will run but will not print anything and we write the elswe part it will but according to the rule of generics when
        //we create an list of fruits and try to access that at compile time only it should give error for that we have "WILDCARDS CONCEPT" in generics

    }

//MIMP    //Below becomes the concept of method overloading therfore so keep it for understanding purpose else in Industry do not this type
    // of calling because at a time one function is only written.This problem is called Type"ERASURE" and this comes in GENERICS only.

//    public static void printPlayers(List<CricketPlayer> players){
//        for(CricketPlayer player : players){
//            System.out.println(player.getName());
//        }
//    }
//    public static void printPlayers(List<FootballPlayer> players){
//        for(FootballPlayer player : players){
//            System.out.println(player.getName());
//        }
//    }

    //So to make it generic we will be having only one function which is will take the receiving parameter as PLAYER
    //because generics has one rule that whatever the receiving parameter we have recieved same we have to pass as an reference
    //here the rule of inheritance of base and derieved class will not use.

    //public static <T extends Player> void printPlayers(List<T> players) { //We can also give the TYPE T as we have given in class so that
        // it can solve the error which is comiong in "GETNAME".Here the extends will not work it will inly work at class level not at method level.

//        System.out.println("Called");
//        for (T player : players)
            //if (player instanceof Player p) { // we can typecast the player hence it will first fetch all the data
                // and with that reference we will be getting the names of Player.
                //We can't directly call the getname with the generalized object instead we have to compulsalry typecast with instance of then only it will work.
             //   System.out.println(player.getName());
            //}
   // }

//WILDCARDS FOR RESTRICTIONG AT METHOD LEVEL IN GENERICS ABOVE WHEN CALLED  THERE EXPLANATION IS GIVEN.
    //WILDCARD is '?' it used when you have to check the bounds.? means "anyType".
    //If we have to receive single then used wildcard for multiple use T type.
    //public static void printPlayers(List<? extends Player> players)//extends means UPPERBOUND
    //we can only use wildcard here in the parameter only not at other place
    //above extends will restrict the fruit one to run.
//    {
//        for (var player : players)
//            if (player instanceof Player p){
//                System.out.println(p.getName());
//            }
//        else {
//                System.out.println(player);
//            }
//    }

    public static void printPlayers(List<? super Player> players)//super means LOWERBOUND
    {
        for (var player : players)
            if (player instanceof Player p){
                System.out.println(p.getName());
            }
            else {
                System.out.println(player);
            }
    }
}

//Want same type then use List "TYPE" if want different Type then use WILDCARDS.
//List<? extends Player> and <T extends Player> is called Upper Bound. It means to use extends.In "Type" we can only use UpperBound
//Whereas in case of Wildcards means List<? extends Player> this one we can use both UPPER AND LOWER BOUND