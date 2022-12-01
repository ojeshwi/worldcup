import model.Group;
import model.Players;
import model.Team;

import java.util.ArrayList;

    public class Main {
        public static void main(String[] args) {
            System.out.println("Hello world!");
            ArrayList<String> playerlist = new ArrayList<String>();
            playerlist.add("pranit");
            playerlist.add("yash");
            playerlist.add("john");
            Players player1= new Players("Ram",4,40,4);
            Team team1 = new Team("MMC","light blue & white","first");
            Group group = new Group("A");

            player1.printFormat();;
            team1.printFormat();
            group.printFormat();


        }
    }

